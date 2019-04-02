public class Data implements Cloneable, Comparable<Data>
{
    private int dia, mes, ano;
  //private boolean feriado;

    private static boolean bissexto (int ano)
    {
        if (ano%400==0)
            return true;

        if (ano%4==0 && ano%100!=0)
            return true;

        return false;
    }

    private static boolean valida (int dia, int mes, int ano)
    {
        if (dia<1 || dia>31)
            return false;

        if (mes<1 || mes>12)
            return false;

        if ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)
            return false;

        if (dia>29 && mes==2)
            return false;

        if (dia>28 && mes==2 && !Data.bissexto(ano))
            return false;

        return true;
    }

    public Data (int dia, int mes, int ano) throws Exception
    {
        if (!Data.valida(dia,mes,ano))
            throw new Exception ("Data invalida");

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia (int dia) throws Exception
    {
        if (!Data.valida(dia,this.mes,this.ano))
            throw new Exception ("Data invalida");

        this.dia=dia;
    }

    public void setMes (int mes) throws Exception
    {
        if (!Data.valida(this.dia,mes,this.ano))
            throw new Exception ("Data invalida");

        this.mes=mes;
    }

    public void setAno (int ano) throws Exception
    {
        if (!Data.valida(this.dia,this.mes,ano))
            throw new Exception ("Data invalida");

        this.ano=ano;
    }
    /*
    public void setFeriado (boolean feriado)
    {
        this.feriado = feriado;
    }
    */
    public int getDia ()
    {
        return this.dia;
    }

    public int getMes ()
    {
        return this.mes;
    }

    public int getAno ()
    {
        return this.ano;
    }
    /*
    public boolean isFeriado ()
    {
        return this.feriado;
    }
    */
    // solucao conservadora, pois nao crio data sem saber que é valida
    // solucao "gastona", pois valida 2 vezes, para fazer new e no contrutor quando ja fez new
    public Data diaSeguinte ()
    {
         Data ret=null;

         try
         {
             if (Data.valida(this.dia+1,this.mes,this.ano))
                 ret = new Data (this.dia+1,this.mes,this.ano);
             else
                 if (Data.valida(1,this.mes+1,this.ano))
                     ret = new Data (1,this.mes+1,this.ano);
                 else
                     ret = new Data (1,1,this.ano+1);
         }
         catch (Exception erro)
         {} // sei que nao vai dar erro

         return ret;
    }

    // solucao ousada, pois vai tentando criar datas que talvez estejam erradas e
    // no tratamento das excecoes, faz novas tentativas que tambem podem estar erradas
    // solucao economica, pois nao valido antes de criar new Data; confio na excecao
    // que o new Data me der
    public Data diaAnterior ()
    {
        Data ret = null;

        try {
         ret = new Data (this.dia-1,this.mes,this.ano);
        }
        catch (Exception a) {
         try {
          ret = new Data (31,this.mes-1,this.ano);
         }
         catch (Exception b) {
          try {
           ret = new Data (30,this.mes-1,this.ano);
          }
          catch (Exception c) {
           try {
            ret = new Data (29,this.mes-1,this.ano);
           }
           catch (Exception d) {
            try {
             ret = new Data (28,this.mes-1,this.ano);
            }
            catch (Exception e) {
             try {
              ret = new Data (31,12,this.ano-1);
             }
             catch (Exception f)
             {} // sei que nao vai dar erro
            }
           }
          }
         }
        }
        return ret;
    }

    // 1 dos 3 métodos obrigatorios SEMPRE
    public String toString ()
    {
        return (this.dia<10?"0":"")+
               this.dia+
               "/"+
               (this.mes<10?"0":"")+
               this.mes+
               "/"+
               (this.ano<0?-this.ano:this.ano)+
               (this.ano<0?"AC":"");
    }

    // 1 dos 3 métodos obrigatorios SEMPRE
    // aqui, comparamos this e obj
    public boolean equals (Data obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

      //if (!(obj instanceof Data))
      //if (Data.CLASS      != obj.getClass())
        if (this.getClass() != obj.getClass())
            return false;
        /*
        if (this.dia != ((Data)obj).dia ||
            this.mes != ((Data)obj).mes ||
            this.ano != ((Data)obj).ano)
            return false;
        */
        Data data = (Data)obj;

        if (this.dia != data.dia ||
            this.mes != data.mes ||
            this.ano != data.ano)
            return false;

        return true;
    }

    // 1 dos 3 métodos obrigatorios SEMPRE
    // hashCodes sao numeros naturais
    public int hashCode ()
    {
        int ret = 1/*qquer nro, menos zero*/;

        ret = ret*2/*um nro primo qquer*/ + new Integer(this.dia).hashCode();
        ret = ret*2/*um nro primo qquer*/ + new Integer(this.mes).hashCode();
        ret = ret*2/*um nro primo qquer*/ + new Integer(this.ano).hashCode();

        return ret<0?-ret:ret;
    }

    // 1 dos 2 métodos obrigatorios FREQUENTEMENTE
    public Data (Data modelo) throws Exception
    {
        if (modelo==null)
             throw new Exception ("Modelo ausente");

        this.dia = modelo.dia;
        this.mes = modelo.mes;
        this.ano = modelo.ano;
    }

    // 1 dos 2 métodos obrigatorios FREQUENTEMENTE
    public Object clone ()
    {
        Data ret=null;

        try
        {
            ret = new Data (this);
        }
        catch (Exception erro)
        {} // sei que nao vai dar erro

        return ret;
    }
    // os 2 metodos acima sao inseparaveis; estao
    // os 2 presentes ou os 2 ausentes em uma classe.
    // fazemos os 2 metodos acima, quando a classe
    // tiver metodos alem do(s) construtor(es) que
    // alteram atributos do this.
    // quando os 2 metodos nao forem obrigatorios,
    // eles serao PROIBIDOS.

    // 1 dos 1 metodos obrigatorios RARAMENTE
    // compara this e o parametro recebido
    // se this vem antes do parametro (this é
    // menor que o parametro), retorna um inteiro
    // negativo
    // se this vem depois do parametro (this é
    // maior que o parametro), retorna um inteiro
    // positivo
    // se this nao vem antes nem depois do parametro
    // (this nao é menor nem maior que o parametro,
    // O THIS É IGUAL AO PARAMETRO) retorna zero
    // NUUUNCAA o compareTo pode entrar em conflito
    // com o equals
    public int compareTo (Data data)
    {
        if (this.ano<data.ano)
            return -666;

        if (this.ano>data.ano)
            return  666;

        if (this.mes<data.mes)
            return -666;

        if (this.mes>data.mes)
            return  666;

        if (this.dia<data.dia)
            return -666;

        if (this.dia>data.dia)
            return  666;

        return 0;
    }
    // fazemos o metodo acima, quando for possivel
    // encontrar um criterio de comparacao que nos
    // permita comparar 2 objetos da classe e ter
    // APENAS 3 possiveis resultados, MENOR, MAIOR
    // ou IGUAL.
    // quando o metodo nao for obrigatorio, ele
    // será PROIBIDO.
}
class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String txt) throws Exception
    {
        if (txt == null || txt.equals(""))
            throw new Exception ("Tentativa de criar palavra a partir do nada");

        this.texto = txt;
    }

    public int getQuantidadeDaLetra (char ltr)
    {
        // percorre o String this.texto, conta e retorna
        // quantas letras iguais a ltr existem nele
    }

    public int getPosicaoDeOcorrenciaDaLetra (int ord, char ltr) throws Exception
    {
        // se ord==0, retorna a posicao em que ocorre
        // a primeira aparicao de ltr em this.texto;
        // se ord==1, retorna a posicao em que ocorre
        // a segunda aparicao de ltr em this.texto.
        // se ord==2, retorna a posicao em que ocorre
        // a terceira aparicao de ltr em this.texto;
        // e assim por diante.
        // lançar excecao caso nao encontre
        // a ltr procurada.
    }

    public int getTamanho ()
    {
        return this.texto.length();
    }

    public String toString ()
    {
        return this.texto;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public int compareTo (Palavra p)
    {
        return this.texto.compareTo (p.texto);
    }
}
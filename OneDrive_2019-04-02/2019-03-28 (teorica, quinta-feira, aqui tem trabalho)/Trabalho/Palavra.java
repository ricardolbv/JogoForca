class Palavra implements Comparable<Palavra>
{
    private String texto;

    public Palavra (String txt) throws Exception
    {
        if (txt == null || txt.equals(""))
            throw new Exception ("Tentativa de criar palavra a partir do nada");

        this.texto = txt;
    }

    public int getQuantidadeDaLetra (char ltr) // TESTE: Pass
    {
		int qtd = 0;
		
		for (int i =0; i < this.texto.length(); i ++)
		{
			if (this.texto.charAt(i) == ltr)
				qtd ++;
		}
		
		return qtd;
    }

    public int getPosicaoDeOcorrenciaDaLetra (int ord, char ltr) throws Exception //TESTE: Pass
    {
		int pos = 0, contador = ord;
		
		
		for (int i =0; i < this.texto.length(); i ++)
		{
			pos ++;
			if (this.texto.charAt(i) == ltr)
			{
				contador --;
				if (contador < 0)
				return pos;
			}
		}
		throw new Exception ("Letra nao encontrada!");
        // se ord==0, retorna a posicao em que socorre
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

    public boolean equals (Object obj)//Teste: Pass
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass() != this.getClass())
			return false;
		
		Palavra teste = (Palavra)obj;
		
		if (this.texto.equals(teste.texto))
			return true;
		
		return false;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()//Teste: Pass
    {
		
		int ret = 1;
		
		ret = ret * 2 + new String(this.texto).hashCode();
		
		return ret;
    }

    public int compareTo (Palavra p)
    {
        return this.texto.compareTo (p.texto);
    }
}
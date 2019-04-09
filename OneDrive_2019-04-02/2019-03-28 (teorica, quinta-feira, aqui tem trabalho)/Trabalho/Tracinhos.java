class Tracinhos implements Cloneable
{
    private char texto [];

    public Tracinhos (int qtd) throws Exception
    {
        if (qtd<=0)
            throw new Exception ("Tentativa de criar palavra com quantidade de letras invalida!");

        this.texto = new char [qtd];

        for (int i=0; i<qtd; i++)
            this.texto[i] = '_';
    }

    public void desvele (int pos, char ltr) throws Exception
    {
        if (pos<0 || pos>=texto.length) 
            throw new Exception ("Tentativa de substituir letra em posicao inexistente!");

        this.texto[pos] = ltr;
    }

    public boolean isComTracinhosAinda () //Teste PASS
    {
		     // percorrer o vetor de char this.texto e verificar
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
		int i = 0;
		
		for (i=0; i<this.texto.length ; i++)
		{
			if (this.texto[i] == '_')
				return true;
		}
		return false;
    }

    public String toString ()
    {
        String saida = "";
        int i;

        for (i=0; i<this.texto.length -1; i++)
            saida = saida + this.texto[i] + ' ';

        saida = saida + this.texto[i];

        return saida;
    }

    public boolean equals (Object obj)//Teste: PASS
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass() != this.getClass())
			return false;
		
		Tracinhos traco = (Tracinhos)obj;
		
		if (this.texto.length != traco.texto.length)
			return false;
	
			return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()//Teste: PASS
    {
		int ret = 1;
		for (char c : this.texto)
		{
			ret = ret * 2 + new Character(c).hashCode();
		}
		
		return ret;
       
    }

    public Tracinhos (Tracinhos t) throws Exception // Teste:
    {
		if (t == null)
			throw new Exception ("Clonagem invalida! ");
		
		this.texto  =  new char [t.texto.length]; 

			for (int i = 0; i< t.texto.length; i++)
			{
				this.texto[i] = t.texto[i];
			}
		// Duvida aqui 
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()//Teste: PASS
    {
		Tracinhos ret = null;
		
		try
		{
			ret = new Tracinhos (this);
		}
		catch (Exception a)
		{}
		
		return ret;
    }
}
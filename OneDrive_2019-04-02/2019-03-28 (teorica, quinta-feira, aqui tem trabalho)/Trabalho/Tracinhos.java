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

    public boolean isComTracinhosAinda () //Teste
    {
		int i = 0;
		
		for (i=0; i<this.texto.length-1; i++)
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

        for (i=0; i<this.texto.length-1; i++)
            saida = saida + this.texto[i] + ' ';

        saida = saida + this.texto[i];

        return saida;
    }

    public boolean equals (Object obj)//Teste
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
		
		for (char c : this.texto)
		{
			if (this.texto[c] != traco.texto[c])
				return false;
		}
			
		return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()//Teste: 
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
		
		this.texto = t.texto; // Duvida aqui 
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conteúdo de t.texto para this.texto
    }

    public Object clone ()
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
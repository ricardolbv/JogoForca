public class BancoDePalavras
{
    private  String banco [] = {"JAVA",
                               "CLASSE",
                               "OBJETO",
                               "INSTANCIA",
                               "PUBLICO",
                               "PRIVATIVO",
                               "METODO",
                               "CONSTRUTOR",
                               "SETTER",
                               "GETTER",
                               "LUZ",
                               "PRAZER"};
							   
							   
							   
							   
	

    public Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra = new Palavra (this.banco [(int)(Math.random() * this.banco.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }

    public  String toString ()// Pegando !
    {
		String ret = "";
		int i = 0;
		
			for ( ; i < (this.banco.length - 1); i++)
			{
				ret += this.banco[i]+", ";
			}

        return "Palavras no banco: "+ret;
		
	}
	
	
	
	


    public boolean equals (Object obj)// Testado : Ok
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass() != this.getClass())
			return false;
		
		BancoDePalavras Banco = (BancoDePalavras)obj;
		
		if (Banco.banco.length != this.banco.length)
			return false;
		
		for (int i = 0; i < Banco.banco.length; i++)
		{
			if (Banco.banco[i] != this.banco[i])
				return false;
		}
		
		return true;
    }

    public int hashCode () //Testado : Ok
    {
		int ret = 1;
		ret = ret * 2 + this.banco.hashCode();
		
		return ret; // Tentar implementar o operador ternario 
        
    }
}
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

    public  String toString ()// Sem ideias!
    {
        return this.banco[2];
		
	}
	


    public boolean equals (Object obj) // sem ideias preciso aprendr a percorrer vetor de stringssssss
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass() != this.getClass())
			return false;
		
		BancoDePalavras Banco = (BancoDePalavras)obj;
		
		if (Banco.banco != this.banco)
			return false;
		
		return true;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    //public int hashCode ()
    //{
        // calcular e retornar o hashcode de this
    //}
}
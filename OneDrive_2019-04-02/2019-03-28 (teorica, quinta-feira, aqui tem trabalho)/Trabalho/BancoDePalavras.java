public class BancoDePalavras
{
    private String banco [] = {"JAVA",
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

    public String toString ()
    {
        // resultar um String contendo as palavras do banco
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
}
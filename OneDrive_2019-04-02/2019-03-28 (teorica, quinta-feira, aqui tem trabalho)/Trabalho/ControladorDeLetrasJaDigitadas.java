class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String jaForam;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.jaForam="";
    }

    public boolean isJaDigitada (char ltr)
    {
        // percorrer o String jaForam e verificar se o mesmo
        // possui a letra ltr, retornando true em caso afirmativo
        // ou false em caso negativo
    }

    public void registreUmaLetra (char ltr) throws Exception
    {
        if (this.isJaDigitada (ltr))
            throw new Exception ("Tentativa de registra letra ja registrada!");

        this.jaForam = this.jaForam+ltr;
    }

    public String toString ()
    {
        if (this.jaForam.compareTo ("") == 0)
            return "";

        String saida = "";
        int i;

        for (i=0; i<this.jaForam.length()-1; i++)
            saida = saida + this.jaForam.charAt (i) + ", ";

        saida = saida + this.jaForam.charAt (i);

        return saida;
    }

    public boolean equals (Object obj)
    {
        // verificar se this e obj são iguais
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas (ControladorDeLetrasJaDigitadas c) throws Exception // construtor de cópia
    {
        // copiar c.jaForam em this.jaForam
    }

    public Object clone ()
    {
        // retornar uma copia de this
    }
}
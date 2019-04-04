class ControladorDeLetrasJaDigitadas implements Cloneable
{
    private String jaForam;

    public ControladorDeLetrasJaDigitadas ()
    {
        this.jaForam="";
    }

    public boolean isJaDigitada (char ltr) //Teste: nao consegui testar
    {
		int i = 0;
		
		for ( ; i < this.jaForam.length() - 1; i++)
		{
			if (this.jaForam.charAt(i) == ltr)
				return true;
		}
		return false;
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

    public boolean equals (Object obj)// Teste: PASS
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass() != this.getClass())
			return false;
		
		ControladorDeLetrasJaDigitadas ltr = (ControladorDeLetrasJaDigitadas)obj;
		
		if (!ltr.jaForam.equals(this.jaForam))
			return false;
		
		return true;
     }

    public int hashCode ()// Teste: PASS
    {
		int ret = 1;
		
		ret = ret * 2 + this.jaForam.hashCode();
		
		return ret;
        // calcular e retornar o hashcode de this
    }

    public ControladorDeLetrasJaDigitadas (ControladorDeLetrasJaDigitadas c) throws Exception // Teste:PASS
    {
		if (c == null)
			throw new Exception ("Clone de objeto nulo!");
		
		this.jaForam = c.jaForam;
    }

    public Object clone ()// Teste:PASS
    {
		ControladorDeLetrasJaDigitadas ret = null;
		
		try 
		{
			ret = new ControladorDeLetrasJaDigitadas (this);
		}
		catch (Exception a)
		{}
       return ret;
    }
}
class ControladorDeErros implements Cloneable
{
    private int qMax, qErr=0;

    public ControladorDeErros (int qm) throws Exception
    {
        if (qm<=0)
            throw new Exception ("Tentativa de criar um controlador de erros que admite quantidade maxima de erros negativa!");

        this.qMax = qm;
    }

    public void registreUmErro () throws Exception // Implementado
    {
		if (this.qErr == this.qMax)
			throw new Exception ("Erros estourados");
		
		this.qErr ++;
    }

    public boolean isComMaximoDeErrosAtingido  ()
    {
        return this.qErr == this.qMax;
    }

    public String toString ()
    {
        return this.qErr + "/" + this.qMax;
    }

    public boolean equals (Object obj)
    {
		if (obj == this)
			return true;
		
		if (obj == null)
			return false;
		
		if (obj.getClass () != this.getClass())
			return false;
		
		ControladorDeErros erro = (ControladorDeErros)obj;
		
		if (erro.qMax == this.qMax && erro.qMax == this.qMax)
			return true;
		
		return false;
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
		int ret = 1;
		
		ret = ret * 2 + new Integer(this.qMax).hashCode();
		ret = ret * 2 + new Integer(this.qErr).hashCode();
		
		return ret;
        // calcular e retornar o hashcode de this
    }
	
	

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
		if (c == null)
			throw new Exception ("Copia invalida!");
		
		this.qMax = c.qMax;
		this.qErr = c.qErr;
        // copiar c.qMax e c.qErr, respectivamente em, this.qMax e this.qErr
    }

    public Object clone ()
    {
		ControladorDeErros ret = null;
		
		try 
		{
			ret = new ControladorDeErros(this);
		}
		catch (Exception erro){}
        return ret;
    }
}
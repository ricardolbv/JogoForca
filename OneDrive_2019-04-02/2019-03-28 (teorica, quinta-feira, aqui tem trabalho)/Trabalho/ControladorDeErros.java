class ControladorDeErros implements Cloneable
{
    private int qMax, qErr=0;

    public ControladorDeErros (int qm) throws Exception
    {
        if (qm<=0)
            throw new Exception ("Tentativa de criar um controlador de erros que admite quantidade maxima de erros negativa!");

        this.qMax = qm;
    }

    public void registreUmErro () throws Exception
    {
        // verifica se this.qErr ja é igual a this.qMax,
        // lançando excecao em caso positivo ou
        // incrementando this.qErr em caso negativo
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
        // verificar se this e obj possuem o mesmo conteúdo, retornando
        // true no caso afirmativo ou false no caso negativo
    }

    public int hashCode ()
    {
        // calcular e retornar o hashcode de this
    }

    public ControladorDeErros (ControladorDeErros c) throws Exception
    {
        // copiar c.qMax e c.qErr, respectivamente em, this.qMax e this.qErr
    }

    public Object clone ()
    {
        // returnar uma cópia de this
    }
}
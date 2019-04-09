import java.io.*;



public class ExecutoraBancoDePalavras 
{
		public static void main (String args [])
    {
		try{
		BancoDePalavras banco = new BancoDePalavras ();
		BancoDePalavras Banco = new BancoDePalavras ();
		
		System.out.println(Banco); //Testando toString();
		
		if (banco.equals(banco)) // Testando Equals
		System.out.println(banco.hashCode());//Testando hashCode;
	
		else 
			System.out.println ("Nao sao iguais");
		}
		catch (Exception a)
		{
			System.err.println(a.getMessage());
		}
	}
}
import java.io.*;

public class ExecutoraDeLetrasDigitadas
{
	public static void main (String args [])
    {
		try
		{
			ControladorDeLetrasJaDigitadas ct1 = new ControladorDeLetrasJaDigitadas();
			ControladorDeLetrasJaDigitadas ct2 = new ControladorDeLetrasJaDigitadas();
			
			//Testando equals
			if (ct1.equals(ct2))
				System.out.println("Sao iguais");
			else 
				System.out.println("Nao iguais");
			
			ct1.registreUmaLetra('a'); 
			ct1.registreUmaLetra('b');
			ct1.registreUmaLetra('c');
			ct1.registreUmaLetra('d');
			
			System.out.println(ct1);
			
			
			/*if (ct1.equals(ct2))
				System.out.println("Sao iguais");
			else 
				System.out.println("Nao iguais");*/
			
			if (ct1.isJaDigitada('d'))
				System.out.println("Letra ja digitada");
			else
				System.out.println("Nao Digitada");
			
		}
		catch (Exception a)
		{System.err.println(a.getMessage());}
	}
}

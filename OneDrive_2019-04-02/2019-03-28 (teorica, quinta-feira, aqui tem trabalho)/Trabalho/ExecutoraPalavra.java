public class ExecutoraPalavra
{
	public static void main (String args [])
	{
		try
		{
			Palavra palavra = new Palavra ("teste");
			Palavra palvraTeste = new Palavra ("teste");
			
			
			System.out.println(palvraTeste.getTamanho());
			System.out.println(palvraTeste.getQuantidadeDaLetra('u'));
			
			Usando o metodo getPosicao
			
			System.out.println(palavra.getPosicaoDeOcorrenciaDaLetra(0,'t'));
			
			System.out.println("\n\n"+palavra);
			System.out.println("\n\n"+palvraTeste);
			
			if (palavra.equals(palvraTeste)) //Testando equals
				System.out.println("sao iguais!");
			else
				System.out.println("sao diferentes!");
			
			
			System.out.println("Hascode "+palavra.hashCode());
			System.out.println("Hascode "+palvraTeste.hashCode());
		}
		
		catch (Exception a)
		{
			System.err.println(a.getMessage());
		}
		
	}
}
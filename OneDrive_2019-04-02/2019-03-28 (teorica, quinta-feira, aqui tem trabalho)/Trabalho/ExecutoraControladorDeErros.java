public class ExecutoraControladorDeErros
{
	public static void main (String args [])
	{
		try
		{
		ControladorDeErros erro1 = new ControladorDeErros (3);
		ControladorDeErros erro2 = new ControladorDeErros (3);
		
		erro1.registreUmErro();//Testando registreUmErro
		if (erro1.equals(erro2))//Testando equals
			System.out.println ("Sao Iguais");
			else
			System.out.println ("\n\nNao Iguais");
			
		System.out.println ("\nHascode 1: "+erro1.hashCode());//Testando hashCode
		System.out.println ("\nHascode 2: "+erro2.hashCode());
		
		ControladorDeErros copy = new ControladorDeErros (erro2); // Chamando contrutor de copia
		ControladorDeErros copy2 = (ControladorDeErros)erro1.clone(); // Chamando metodo clone();
		
		//Vou testar o registra erros e metodos envolvidos! Registra até o maximo e tambem ver se o Boolean is max esta pegando
		erro2.registreUmErro();
		erro2.registreUmErro();
		//Duvida e possivel erro: Quando atinge o maximo de erros com o registreUmErro ele joga uma Exception entao nao é possivel dar sentido ao is maximo
		//Solução seria fazer a exceção ser jogada if (this.qErr > this.qMax)
		erro2.registreUmErro();
		
		
		System.out.println(erro2);
		
		}
		catch (Exception a)
		{
			System.err.println (a.getMessage());
		}
	}
}
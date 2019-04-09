import java.io.*;



public class ExecutoraTracinhos
{
		public static void main (String args [])
    {
		try 
		{
			

			Palavra palavra   = new Palavra ("teste");
                Tracinhos tracinhos =
                new Tracinhos (palavra.getTamanho ());
				
				 ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas =
                new ControladorDeLetrasJaDigitadas ();
			
				System.out.println(palavra);
				System.out.println(tracinhos);
				
				int qtd = palavra.getQuantidadeDaLetra('t');
				System.out.println("Quantidade de t: "+qtd);
				
				         tracinhos.desvele (palavra.getPosicaoDeOcorrenciaDaLetra (i,'t'),'t');
                            System.out.println ();
				 
			
			
			
			
			/*
			Tracinhos test = new Tracinhos (4);
			Tracinhos test1 = new Tracinhos(test);
			
			System.out.println("CRiginal :"+test1);
			
		
			
			if (test.equals(test1)) 
				System.out.println("Equals pegando ");
			
			System.out.println(test.hashCode());
			
			Tracinhos copy = new Tracinhos(test);
			System.out.println("Copia do cp constructor: "+copy);
			
			Tracinhos copy1 = (Tracinhos)test.clone();
			System.out.println("Copia do metodo clone"+copy1);
			
			
			test.desvele(1,'a');
			test.desvele(2,'a');
			test.desvele(3,'a');
			//test.desvele(3,'a');			
			
			System.out.println(test);
			
			if (test.isComTracinhosAinda())
				System.out.println("Ainda ha tracos");
			else 
				System.out.println("Sem tracos");
			*/
		}
		catch (Exception a)
		{
		System.err.println(a.getMessage());
		}			
	}
	
}
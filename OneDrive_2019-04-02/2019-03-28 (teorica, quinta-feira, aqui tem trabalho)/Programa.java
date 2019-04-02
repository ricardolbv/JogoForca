import java.util.ArrayList;

public class Programa
{
    public static void main (String[] args)
    {
        try
        {
            Data inicioAulas1s2019 = new Data (18,2,2019);
            Data outra = inicioAulas1s2019 ;

            System.out.println (inicioAulas1s2019); // 18/02/2019
            outra.setDia(28);
            System.out.println (inicioAulas1s2019); // 28/02/2019

            ArrayList<Data> arr = new ArrayList<Data> ();
            arr.add (inicioAulas1s2019); //28/02/2019
            inicioAulas1s2019.setMes (3);
            // está guardado em arr 28/03/2019
        }
        catch (Exception erro)
        {
            System.err.println (erro.getMessage());
          //System.err.println ("Invalid date");
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BagMain {


    public static void main(String[] args) {
        Bag<String> mybag = new ArrayBag<>();
        Bag<Pokemon> pokemonBag = new ArrayBag<>();
        Bag<Integer> intBag = new ArrayBag<>();

        mybag.add("cheese");

        mybag.add("money");

        intBag.add(1);
        intBag.add(2);
        intBag.add(3);
        intBag.add(4);


        BufferedReader br = null;
        try
        {

            //Reading the csv file
            br = new BufferedReader(new FileReader("pokemon.csv"));

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line

            int countTotalLine= 0;
            while ((line = br.readLine()) != null)
            {
                String[] pokemonDetails = line.split(",");

                if(pokemonDetails.length > 0 )
                {
                    //Create a temporary pokemon
                    Pokemon pokemon = new Pokemon();
                    pokemon.setName(pokemonDetails[1]);
                    pokemon.setAttack(Integer.parseInt(pokemonDetails[6]));


                    pokemonBag.add(pokemon);


                }

                countTotalLine++;
            } // end of the while loop


            System.out.println("Importing pokemon.csv file...");

            System.out.println(countTotalLine + " have been imported\n");


        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }



        System.out.println("==================" + pokemonBag + " \nthis is pokemonBag ======================");
        pokemonBag.removeAll();

        System.out.println(pokemonBag);

        intBag.remove(3);

        System.out.println(intBag);


        intBag.remove(3);


        System.out.println(intBag);

        intBag.add(2);


        System.out.println(intBag);

        System.out.println(intBag.remove(2) + " this remove inside System.out.println");

        System.out.println(intBag);



    }
}

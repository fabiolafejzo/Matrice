package Matrice;
import java.io.FileWriter;
public class Matrice {

     FileWriter jk;

    int[][] theMatrix;


    public Matrice(int x, int y) {

        theMatrix = new int[x][y];

    }

    

    public Matrice(int[][] m) {

        theMatrix = m;

    }

    

    public void fillRandom() {

        for(int i= 0; i < theMatrix.length; i++){

            for(int j = 0; j< theMatrix[i].length; j++){

                theMatrix[i][j] = (int)(Math.random()*10);

                

            }

       

        }

    }

    public String toString() {

        String tab = "";

        for(int i= 0; i < theMatrix.length; i++){

            for(int j = 0; j< theMatrix[i].length; j++){


                    tab = tab + "["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t";

                }

                tab += "\n";

            }

       

        

        return tab;

    }

    public void toFile( String filename ) {

        try{

            jk = new FileWriter(filename);

            for(int i= 0; i < theMatrix.length; i++){

                for(int j = 0; j< theMatrix[i].length; j++){

                      jk.write("["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t");                   

                

                }

                jk.write("\n");

            }

            jk.close();

        }

        catch(Exception ex){

            System.out.println("Errore: " + ex.getMessage());

        }

    }



    public void fromFile( String filename ) {

        

    }

    

}

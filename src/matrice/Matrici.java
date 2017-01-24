

package Matrice;

public class Matrici {

    public static void main(String[] args) {

        

        Matrice m = new Matrice(3, 10);

        

        m.fillRandom();

        System.out.println(m);

      

        m.toFile("data/Matrice.txt");

      

    }

    

}
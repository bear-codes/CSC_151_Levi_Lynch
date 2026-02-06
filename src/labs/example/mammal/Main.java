/* 
Levi Lynch
2/4/26

*/

package labs.example.mammal;

public class Main {

    public static void main(String[] args) {

        Mammal mammal = new Mammal(
                "Brown",
                "Hazel",
                "Domestic Household"
        );

        mammal.getMammalDetails();
        mammal.sit();
    }
}


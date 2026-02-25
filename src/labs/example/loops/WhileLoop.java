package labs.example.loops;

public class WhileLoop {

public static void main(String[] args){
    executeWhileLoop();

}

private static void executeWhileLoop(){

    int counter = 0; 
    while(counter<10){
        counter++;
    }

    System.out.println("The loop ran " + counter + " times.");

    }

}
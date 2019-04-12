
package transmitancja;

public class Transmitancja {


    public static void main(String[] args) {
        Sinus element = new Sinus(360); 
        Triangle element2 = new Triangle(1);
       
        element2.generateTriangle();
        for(int i = 0 ; i < 10; i++)
            System.out.println("");
        
      /*  element.sinusTransformation();
        for(int i = 0 ; i < 10; i++)
        element2.howManySteps();
            System.out.println("");
        element.generateSinus();
        for(int i = 0 ; i < 10; i++)
            System.out.println("");*/

    }
    
}

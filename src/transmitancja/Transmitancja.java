
package transmitancja;

public class Transmitancja {
    double zmienna[] = new double[5];
    
    
    public static void main(String[] args) {
     
    }
    
    
    public void getParameters(String parametr,int i){
        
        zmienna[i] = Double.parseDouble(parametr);
        
    }

    public void transformSine(int dane){
        Sinus temp = new Sinus(dane);
       
    }
    
}

 package transmitancja;
 import java.util.ArrayList;
import java.util.List;
 import java.math.RoundingMode;
public class Sinus {
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa = new ArrayList<>();
    List<Double> jakasNazwaT = new ArrayList<>();
    double maxValue = 1.0;
    public Sinus(int dane) {
    numberOfSteps = dane;
    }   


    
    public void generateSinus(){

        for(double i = 0; i < numberOfSteps; i++){
                         //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            jakasNazwa.add(Math.sin(i/180*Math.PI));
        }
    }
    public void sinusTransformation(double a0, double a1,double b0,double b1, double b2,int delay){
 
        for(int j = 0 ; j <= delay;j++){
            jakasNazwaT.add(0.0);
        }
        for(int i = 0; i < (numberOfSteps - 1); i++){
           // System.out.println(a0 + " --- " + a1+ " --- " + b0 + " --- " + b1 + " --- " + b2);
                y = (-b1-b0)/b2*y+(a0+a1)/b2 *jakasNazwa.get(i);
            jakasNazwaT.add(y);
            if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
        }
    }
    
    
    
    protected double scaleToBiggest(){
        System.out.println("Zobaczymy co wypluje " + maxValue);
        return maxValue;
    }
    
    
    
}

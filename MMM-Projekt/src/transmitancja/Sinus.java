 package transmitancja;
 import java.util.ArrayList;
import java.util.List;
 import java.math.RoundingMode;
public class Sinus {
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa = new ArrayList<>();
     List<Double> jakasNazwaT = new ArrayList<>();
    public Sinus(int dane) {
    numberOfSteps = dane;
    }   


    
    public void generateSinus(){

        for(double i = 0; i < numberOfSteps; i++){
                         //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            jakasNazwa.add(Math.sin(i/180*Math.PI));
        }
    }
    public void sinusTransformation(double a0, double a1,double b0,double b1, double b2){
        for(int i = 0; i < numberOfSteps - 1; i++){
        //    System.out.println(y + "      "+ i );    
            y = (-b1-b0)/b2*y+(a0+a1)/b2 *jakasNazwa.get(i);
            jakasNazwaT.add(y);
        }
    }
}

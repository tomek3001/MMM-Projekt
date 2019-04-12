 package transmitancja;
 import java.util.ArrayList;
import java.util.List;
 import java.math.RoundingMode;
public class Sinus {
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa = new ArrayList<>();
    public Sinus(int dane) {
    numberOfSteps = dane;
    }   

    public boolean howManySteps(){
        if(numberOfSteps > 360){
            System.out.println("Nie można przyjąć tyle kroków");
            return false;
        }
        else{
            System.out.println("Wybrałeś: " + numberOfSteps + " kroków");
            return true;
        }
    }
    
    public void generateSinus(){

        for(double i = 0; i < numberOfSteps; i++){
                         //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            jakasNazwa.add(Math.sin(i/180*Math.PI));
            System.out.println(jakasNazwa.get((int)i) + "    " + i);
        }
    }
    public void sinusTransformation(){
        for(int i = 0; i < numberOfSteps - 1; i++){
            System.out.println(y + "      "+ i );    
            y = y + (y + jakasNazwa.get(i))*0.1;
        }
    }
}

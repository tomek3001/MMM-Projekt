 package transmitancja;
 import java.util.ArrayList;
import java.util.List;
 import java.lang.Math;
 import java.math.*;
public class Pobudzenie {
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa = new ArrayList<>();
    List<Double> jakasNazwaT = new ArrayList<>();
    List<Double> jakasNazwaT2 = new ArrayList<>();
    boolean faza = false;
    double maxValue = 1.0;
    double maxValue2;
    public Pobudzenie(int dane) {
    numberOfSteps = dane;
    }   
    
    public void generatePobudzenie(){

        for(double i = 0; i < numberOfSteps; i++){
           jakasNazwa.add(1.0);
        }
    }
    public void pobudzenieTransformation(double a0, double a1,double b0,double b1, double b2,int delay){
        double x = 0;
        for(int j = 0 ; j <= delay;j++){
            jakasNazwaT.add(0.0);
        }
        for(int h = 0; h < numberOfSteps - 1 - delay; h++){
            x = (a0/b2)*jakasNazwa.get(h)/100 - y*b0/b2/100+x;
            y = a1/b2*jakasNazwa.get(h)/100+y*(1-b1/b2/100)+x/100;
            jakasNazwaT.add(y);
             if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
        }
    }
    public void pobudzenieOmegaRe(double a0, double a1,double b0,double b1, double b2){
       jakasNazwa.clear(); 
       jakasNazwaT.clear();
        maxValue = 0.0;
        int tempz = 0;
       for(double i = 0.001; i < (numberOfSteps - 1); ){
           tempz++;
                y = 20*Math.log10(Math.sqrt((
                        Math.pow(a0*b0+(a1*b1-a0*b2)*Math.pow(i,2)
                                , 2) +
                                Math.pow((a1*b0-a0*b1)*i-a1*b2*Math.pow(i,3)
                                        ,2)
                        )/Math.pow(Math.pow(b0,2) - 2*b0*b2*i*i
                                +b2*b2*Math.pow(i,4) +Math.pow(b1*i,2)
                                ,2)));
            jakasNazwaT.add(y);
            if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
            i = i * 1.06;  
        }
       maxValue2 = maxValue;
    }
    public void pobudzenieOmegaIm(double a0, double a1,double b0,double b1, double b2,int delay){
        for(double j = 0.001; j < (numberOfSteps - 1);){  //Zmienione wartości omega lepiej oddają układy
               double l = (a1*b0-a0*b1)*j-a1*b2*j*j*j;
               double m = (a0*b0+(a1*b1-a0*b2)*j*j);
               double temporary = y;
               System.out.println(j);
               System.out.println((double)delay/1000);
               y =  Math.atan2(l,m)*180/Math.PI - j*((double)delay/1000);
               if(Math.abs(temporary - y) > 180)
                   faza = true;
               if(faza && temporary - y > 180)
                   y = y + 360;
               else if(faza && temporary - y < -180)
                   y = y - 360;
              // System.out.println(y);
            jakasNazwaT2.add(y);
            if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
            j = j * 1.06;        
        }
        faza = false;
    }
    
    
    protected double scaleToBiggest(){
  return maxValue;
    }
    
    
    
}

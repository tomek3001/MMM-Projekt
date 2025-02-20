/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transmitancja;

import java.util.ArrayList;
import java.util.List;
import java.math.RoundingMode;
/**
 *
 * @author Jakub
 */
public class Triangle {
    
    
    boolean direction;
    int numberOfSteps;
    double y = 0;
    List<Double> jakasNazwa = new ArrayList<>();
    List<Double> jakasNazwaT = new ArrayList<>();
    List<Double> jakasNazwaT2 = new ArrayList<>();
    List<Double> jakasNazwaT3 = new ArrayList<>();
     double maxValue = 1.0;
    double maxValue2;
    double frequency;
     boolean faza = false;
    public Triangle(int dane) {
    numberOfSteps = dane;
    }   

    
    public void generateTriangle(double frequency2){
        double x = 0 ;
        frequency = frequency2*981;
        for(double i = 0; i < numberOfSteps; i++){
            if( (Math.floor( i / 50.0 * frequency / 1000) ) % 2 == 0){
                direction = true;
            }
            else if( (Math.floor( i / 50.0 * frequency / 1000) ) % 2 == 1 ){
                direction = false;
            }
            if(direction){
                x = 2 * (  (i * frequency / 1000) % 50 );               //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            }
            else {
                x = 2 * ( 50 - ( (i * frequency / 1000) % 50 ) );
            }
            jakasNazwa.add( x / 100 );}
}
    public void triangleTransformation(double a0, double a1,double b0,double b1, double b2, int delay){    
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

    public void triangleOmegaRe(double a0, double a1,double b0,double b1, double b2){
       jakasNazwa.clear(); 
       jakasNazwaT.clear();
        maxValue = 0.0;
       for(double i = 0.001; i < (numberOfSteps - 1); ){
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
    public void triangleOmegaIm(double a0, double a1,double b0,double b1, double b2,int delay){
        for(double j = 0.001; j < (numberOfSteps - 1);){  //Zmienione wartości omega lepiej oddają układy
               double l = (a1*b0-a0*b1)*j-a1*b2*j*j*j;
               double m = (a0*b0+(a1*b1-a0*b2)*j*j);
               double temporary = y;
               System.out.println(j);
               System.out.println((double)delay/100);
               y =  Math.atan2(l,m)*180/Math.PI - j*((double)delay/100);
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

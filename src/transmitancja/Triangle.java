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
    List<Double> jakasNazwa3 = new ArrayList<>();
     List<Double> jakasNazwa3T = new ArrayList<>(); 
     double maxValue = 1.0;
    public Triangle(int dane) {
    numberOfSteps = dane;
    }   

    
    public void generateTriangle(double frequency){
        double x = 0 ;

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
            jakasNazwa3.add( x / 100 );}
}
public void triangleTransformation(double a0, double a1,double b0,double b1, double b2, int delay){    
    double x = 0;
        for(int j = 0 ; j <= delay;j++){
            jakasNazwa3T.add(0.0);
        }
                for(int h = 0; h < numberOfSteps - 1; h++){
            x = (a0/b2)*jakasNazwa3.get(h)/100 - y*b0/b2/100+x;
            y = a1/b2*jakasNazwa3.get(h)/100+y*(1-b1/b2/100)+x/100;
            jakasNazwa3T.add(y);
             if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
        }
}

protected double scaleToBiggest(){
        System.out.println("Zobaczymy co wypluje " + maxValue);
        return maxValue;
    }
}

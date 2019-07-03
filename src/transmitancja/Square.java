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
public class Square {
    
    
    boolean direction;
    int numberOfSteps;
    double y = 0;   
    List<Double> jakasNazwa = new ArrayList<>();
    List<Double> jakasNazwaT = new ArrayList<>();
    List<Double> jakasNazwaT2 = new ArrayList<>();
    List<Double> jakasNazwaT3 = new ArrayList<>();
    double maxValue = 1.0; 
     
     
    public Square(int dane) {
    numberOfSteps = dane;
    }   

    public void generateSquare(double frequency){
        double x = 0 ;
        for(double i = 0; i < numberOfSteps; i++){
            if( (Math.floor( i / 50.0 *frequency/1000) ) % 2 == 0){
                direction = true;
            }
            else if( (Math.floor( i / 50.0*frequency/1000 ) ) % 2 == 1 ){
                direction = false;
            }
            if(direction){
                x = 1;               //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            }
            else {
                x = 0-1;
            }
            jakasNazwa.add( x );
        }
    }
public void squareTransformation(double a0, double a1,double b0,double b1, double b2, int delay){
    double x = 0;
        for(int j = 0 ; j <= delay;j++){
            jakasNazwaT.add(0.0);
        }
                for(int h = 0; h < numberOfSteps - 1; h++){
            x = (a0/b2)*jakasNazwa.get(h)/100 - y*b0/b2/100+x;
            y = a1/b2*jakasNazwa.get(h)/100+y*(1-b1/b2/100)+x/100;
            jakasNazwaT.add(y);
             if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
        }
    }



public void squareOmegaRe(double a0, double a1,double b0,double b1, double b2){
       jakasNazwa.clear(); 
       jakasNazwaT.clear();
        maxValue = 0.0;
       for(double i = 0.0001; i < (numberOfSteps - 1); ){
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
            i = i * 1.08;           
        }
    }
public void squareOmegaIm(double a0, double a1,double b0,double b1, double b2,int delay){
        for(double j = 0.0001; j < (numberOfSteps - 1)*100;){
            y =  Math.atan(((a1*b0-a0*b1)*j-a1*b2*j*j*j)/(a0*b0+(a1*b1-a0*b2)*j*j))*180/Math.PI;
            jakasNazwaT2.add(y);
            System.out.println("Częstotliwość: " + y);
            if(maxValue < Math.abs(y))
                maxValue = Math.abs(y);
            j = j * 1.08; 
        }
    }
protected double scaleToBiggest(){
        System.out.println("Zobaczymy co wypluje " + maxValue);
        return maxValue;
    }
}





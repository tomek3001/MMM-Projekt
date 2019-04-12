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
    List<Double> jakasNazwa2 = new ArrayList<>();
    public Triangle(int dane) {
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
    
    public void generateTriangle(){
        double x = 0 ;
        for(double a = 0; a < numberOfSteps; a++){
            double i = a + 25;
            if( (Math.floor( i / 50.0 ) ) % 2 == 0){
                direction = true;
            }
            else if( (Math.floor( i / 50.0 ) ) % 2 == 1 ){
                direction = false;
            }
            if(direction){
                x = 2 * ( i % 50 );               //Na razie moga byc tylko dwa przebiegi sinusoidalne. wynika to z dzielenia przez 360 i numberOfStepsmax = 360                            
            }
            else {
                x = 2 * ( 50 - ( i % 50 ) );
            }
            jakasNazwa2.add( x / 50 - 1 );
            System.out.println(jakasNazwa2.get((int)a) + " jest wartością " + (a+1)+  " elementu ");
        }
    }
    public void triangleTransformation(){
        for(int i = 0; i < numberOfSteps - 1; i++){
            System.out.println(y + "      "+ i );    
            y = y + (y + jakasNazwa2.get(i))*0.1;
        }
    }
}

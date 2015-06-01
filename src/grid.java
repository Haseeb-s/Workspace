import java.util.*;	
public class grid{

public static void main (String args[]){

int OGX = 0, OGY = 0;
int newX = 0, newY = 0;
 
for(int x = 0; x < 12; x++){
int rando = (int)(Math.random()*4)+0; 

switch (rando){
case 1://north
newY++;
System.out.println("You've moved North.");
break;
case 2://east
newX++; 
System.out.println("You've moved East.");
break;
case 3://south
newY--;
 System.out.println("You've moved South.");
break;
case 4://west
newX--;
 System.out.println("You've moved West.");
break;

}}

double TOTALDISTANCE = Math.sqrt(Math.pow((OGX-newX),2)) + Math.sqrt(Math.pow((OGY-newY),2)); 
System.out.println("Your distance from the starting point is "+ TOTALDISTANCE + " miles.");


}}

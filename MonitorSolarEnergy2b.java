import java.util.Scanner;
public class MonitorSolarEnergy2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the energy generated (in kWh): ");  
     double energygenerated = sc.nextDouble();
     if(energygenerated <=10){
        System.out.println("Good Energy Generation");
     }
     else{
        System.out.println("Low Energy Generation");
     }
   
       
}
}

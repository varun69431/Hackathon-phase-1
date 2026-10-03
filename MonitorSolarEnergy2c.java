import java.util.Scanner;

class SolarEnergy {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter energy generated in the morning (in kWh): ");
        double morning = sc.nextDouble();
        
        System.out.print("Enter energy generated in the evening (in kWh): ");
        double evening = sc.nextDouble();
        
        double total = calculateTotalEnergy(morning, evening);
        
        System.out.println("Total Energy Generated: " + total + " kWh");

        sc.close();
        
    }
}

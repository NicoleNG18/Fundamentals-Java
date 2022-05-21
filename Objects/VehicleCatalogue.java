package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List <Vehicles> veh=new ArrayList<>();
        while (!command.equals("End")) {
            String [] commandArr=command.split("\\s+");
            Vehicles current=new Vehicles(commandArr[0],commandArr[1],commandArr[2],Integer.parseInt(commandArr[3]));
            veh.add(current);
            command = scanner.nextLine();
        }
        String input= scanner.nextLine();
        double carPower=0;
        double truckPower=0;
        int carCount=0;
        int truckCount=0;
        for (Vehicles v:veh) {
            if(v.getType().equals("car")){
                carPower+=v.getHorsePower();
                carCount++;
            }
            else{
                truckPower+=v.getHorsePower();
                truckCount++;
            }
        }
        while (!input.equals("Close the Catalogue")){
            for(int i=0;i<veh.size();i++){
                if(veh.get(i).getModel().equals(input)){
                    System.out.println(veh.get(i).toString());
                }

            }
            input= scanner.nextLine();
        }
        double avrg1=0;
        double avrg2=0;
        if(carCount!=0){
            avrg1=carPower/carCount;
        }
        if(truckCount!=0){
            avrg2=truckPower/truckCount;

        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",avrg1);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",avrg2);
    }
    static class Vehicles{
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicles(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }



        public String getModel() {
            return model;
        }



        public String getColor() {
            return color;
        }



        public int getHorsePower() {
            return horsePower;
        }



        @Override
        public String toString() {
            return "Type: " + getType().toUpperCase().charAt(0)+getType().substring(1) + '\n' +
                    "Model: " + this.getModel() + '\n' +
                    "Color: " + this.getColor() + '\n' +
                    "Horsepower: " + this.getHorsePower();
        }
    }
}

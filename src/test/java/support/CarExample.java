package support;

public class CarExample {
    public static void main(String[] args) {
        Supercar sp = new Supercar();
        sp.drive(80);
        sp.fuelUp();
        sp.drive(50);
        System.out.println("Fuel level is: " + sp.fuelLevel);
    }
}

class Supercar {
    public int fuelLevel = 100; //here are the properties: (initially) fuel level 100, distance = zero
    public int distance = 0;

    public void drive(int miles) {        //when we call drive method
        if ((fuelLevel - miles) < 0) {    //if fuel level <0, we interrupt this thing
            System.out.println("Not enogh fuel. Need to refuel.");
            return;
        } else {                           // otherwise, we are going to:
            this.distance = this.distance + miles;    //increase the distance for the object
            this.fuelLevel = this.fuelLevel - miles;  //and decrease the amount of fuel
        }
    }

    public void fuelUp() {
        this.fuelLevel = 100;           //set fuel level to 100
    }
}

/*
* Scenario:
* Create car class
* Car have 2 methods: drive, fuelUp
* Car gave 2 properties: distance, fuelLevel
* If fuel level <0, say "Not enough fuel"
*
* Drive method accept distance
*
* Fuel consumption 1 fuel unit to 1 distance unit
* Max fuel level=100
*
* To test the car:
*1.Car id fueled with 100
*2.Drive 80 miles
*3.FuelUp
*4.Drive 50 miles
*5.Check fuel level
* */
package Plane;

 final public class CargoPlane extends Airplane {
    private double maxWeight;
    private double cargoVolume;


    public CargoPlane(String model, int year, double maxFuel, double fuelDrop, double maxWeight, double cargoVolume) {
        super(model, year, maxFuel, fuelDrop);
        this.cargoVolume=cargoVolume;
        this.maxWeight=maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
    public void showCargoLoad(double weight,double volume){
        if ((weight<=maxWeight&&volume<=cargoVolume)){
        System.out.println(" Loading cargo: " + weight + " kg");
    }
    else {
            System.out.println(" The plane won't fly");}
    }
    //расход топлива для грузового самолета
    public void showMaxDistance(double weight,double volume){
        if (((weight<=maxWeight&&volume<=cargoVolume))){
            double cargo =((weight/maxWeight)*(volume/cargoVolume))*super.getFuelDrop();
        System.out.println("fuel consumption for cargo aircraft and his max distance is "+
                super.getMaxFuel()/(super.getFuelDrop()+cargo));}
        else {
                System.out.println("The plane won't fly");
    }}

 }



package Plane;


 final public class CombatAircraft extends Airplane {
    private int rocketLauncher;
    private int bombCount;


    public CombatAircraft(String model, int year, double maxFuel, double fuelDrop) {
        super(model, year, maxFuel, fuelDrop);
    }

    public int getRocketLauncher() {
        return rocketLauncher;
    }

    public void setRocketLauncher(int rocketLauncher) {
        if(rocketLauncher<=4&&rocketLauncher>=0){
        this.rocketLauncher = rocketLauncher;}
    }

    public int getBombCount() {
        return bombCount;
    }

    public void setBombCount(int bombCount) {
        if (bombCount>=0&&bombCount<=2){
        this.bombCount = bombCount;}
    }
    public void dropBomb(){
        System.out.println("plane.Airplane "+super.getModel()+" drop"+bombCount+" bomb");
    }
    public void useRocketLauncher(){
        System.out.println("plane.Airplane"+super.getModel()+"use "+rocketLauncher+" rocket launch");
    }

    }

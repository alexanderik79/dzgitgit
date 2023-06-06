package Flower;

public final class Peony extends Flower {
    private  String inflorescenceTypes;
    private String colorOfFlower;

    public Peony(String name, String classification, int age, boolean florescence,String inflorescenceTypes,String colorOfFlower) {
        super(name, classification, age, florescence);
        this.inflorescenceTypes=inflorescenceTypes;
        this.colorOfFlower=colorOfFlower;
    }

    public String getInflorescenceTypes() {
        return inflorescenceTypes;
    }

    public void setInflorescenceTypes(String inflorescenceTypes) {
        this.inflorescenceTypes = inflorescenceTypes;
    }

    public String getColorOfFlower() {
        return colorOfFlower;
    }

    public void setColorOfFlower(String colorOfFlower) {
        this.colorOfFlower = colorOfFlower;
    }
    //метод для описування квітки
    @Override
    public void showInfo() {
        System.out.println("\nThis flower is "+super.getName()+" classification of this flower is "+super.getClassification()+
                "\n Age of this plant is "+ super.getAge()+" months"+"\n inflorescence types and color of flower is "+inflorescenceTypes+" "+colorOfFlower );
    }

public void determinePeony(){
    if(inflorescenceTypes.equalsIgnoreCase("single")){
        System.out.println("Example varieties: Athena, Krinkled White, Scarlet O'Hara, Sea Shell.");

    }
    else if (inflorescenceTypes.equalsIgnoreCase("japanese")) {
        System.out.println("Example varieties: Nippon Beauty, Madame Butterfly.");

    }
    else if (inflorescenceTypes.equalsIgnoreCase("Semi-double")) {
        System.out.println("Example varieties: Paula Fay, Coral Charm, Miss America, Buckeye Belle.");
        }
    else {
        System.out.println("Unknown flower");
    }
    }
}


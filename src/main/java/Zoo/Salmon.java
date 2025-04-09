package Zoo;

public class Salmon extends fishAbstractClass{

    public static int salmonFishCounter = 0;

    public Salmon(String name){
        this.name = name;
        this.fishType = "Salmon";
        fishCounter++;
        salmonFishCounter++;
    }

    public static void main(String[] args){

        Salmon fish1 = new Salmon("Josh");
        Salmon fish2 = new Salmon("Becky");

        fish1.introduction();
        fish2.introduction();

        System.out.println("The number of total fish added: " + numberOfFish());
        System.out.println("The number of Salmon fish added: " + salmonFishCounter);

    }
}

package burak;

public class MadLibs {

    public static void main(String[] args){
      /*This program generates a mad libbed story.
        Author: Laura
        Date: 2/19/2049
       */

        String name1 = "Snoopy", name2 = "Gumball";
        String adjective1 = "funny", adjective2 = "rotten", adjective3 = "hot";
        String verb1 = "licking";
        String noun1 = "ice cream", noun2 = "motorcycle", noun3 = "TV", noun4 = "car", noun5 = "garbage man", noun6 = "coffee";
        int number = 158;
        String place1 = "On top of a bus";


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }

}

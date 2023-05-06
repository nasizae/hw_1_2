package com.company;

public class Main {

    public static void main(String[] args) {
        Habitat habitat1=new Habitat("Avstraliay");
        Animals animals=new Animals("LuckyAnimals","Lelina 1",5,Color.YELLOW,habitat1);
        System.out.println(animals.getInfo());
        animals.makeVoice();
        animals.makeVoice("aaaaaaaaaaa");

        System.out.println("-------------------------------------------------");
        Habitat habitat=new Habitat("Tayn-Shan");
    Tiger tiger=new Tiger("Zoo-Park","Asanbay 1",5,Color.ORANGE_AND_BLACK,habitat,"voice");
        System.out.println(tiger.getInfo());
        tiger.makeVoice();
        tiger.makeVoice("рррррррррррр");
        System.out.println("-----------------------------------------------------");
    Tiger tiger1=new Tiger("Animals","Shopokova 2",4,Color.BLACK_AND_WHITE,habitat,"лежать");
    System.out.println(tiger1.getInfo());
    tiger1.makeVoice();
    tiger1.makeVoice("рррррррыыыыыыыыыыыыыыыы");
    }

}

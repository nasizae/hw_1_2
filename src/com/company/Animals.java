package com.company;

public class Animals extends Zoo {
    private int age;
    private Color color;
    private Habitat habitat;

    public Animals(String name, String address, int age, Color color, Habitat habitat) {
        super(name, address);
        this.age = age;
        this.color = color;
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Habitat getHabitat() {
        return habitat;
    }
    public String getInfo(){
        return  "Zoo Name:"+this.getName()+
                "\nZoo Address:"+this.getAddress()+
                "\nAge:"+this.age+
                "\nColor:"+this.color+
                "\nHabitat:"+habitat.getName();
    }
    public final void makeVoice(){
        System.out.println("Voice Animals");
    }
    public  void makeVoice(String voice){
        System.out.println(voice);
    }

}

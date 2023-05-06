package com.company;

public final class Tiger extends Animals {
    private String commands;

    public Tiger(String name, String address, int age, Color color, Habitat habitat, String commands) {
        super(name, address, age, color, habitat);
        this.commands = commands;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\ncommands:"+this.commands;
    }

    @Override
    public void makeVoice(String voice) {
        super.makeVoice(voice);
    }
}

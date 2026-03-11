package com.yu.DSA.DesignPatterns.Creational;

public class BuilderDp {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("32 GB Ram", "1TB HDD").build();

        System.out.println(computer.getHDD());
        System.out.println(computer.getRAM());
        System.out.println(computer.isBlutoothEnabled());
        System.out.println(computer.isGraphicsEnabled());
    }
}
class Computer {
    private String RAM;
    private String HDD;
    private boolean isGraphicsEnabled;
    private boolean isBlutoothEnabled;

    Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
        this.isBlutoothEnabled = builder.isBlutoothEnabled;
    }

    public static class ComputerBuilder {
        public String RAM;
        public String HDD;
        public boolean isGraphicsEnabled;
        public boolean isBlutoothEnabled;

        ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            isGraphicsEnabled = graphicsEnabled;
            return this;
        }

        public ComputerBuilder setBlutoothEnabled(boolean blutoothEnabled) {
            isBlutoothEnabled = blutoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBlutoothEnabled() {
        return isBlutoothEnabled;
    }
}

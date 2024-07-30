public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Basic Computer: " + basicComputer);

        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .setMotherboard("ASUS ROG")
                .build();

        System.out.println("Gaming Computer: " + gamingComputer);

        Computer workstationComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("64GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA Quadro RTX 6000")
                .setPowerSupply("1000W")
                .setCoolingSystem("Advanced Liquid Cooling")
                .setMotherboard("MSI Pro")
                .build();

        System.out.println("Workstation Computer: " + workstationComputer);
    }
}
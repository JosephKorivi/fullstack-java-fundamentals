class Car {
    String brand, model;
    int year;
    double price;

    void setValues (String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setValues("MG", "XS", 2024, 1500000);
        myCar.displayInfo();
    }
}
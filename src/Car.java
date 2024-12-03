
public class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int year;
    private Double price;
    private boolean available;

    public Car() { }

        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
        public String getBrand() {
            return brand;
        }

        public void setModel(String model) {
            this.model = model;
        }
        public String getModel() {
            return model;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }

        public void setYear(int year) {
            this.year = year;
        }
        public int getYear() {
            return year;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
        public Double getPrice() {
            return price;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
        public boolean isAvailable() {
            return available;
        }
    


}
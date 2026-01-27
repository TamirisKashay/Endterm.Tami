package model;

public class PrintedBook extends BookBase {
    private double weight;

    public PrintedBook(int id, String title, double weight) {
        super(id, title);
        this.weight = weight;
    }

    @Override
    public String getBookType() { return "Printed Edition"; }

    @Override
    public double calculateLateFee(int days) { return days * 0.5; }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book: " + getTitle() + ", Weight: " + weight + "kg");
    }

    @Override
    public boolean validate() { return weight > 0 && getTitle() != null; }
}
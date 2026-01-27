package model;

public class EBook extends BookBase {
    private String format;

    public EBook(int id, String title, String format) {
        super(id, title);
        this.format = format;
    }

    @Override
    public String getBookType() { return "Digital (E-Book)"; }

    @Override
    public double calculateLateFee(int days) { return days * 0.2; }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + getTitle() + ", Format: " + format);
    }

    @Override
    public boolean validate() { return format != null && !format.isEmpty(); }
}
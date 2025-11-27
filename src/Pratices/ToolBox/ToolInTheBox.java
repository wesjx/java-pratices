package Pratices.ToolBox;

public class ToolInTheBox {
    private String name;
    private int quantity;

    public ToolInTheBox(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tool: " + name + " " + "Quantity: " + quantity;
    }
}
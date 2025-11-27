package Pratices.ToolBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner text = new Scanner(System.in);
        int answer = 0;
        String nameOfTool;
        int quantityOfTool;

        ToolBoxGenric<Object> ToolBox = new ToolBoxGenric<>();

        while (answer != 5){
        System.out.println("Enter one option");
        System.out.println("1- add tool\n2- delete tool\n3- list tools\n4- delete tool by name \n5- exit");
        answer = text.nextInt();
        text.nextLine();

            switch (answer){
                case 1:
                    System.out.println("What tool? ");
                    nameOfTool = text.nextLine();

                    System.out.println("How many ?");
                    quantityOfTool = text.nextInt();
                    text.nextLine();

                    ToolBox.addTool(new ToolInTheBox(nameOfTool, quantityOfTool));
                    break;
                case 2:
                    System.out.println("Select the tool:\n ");

                    ToolBox.showTools();

                    System.out.println("Type the index to delete: ");
                    int index = text.nextInt();
                    text.nextLine();

                    if (index >= 0 && index < ToolBox.size()) {
                        ToolBox.deleteByIndex(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 3:
                    if (ToolBox.size() == 0) {
                        System.out.println("Empty tool box.");
                    } else {
                        ToolBox.showTools();
                    }
                    break;
                case 4:
                    System.out.println("Type the name of the tool to delete:\n");
                    String toolToDeleteByName = text.nextLine();
                    ToolBox.deleteToolByName(toolToDeleteByName);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}

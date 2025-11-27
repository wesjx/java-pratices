package Pratices.ToolBox;

import java.util.ArrayList;
import java.util.List;

public class ToolBoxGenric<T> {
    private List<T> Tools;

    public ToolBoxGenric() {
        this.Tools = new ArrayList<>();
    }

    public void addTool(T tool){
        Tools.add(tool);
    }

    public void deleteToolByName(T name){
        if (Tools.contains(name)) {
        Tools.remove(name);
        } else {
            System.out.println("Tool not found in the list.");
        }
    }

    public int size() {
        return Tools.size();
    }

    public T get(int i) {
        return Tools.get(i);
    }

    public void deleteByIndex(int index) {
        Tools.remove(index);
    }

    public void showTools(){
        for (int i = 0; i < Tools.size(); i++) {
            System.out.println(i + "- " + Tools.toString());
        }
    }
}

package Lab_8;

import java.io.File;

public class Main {
    public static void main(String[] args){
        File inputFile = new File("lab_8_input.txt");
        DataManager manager = new DataManager(inputFile);
        manager.loadData("lab_8_input.txt");
        manager.registerDataProcessor(new FilterProcessor());
        manager.registerDataProcessor(new UpperProcessor());
        manager.processData();
        manager.saveData("lab_8_output.txt");
        manager.shutdown();
    }
}

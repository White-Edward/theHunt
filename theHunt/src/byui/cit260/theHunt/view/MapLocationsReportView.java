/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.view;

import byui.cit260.theHunt.model.Location;
import byui.cit260.theHunt.model.Map;
import byui.cit260.theHunt.model.QuestionType;
import java.io.IOException;
import java.io.PrintWriter;
import thehunt.TheHunt;

/**
 *
 * @author Ann
 */
class MapLocationsReportView extends View {

    public MapLocationsReportView() {
        super("","Please enter the file path where the report"
                + " should be stored: ");
    }
    
    public boolean createReport(Location[][] locations, String fileName) {
        try (PrintWriter report = new PrintWriter(fileName)) {
            report.println("====================");
            report.println("Map Locations Report");
            report.println("====================");
            report.printf("%n%-10s%-15s%s","Location","Item","Riddle");
            report.printf("%n%-10s%-15s%s","--------","----","--------");
            
            // Print the Location, Item, and Question for each site
            for (Location[] x : locations) {
                for (Location location : x) {
                    String mapLocation = (location.getRow() + 1) + "," + (location.getColumn() + 1);
                    String item = "N/A";
                    if (location.hasItem()) {
                        item = location.getItem().name();
                    }
                    String riddle = "N/A";
                    if (location.hasQuestion()) {
                        switch (location.getQuestion().getQuestionType()) {
                            case riddle:
                                riddle = location.getQuestion().getRiddle();
                                break;
                            case water:
                                riddle = location.getQuestion().getRiddle();
                                break;
                            case teaspoon:
                                riddle = location.getQuestion().getRiddle();
                                break;
                            case train:
                                riddle = location.getQuestion().getRiddle();
                                break;
                        }
                    }
                    report.printf("%n%-10s%-15s%s",mapLocation, item, riddle);
                }
            }
        } catch (IOException e) {
            ErrorView.display(this.getClass().getName(),"Error writing file: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    @Override
    public boolean doAction(String value) {
        Map map = TheHunt.getCurrentGame().getMap();
        boolean result = this.createReport(map.getLocations(), value);
        if (result) {
            this.console.println("\nSuccessfully saved report to file: " + value);
        } else {
            this.console.println("\nFailed to save report to file: " + value);
        }
        return true;
    }
}

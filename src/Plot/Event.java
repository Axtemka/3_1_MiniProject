package Plot;

import java.util.ArrayList;

public class Event {
    private String description;
    private String preDescription;
    private int[] modifiers;
    private ArrayList<Event> directions = new ArrayList<>();


    public Event(String description, String preDescription, int[] modifiers) {
        setDescription(description);
        setPreDescription(preDescription);
        setModifiers(modifiers);
    }

    public String getDescription() {
        return description;
    }
    public String getPreDescription() {
        return preDescription;
    }

    public int[] getModifiers() {
        return modifiers;
    }

    public ArrayList<Event> getDirections(){
        return directions;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPreDescription(String preDescription) {
        this.preDescription = preDescription;
    }

    public void setModifiers(int[] modifiers) {
        this.modifiers = modifiers;
    }
    public void addEventToDirection(Event event){
        directions.add(event);
    }
    public boolean checkEnd(){
        return this.directions.isEmpty();
    }
}

package exercise.exercise2;

public class building {
    public int floors;
    public double area;
    public int occupants;

    public building(int floors, double area, int occupants) {
        this.floors = floors;
        this.area = area;
        this.occupants = occupants;
    }

    public void areaPerPerson(){
        if (occupants != 0){
            double areaPerPerson = (area*floors)/occupants;
            System.out.println("Area per person: " + areaPerPerson);
        } else {
            System.out.println("No occupants");
        }
    }
}

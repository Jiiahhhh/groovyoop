package exercise.exercise2;

public class main {
    public static void main(String[] args) {
        building house = new building(1, 500, 4);
        building office = new building(3, 500, 10);

        house.areaPerPerson();
        office.areaPerPerson();
    }
}

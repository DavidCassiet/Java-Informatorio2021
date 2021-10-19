// Class of "Exercise06"

public class Employee {

    private String name;
    private String lastName;
    private int dni;
    private int workedHours;
    private int valuePerHour;

    public Employee(String name, String lastName, int dni, int workedHours, int valuePerHour) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.workedHours = workedHours;
        this.valuePerHour = valuePerHour;
    }

    public int getDni() {
        return this.dni;
    }

    public int getWorkedHours() {
        return this.workedHours;
    }

    public int getValuePerHour() {
        return this.valuePerHour;
    }
}

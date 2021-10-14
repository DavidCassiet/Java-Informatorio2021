import java.util.*;

public class Exercise05 {

    public static void main(String[] args) {

        ArrayList<Integer> workedHours = new ArrayList<Integer>();
        ArrayList<Integer> valuePerHour = new ArrayList<Integer>();
        ArrayList<Integer> listTotals = new ArrayList<Integer>();

        workedHours.add(6);
        workedHours.add(7);
        workedHours.add(8);
        workedHours.add(4);
        workedHours.add(5);

        valuePerHour.add(350);
        valuePerHour.add(345);
        valuePerHour.add(550);
        valuePerHour.add(600);
        valuePerHour.add(320);

        int totalAmount= 0;
        int total= 0;

        for (int i = 0; i < workedHours.size(); i++) {

            totalAmount = workedHours.get(i) * valuePerHour.get(i);
            listTotals.add(totalAmount);
            total += totalAmount;
        }

        System.out.println(listTotals);
        System.out.println("Final total: $" + total);

    }
}

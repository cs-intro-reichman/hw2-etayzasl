public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int newMinutes = minutes + minutesToAdd;
        int newHours = (hours + newMinutes / 60) % 24;
        newMinutes = newMinutes % 60;
        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}

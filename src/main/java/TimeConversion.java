public class TimeConversion {
    public static String timeConversion(String s) {
        String [] arr = s.split(":");
        int hour = Integer.parseInt(arr[0]) % 12;
        if (s.contains("PM")) {
            hour += 12;
        }
        return String.format("%02d:%s:%s", hour, arr[1], arr[2].substring(0,2));
    }
    public static void main(String[] args) {
        String timeFormatted = timeConversion("07:05:45PM");
        System.out.println(timeFormatted);

    }
}

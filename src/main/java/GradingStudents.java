import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < grades.size() ; i++) {
            if ( (grades.get(i) >= 38)) {
                int newValue = grades.get(i) + (5 - (grades.get(i) % 5));
                if (newValue - grades.get(i) < 3) {
                    result.add(newValue);
                }else{
                    result.add(grades.get(i));
                }
            }else{
                result.add(grades.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        gradingStudents(grades);
    }
}

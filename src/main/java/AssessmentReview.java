import java.util.Arrays;

public class AssessmentReview {

    public static int cubed(int num){
        return (int) Math.pow((double) num, 3);
    }

    public static int difference (int first, int second){
        return first - second;
    }

    public static double difference (double first, double second){
        return first - second;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = (double) (array[array.length/2] + array[array.length/2 - 1])/2;
        }else {
            median = array[array.length/2];
        }
        return median;
    }

}

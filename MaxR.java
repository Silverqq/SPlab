import java.util.Random;

public class MaxR {
    public static void main(String[] args) {
        int[] Sequence = new int[1000];
        for(int i = 0; i < 1000; i++){
            Sequence[i] = (new Random()).nextInt(0, 10000);
        }
        int Rmax = -1;
        for (int i = 0; i < Sequence.length; i++) {
            for (int j = i + 1; j < Sequence.length; j++) {
                int result = Sequence[i] * Sequence[j];

                if (result % 14 == 0 && result > Rmax) {
                    Rmax = result;
                }
            }
        }
        System.out.println("Максимальное значение R: " +  (Rmax != -1 ? Rmax : -1));
    }
}

public class ratarata {
    private static float mean(float[] numbers) {

        int[] data = {1, 2, 3, 4};

        double temp1 = 0;
        double temp2 = 0;
        double nilaiRata2 = 0;

        for (int value : data) {
            temp1 += value;
        }
        temp2 = data.length;

        nilaiRata2 = temp1 / temp2;

        return (float) nilaiRata2;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(mean(value)); // 2.5
    }
}
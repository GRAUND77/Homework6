public class Main {
    public static void main(String[] args) {

        //Task1
        int[] years = new int[3];
        years[0] = 1;
        years[1] = 2;
        years[2] = 3;

        float[] weights = {1.57f, 7.654f, 9.986f};

        double[] heights = new double[5];
        heights[0] = 56.78;
        heights[1] = 45.67;
        heights[2] = 123.7;
        heights[3] = 567.77;
        heights[4] = 43.98;

        //Task2
        for (int i = 0; i < years.length; i = i + 1) {
            System.out.print(years[i]);
            if (i != years.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i]);
            if (i != heights.length - 1)
                System.out.print(", ");
        }
        //Task3
        System.out.println();
        for (int i = years.length - 1; i >= 0; i = i - 1) {
            System.out.print(years[i]);
            if (i >= years.length - 2)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = weights.length - 1; i >= 0; i = i - 1) {
            System.out.print(weights[i]);
            if (i >= weights.length - 2)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = heights.length - 1; i >= 0; i = i - 1) {
            System.out.print(heights[i]);
            if (i >= heights.length - 4)
                System.out.print(", ");
        }
        //Task4
        System.out.println();
        for (int i = 0; i < years.length; i++) {
            if (years[i] % 2 != 0)
                years[i]++;
            System.out.print(years[i]);
            if (i <= years.length - 2)
                System.out.print(", ");

        }

    }
}
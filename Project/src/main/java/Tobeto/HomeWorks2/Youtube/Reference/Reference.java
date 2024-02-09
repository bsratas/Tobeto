package HomeWorks.HomeWorks2.Youtube.Reference;

public class Reference {
        public static void main(String[] args) {

            int[] numbers1 = {1,2,3};
            int[] numbers2 = {10,20,30};

            System.out.println(numbers1[0]);
            System.out.println(numbers1[1]);
            System.out.println(numbers1[2]);
            System.out.println("         ");

            System.out.println(numbers2[0]);
            System.out.println(numbers2[1]);
            System.out.println(numbers2[2]);
            System.out.println("         ");


            numbers1 = numbers2;


            System.out.println(numbers1[0]);
            System.out.println(numbers1[1]);
            System.out.println(numbers1[2]);
            System.out.println("         ");

            System.out.println(numbers2[0]);
            System.out.println(numbers2[1]);
            System.out.println(numbers2[2]);
            System.out.println("         ");


            numbers2[0] = 1000;
            System.out.println(numbers2[0]);
            System.out.println(numbers1[0]);
        }
    }


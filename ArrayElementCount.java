package academy.devonline.java.basic.section01_setup.section06_setup;

public class ArrayElementCount {
    public static void main(String[] args) {
        int [] array ={5,2,3,4,4,3,3,2,2,2,2,2,2};
        var rav = 2;
        var coun = 0;
        for (int i = 0; i < array.length; i++) {
                if (array[i]== rav){
                    coun++;
                }
        }
        System.out.println(coun);
    }
}

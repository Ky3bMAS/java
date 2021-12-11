package work1;


public class Main {

    static void pun3( int[] array ) {
        System.out.print("Pun 3: ");
        int s = 0;
        for (int i = 0; i < array.length; i++){
            s+=array[i];
        }
        System.out.print(s + " ");
        s = 0;
        int wat = 0;
        while (wat < array.length){
            s+=array[wat];
            wat++;
        }
        System.out.print(s + " ");
        wat = 0;
        s = 0;
        do{
            s+=array[wat];
            wat++;
        }while(wat < array.length);
        System.out.println(s + " ");
    }

    static void pun4( String[] array ) {
        System.out.print("Pun 4: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void pun5() {
        System.out.print("Pun 5: ");
        for (float i = 1; i <= 10; i++){
            System.out.print(String.format("%.2f", 1/i) + " ");
        }
        System.out.println();
    }

    static void pun6() {
        System.out.print("Pun 6: ");
        int count = (int) Math.round(Math.random()*100);
        int a[] = new int[count];
        for (int i = 0; i < count; i++){
            a[i] = (int) Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void pun7(int x) {
        System.out.print("Pun 7: ");
        int c = (int) Math.round(Math.random()*100);
        int a = 1;
        for (int i = 2; i <= x; i++){
            a *= i;
        }
        System.out.println(a);
    }

    static void pun8() {
        System.out.print("Pun 8: ");
        int count = (int) Math.round(Math.random()*100);
        int a[] = new int[count];
        for (int i = 0; i < count; i++){
            a[i] = (int) Math.round(Math.random()*100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 7};
        String[] arrStr = {"One", "Two"};
        pun3(arr);
        pun4(arrStr);
        pun5();
        pun6();
        pun7(3);
    }
}

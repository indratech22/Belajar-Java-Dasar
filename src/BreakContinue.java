public class BreakContinue {

    public static void main(String[] args) {

        var number = 1;

        while (true){
            System.out.println("perulangan ke -" + number);
            number++;

            if (number > 11){
                break;
            }

            for (;number <=100;number++){
                if (number % 2 ==0){
                    continue;
                }
                System.out.println("Bilangan Ganjil Ke-" +number);
            }
        }

    }

}

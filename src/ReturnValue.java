public class ReturnValue {

    public static void main(String[] args) {
        var a = 10;
        var b = 15;
        var c = hitung(a, b);

        System.out.println(c);

        System.out.println(hitung2(20, "l", 20));

    }

    static int hitung(int nilaiA, int nilaiB) {
        var total = nilaiA + nilaiB;
        return total;
    }

    static int hitung2(int nilai1, String operator, int nilai2) {
        switch (operator) {
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            default:
                return 0;
        }

    }
}

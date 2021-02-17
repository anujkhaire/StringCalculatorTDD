public class StringCalculator {
    private String str;
    StringCalculator(){}
    StringCalculator(String str){
        this.str = str;
    }

    Integer calculate(String str){
        if(str.isEmpty()) return 0;
        return -1;
    }

    public static void main(String[] args){
        String str = "";
        StringCalculator stringCalculator = new StringCalculator(str);
        stringCalculator.calculate(str);
    }
}


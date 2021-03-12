import java.util.ArrayList;
import java.util.List;

/**
 * 412.Fizz Buzz
 */
public class Solution0412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String s;
        for (int i = 1; i<=n;i++){
            s = turn(i);
            list.add(s);
        }
        return list;
    }

    private String turn(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return Num.FB.getValue();
        } else if (i % 3 == 0) {
            return Num.F.getValue();
        } else if (i % 5 == 0){
            return Num.B.getValue();
        } else {
            return String.valueOf(i);
        }
    }

    enum Num {
        F("Fizz"),B("Buzz"),FB("FizzBuzz")
        ;

        private String value;

        Num(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}


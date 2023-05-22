package Lesson29;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        TestInferenceType tit = new TestInferenceType();
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array = new String[] {"a", "b"};
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList<String> al = new ArrayList<>();
        for(var s: al) {
            System.out.println(s);
        }
//        var h; - переменная должна быть сразу инициализирована
//        var n = null;
    }
    static double abc() {
        return 3.14;
    }
}
class TestInferenceType {
//    Так писать нельзя, var можно использовать лишь локально (в методах или блоках кода)
//    var v = 10;
}
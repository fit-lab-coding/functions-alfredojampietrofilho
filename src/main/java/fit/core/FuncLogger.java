package fit.core;

import java.util.function.Function;

public class FuncLogger {

    public static Function<String, String> create(String prefixo) {
        return str -> {
            var text = String.format("%s %s", prefixo, str);
            System.out.println(text);

            return text;
        };   
    }
    
}

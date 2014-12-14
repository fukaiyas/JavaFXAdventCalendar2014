package sample;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JSCall {
    public static void main(String... args)throws Exception{
        ScriptEngineManager man = new ScriptEngineManager();
        ScriptEngine engine = man.getEngineByName("nashorn");
        engine.eval("Java.type('sample.JSCall').callback('static method');");
    }

    public static void callback(String message){
        System.out.println(message);
    }
}

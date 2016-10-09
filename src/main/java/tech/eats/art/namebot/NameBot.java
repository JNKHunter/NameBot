package tech.eats.art.namebot;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 9/26/16.
 */

public class NameBot {

    public static boolean isClassNameBad(String className){

        Boolean verdict = false;

        if(!Character.isUpperCase(className.charAt(0))){
            verdict = true;
        }

        return verdict;
    }

    public static boolean isMethodNameBad(String methodName){
        Boolean verdict = false;

        if(Character.isUpperCase(methodName.charAt(0))){
            verdict = true;
        }

        return verdict;
    }

    public static List<String> getBadMethodNames(Class<?> clazz) {


        Method[] methods = clazz.getDeclaredMethods();
        List<String> badMethodNames = new ArrayList<>();

        for(Method method : methods){
            if(isMethodNameBad(method.getName())){
                badMethodNames.add(method.getName());
            }
        }

        if(badMethodNames.isEmpty()) {
            return null;
        }else{
            return badMethodNames;
        }
    }
}

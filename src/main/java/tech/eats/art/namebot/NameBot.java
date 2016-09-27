package tech.eats.art.namebot;

import java.lang.reflect.Method;

/**
 * Created by John on 9/26/16.
 */
public class NameBot {

    public static boolean isClassNameTurrible(String className){

        Boolean verdict = false;

        if(!Character.isUpperCase(className.charAt(0))){
            verdict = true;
        }

        return verdict;
    }

    public static boolean isMethodNameTurrible(String methodName){
        Boolean verdict = false;

        if(Character.isUpperCase(methodName.charAt(0))){
            verdict = true;
        }

        return verdict;
    }

    public static boolean isClassTurrible(Class<?> clazz) {

        Boolean verdict = false;

        Method[] methods = clazz.getDeclaredMethods();

        for(Method method : methods){
            if(isMethodNameTurrible(method.getName())){
                verdict = true;
            }
        }

        return verdict;
    }
}

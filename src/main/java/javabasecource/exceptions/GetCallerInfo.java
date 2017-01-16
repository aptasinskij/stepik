package javabasecource.exceptions;

/**
 * Created by andrew on 15.01.17.
 */
public class GetCallerInfo {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod(){
        System.out.println(getCallerClassAndMethodName());
    }

    /**
     * @return className#methodName з якого було викликано даний метод
     * */
    public static String getCallerClassAndMethodName(){
        String result = null;
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        if (traceElements.length > 3){
            result = traceElements[3].getClassName() + "#" + traceElements[3].getMethodName();
        }
        return result;
    }

}

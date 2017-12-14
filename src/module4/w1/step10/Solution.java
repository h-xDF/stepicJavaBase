package module4.w1.step10;

public class Solution {

    public static void main(String[] args) {

        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String message = "";
        if(stackTraceElements.length >= 4) {
            StackTraceElement element = stackTraceElements[3];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            message = className + "#" + methodName;
            return message;
        } else {
            return null;
        }
        /*for(StackTraceElement stack: stackTraceElements) {
            System.out.println(stack);
        }*/
    }
}

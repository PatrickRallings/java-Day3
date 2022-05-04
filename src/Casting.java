public class Casting {
    public static void main(String[] args) {
        //#1
        double doubleNum = 112.35;
        int intNum = (int)doubleNum;
        System.out.println("Double: "+doubleNum+"\nInteger: "+intNum);
        //#2
        String stringVal = "49";
        Integer intVal = Integer.parseInt(stringVal);
        System.out.println("The string value is: "+stringVal+"\nThe integer value is: "+intVal);
    }

}
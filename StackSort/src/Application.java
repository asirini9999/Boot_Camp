//import java.util.Iterator;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {

        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        firstStack.push(15);
        firstStack.push(20);
        firstStack.push(3);
        firstStack.push(13);
        firstStack.push(10);
        firstStack.push(1);


        int sizeFStack = firstStack.size();

        int firstElementF = firstStack.elementAt(0);

        System.out.println(firstElementF);

        int secondElementF = firstStack.elementAt(1);

        System.out.println(secondElementF);

        while (secondStack.isEmpty()) {


            if (firstElementF > secondElementF) {
                secondStack.push(firstElementF);
            } else {
                secondStack.push(secondElementF);
            }
        }

        System.out.println(secondStack.elementAt(0));


        while (!firstStack.isEmpty()) {

            for (int i = 0; i < sizeFStack - 1; i++) {


                int eleOne = firstStack.indexOf(i);
                int eleTwo = firstStack.indexOf(i + 1);

                if (firstStack.indexOf(i) > firstStack.elementAt(i + 1)) {

                    secondStack.push(eleOne);

                } else {

                    secondStack.push(eleTwo);
                }

            }

            System.out.println("Sorted stack: " +firstStack);
            break;

        }
    }



}











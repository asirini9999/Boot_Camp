

import java.util.Stack;

public class Application {

    public static void main(String a[]){

        Stack<Integer> firstStack = new Stack<>();
        firstStack.add(15);
        firstStack.add(20);
        firstStack.add(3);
        firstStack.add(13);
        firstStack.add(10);
        firstStack.add(1);


        System.out.println("Sorted stack: " +letsSort(firstStack));
    }




    public static Stack<Integer> letsSort(Stack<Integer> firstStack){

            Stack<Integer> secondStack = new Stack<>();

            while(!firstStack.isEmpty()){
                int temp = firstStack.pop();

                while(!secondStack.isEmpty() && secondStack.peek() > temp) {
                    firstStack.push(secondStack.pop());
                }
                secondStack.push(temp);

            }

            return secondStack;
        }





}



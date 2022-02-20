import java.util.*;

class ArrayListIteration {
	
 List<Integer>listNumber = Arrays.asList(10, 20, 30, 40, 50);
 
 public void usingForLoop() {
 System.out.println("Using For Loop:");
 for (int i = 0; i < listNumber.size(); i++)
 System.out.print(listNumber.get(i) + " ");
 }

 public void usingWhileLoop() {
 System.out.println("\nUsing While Loop:");
 int val = 0;
 while (listNumber.size() > val) {
 System.out.print(listNumber.get(val) + " ");
 val++ ;
 }
 }

 public void usingAdvanceForLoop() {
 System.out.println("\nUsing Advance For Loop:");
 for(int i:listNumber) System.out.print(i+" ");
 }
}

public class Question3 {
 public static void main(String[] args) {
 ArrayListIteration ali = new ArrayListIteration();
 ali.usingForLoop();
 ali.usingWhileLoop();
 ali.usingAdvanceForLoop();
 }
}


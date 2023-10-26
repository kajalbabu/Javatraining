import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class collections {
    public static void main(String[] args){
        //List
        //ArrayList
        List<Integer> number= new ArrayList<>();
        number.add(1);
        number.add(5);
        number.add(9);
        System.out.println("List of arraylist: "+number);
        System.out.println("Removed number: "+number.remove(1));
        System.out.println("Accessed number: "+number.get(0));

        //LinkedList
        List<Integer> number1=new LinkedList<>();
        number1.add(8);
        number1.add(10);
        number1.add(4);
        System.out.println("List of linkedlist: "+number1);
        System.out.println("Removed number: "+number1.remove(1));
        System.out.println("Accessed number: "+number1.get(0));
        System.out.println("Position of 4:"+number1.indexOf(4));


        //Vector
        Vector<Integer> number2=new Vector<>();
        number2.add(3);
        number2.add(9);
        number2.add(6);
        System.out.println("List of vector: "+number2);
        Vector<Integer> number3=new Vector<>();
        number3.add(10);
        number3.add(9);
        number3.addAll(number2);
        System.out.println("New vector: "+number3);
        System.out.println("Accessed number: "+number3.get(0));
        System.out.println("Removed number: "+number3.remove(1));
        number3.clear();
        System.out.println(number3);


        //Queue
        //ArrayDeque
        ArrayDeque<String> animals = new ArrayDeque<>();
        animals.add("dog");
        animals.addFirst("goat");
        animals.addLast("cat");
        System.out.println("Array queue: "+animals);
        System.out.println("First Element: "+animals.peekFirst());
        System.out.println("Remove last Element: "+animals.pollLast());

        //PriorityQueue
        PriorityQueue<Integer> number4 = new PriorityQueue<>();
        number4.add(7);
        number4.add(5);
        number4.add(3);
        System.out.println("priority queue: "+number4);
        System.out.println("First element: "+number4.peek());
        System.out.println("Last element: "+number4.poll());



        //Set
        //HashSet
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(3);
        set.add(4);
        System.out.println("Hash set1: "+set);
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(5);
        set1.add(9);
        System.out.println("Hash set2: "+set1);
        set.addAll(set1);
        System.out.println("Add all: "+set);
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = set.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }



        //LinkedHashset
        LinkedHashSet<Integer> number5 = new LinkedHashSet<>();
        number5.add(2);
        number5.add(5);
        number5.add(6);
        System.out.println("LinkedHashSet: " + number5);
        boolean i=number5.remove(2);
        System.out.println("item removed: "+i);


        //Sortedset
        SortedSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(5);
        numbers1.add(4);
        System.out.println("SortedSet: " + numbers1);
        System.out.println("First Number: " + numbers1.first());
        System.out.println("Last Number: " + numbers1.last());
        System.out.println("Remve number: " + numbers1.remove(2));


        //Treeset
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
        System.out.println("higher: " + numbers.higher(4));
        System.out.println("lower: " + numbers.lower(4));
        System.out.println("ceiling: " + numbers.ceiling(4));
        System.out.println("floor: " + numbers.floor(3));


    }
}

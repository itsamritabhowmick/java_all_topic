import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        // insert element in the arrayList
        arr.add(45);
        arr.add(89);
        arr.add(25);

        // display the ArrayList
        System.out.println("The elements present in the arrayList are: " + arr);

        // add first element in the arrayList
        arr.addFirst(50);
        System.out.println("After insert the element in the first position: " + arr);

        // add Last element in the arrayList
        arr.addLast(30);
        System.out.println("After insert the element in the last position: " + arr);

        // to insert the element of the particular index
        arr.add(3, 10);
        System.out.println("After insert a element at the particular index: " + arr);

        // to get the element of the particular index
        int elem1 = arr.get(2);
        System.out.println("The particular elements is : " + elem1);

        // to get the first element of the arraylist
        int elem2 = arr.getFirst();
        System.out.println("The first element is: " + elem2);

        // to get the last element of the arraylist
        int elem3 = arr.getLast();
        System.out.println("The Last element is: " + elem3);

        // to modify arraylist elements
        arr.set(4, 125);
        System.out.println("After modify element the arrayList is: " + arr);

        // search index of the particular element
        int srch = arr.indexOf(89);
        System.out.println("It is the index of 89 : " + srch);

        // search Last index of the particular element
        int lstsrch = arr.lastIndexOf(30);
        System.out.println("It is the index of las element 30: " + lstsrch);

        // size of the arraylist
        int size = arr.size();
        System.out.println("The size of the arrayList is: " + size);

        // emptyness of arraylist
        boolean isEmpty = arr.isEmpty();
        System.out.println(isEmpty);

        // added multiple elements
        Collections.addAll(arr, 56, 11, 4, 50, 99);
        System.out.println("After added multiple elements : " + arr);

        // reverse the arraylist
        Collections.reverse(arr);
        System.out.println("After reversing the arraylist: " + arr);

        // to find the maximum element in the arraylist
        int max = Collections.max(arr);
        System.out.println("The maximum element is: " + max);

        // to find the minimum element in the arraylist
        int min = Collections.min(arr);
        System.out.println("The minimum element is: " + min);

        // to sort the arraylist
        Collections.sort(arr);
        System.out.println("After sorted all elements: " + arr);

        // remove one elements from arraylist
        arr.remove(2);
        System.out.println("After removing one elements from the arraylist: " + arr);

        // remove first element
        arr.removeFirst();
        System.out.println("After remove the first element: " + arr);

        // remove last element
        arr.removeLast();
        System.out.println("After remove the last element: " + arr);

        // remove first occurence of the given value from the arraylist
        arr.remove(Integer.valueOf(50));
        System.out.println("The array is: " + arr);

        // clearing the arraylist
        arr.clear();
        System.out.println("Now the arraylist like: " + arr);
        sc.close();
    }
}
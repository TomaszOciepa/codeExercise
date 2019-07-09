//Write a method that returns the index of the first occurrence of given integer in a list.
//Assume that the index of the first element in the list is zero.
//If the number does not exist return -1.

public class LinearSearch {



    public void showList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    public int linearSearch(int n, int[] list) {
        for (int i = 0; i < list.length ; i++) {
            if (list[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

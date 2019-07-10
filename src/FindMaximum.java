//Write a method that returns the largest integer in the list.
//You can assume that the list has at least one element.

public class FindMaximum {

    public Integer maximum(Integer[] list) {

      Integer max = 0;

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }

        return max;
    }

    public void showList(Integer[] list){
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i]+", ");
        }
    }
}

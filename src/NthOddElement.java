//Write a method that returns th nth element of a list. If the index of the element exceeds the list size, then return -1.

import java.util.List;

public class NthOddElement {

    public Integer getElement(List<Integer> list, Integer n) {

        if (n >= list.size()) {
            return -1;
        } else {
            return list.get(n);
        }
    }

    public void showList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}

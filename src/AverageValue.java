//Write a method that returns the average of a list of integers.

import java.util.List;

public class AverageValue {

    public Double average(List<Integer> list){

        return list.stream().mapToInt(i -> i).average().getAsDouble();
}

public Double average2(List<Integer> list){
        double sum = 0;


    for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
    }

    double average = sum / list.size();
    return average;


}
}

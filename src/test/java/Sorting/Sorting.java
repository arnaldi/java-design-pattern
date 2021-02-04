package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sorting {

    @Test
    void bubbleSort(){
        boolean isSwitch = false;
        List<Integer> intList = Arrays.asList(10,6,23,4,13,7,35);
        do {
            isSwitch = false;
            for(int i =0; i < intList.size()-1; i++){
                if(intList.get(i+1) < intList.get(i) ){
                    Integer temp = intList.get(i+1);
                    intList.set(i+1,intList.get(i));
                    intList.set(i,temp);
                    isSwitch = true;
                }
            }

        }while(isSwitch);

        List<Integer> intListExpected = Arrays.asList(4,6,7,10,13,23,35);
        Assertions.assertArrayEquals(intListExpected.toArray(), intList.toArray());
    }

    @Test
    void insertSort(){
        List<Integer> intList = Arrays.asList(10,6,23,4,13,7,35);
        List<Integer> intListExpected = Arrays.asList(4,6,7,10,13,23,35);

        List<Integer> sortedList = new LinkedList<>();

        outerLoop : for(Integer i : intList){
            for(int j =0; j<sortedList.size(); j++){
                if(i < sortedList.get(j)){
                    sortedList.add(j,i);
                    continue outerLoop;
                }
            }
            sortedList.add(sortedList.size(),i);
        }
        Assertions.assertArrayEquals(intListExpected.toArray(), sortedList.toArray());
    }

    @Test
    void quickSort(){

        List<Integer> intList = Arrays.asList(10,6,23,4,13,7,35);
        List<Integer> intListExpected = Arrays.asList(4,6,7,10,13,23,35);
        List<Integer> sortedList = quickSrt(intList);
        sortedList.stream().forEach((Integer i)-> System.out.println(i));
        Assertions.assertArrayEquals(intListExpected.toArray(), sortedList.toArray());
    }

    private List<Integer> quickSrt(List<Integer> inputList){
        if(inputList.size() < 2){
            return inputList;
        }

        Integer pivot = inputList.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();
        for(int i = 1; i < inputList.size(); i++){
            if(inputList.get(i) < pivot){
                lower.add(inputList.get(i));
            }else{
                higher.add(inputList.get(i));
            }
        }
        final List<Integer> sorted = quickSrt(lower);

        sorted.add(pivot);
        sorted.addAll(quickSrt(higher));

        return sorted;
    }

    @Test
    void mergeSort(){
        List<Integer> intList = Arrays.asList(10,6,23,4,13,7,35);
        List<Integer> intListExpected = Arrays.asList(4,6,7,10,13,23,35);
        List<Integer> sortedList = mergeSrt(intList);
        Assertions.assertArrayEquals(intListExpected.toArray(), sortedList.toArray());
    }

    List<Integer> mergeSrt(List<Integer> numbers){
        if (numbers.size() < 2){
            return numbers;
        }
        int middleIndex = numbers.size() / 2 ;
        List<Integer> leftList = numbers.subList(0, middleIndex);
        List<Integer> rightList = numbers.subList(middleIndex, numbers.size());

        List<Integer> sortedLeft = mergeSrt(leftList);
        List<Integer> sortedRight = mergeSrt(rightList);

        return merge(sortedLeft,sortedRight);
    }

    private List<Integer> merge(List<Integer> sortedLeft, List<Integer> sortedRight) {
        int leftPtr = 0;
        int rightPtr = 0;
        List<Integer> toReturn = new LinkedList<>();

        while (leftPtr < sortedLeft.size() && rightPtr < sortedRight.size()){
            if(sortedLeft.get(leftPtr) < sortedRight.get(rightPtr)){
                toReturn.add(sortedLeft.get(leftPtr));
                leftPtr ++;
            }else{
                toReturn.add(sortedRight.get(rightPtr));
                rightPtr ++;
            }
        }

        while (leftPtr < sortedLeft.size()){
            toReturn.add(sortedLeft.get(leftPtr));
            leftPtr ++;
        }

        while (rightPtr < sortedRight.size()){
            toReturn.add(sortedRight.get(rightPtr));
            rightPtr ++;
        }

        return toReturn;
    }

}

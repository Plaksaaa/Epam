package by.epamtc.krukovichmaxim.task03.array_task.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    private int[] array;

    public Array() {
    }

    public Array(Array array) {
        this.array = array.array;
    }

    public Array(int[] array) {
        this.array = array;
    }

    public int getMax(int[] array) {
        int max = array[0];

        for (int digit : array) {
            if (digit > max)
                max = digit;
        }
        return max;
    }

    public int getMin(int[] array) {
        int min = array[0];

        for (int digit : array) {
            if (digit < min)
                min = digit;
        }
        return min;
    }

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = (array.length - 1); j >= (i + 1); j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
    }

    public void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && current < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    public int[] selectionSort(int[] array) {
        for (int leftInd = 0; leftInd < array.length; leftInd++) {
            int minInd = leftInd;
            for (int i = leftInd; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, leftInd, minInd);
        }
        return array;
    }

    public int[] printPrimeNumbers(int[] array) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int number : array) {
            if (isPrime(number)) {
                temp.add(number);
            }
        }
        return copy(temp);
    }

    public int[] copy(ArrayList<Integer> oldArray) {
        int[] newArray = new int[oldArray.size()];

        for (int i = 0; i < oldArray.size(); i++) {
            newArray[i] = oldArray.get(i);
        }
        return newArray;
    }

    public int binarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int[] findFibonacciNumbers(int[] array) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int number : array) {
            if (isFibonacci(number)) {
                temp.add(number);
            }
        }
        return copy(temp);
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isFibonacci(int number) {
        return (Math.sqrt(Math.pow(number, 2) * 5 - 4)) % 1 == 0
               || (Math.sqrt(Math.pow(number, 2) * 5 + 4)) % 1 == 0;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int length() {
        return this.array.length;
    }

    public int get(int index) {
        return array[index];
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;

        Array array = (Array) o;

        if (this.array.length != array.array.length) {
            return false;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != array.array[i]) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.array);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
               "array=" + Arrays.toString(array) +
               '}';
    }
}

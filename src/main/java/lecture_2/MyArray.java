package lecture_2;

public class MyArray {
    int[] arr;

    public MyArray(int arrLength) {
        this.arr = new int[arrLength];
    }

    public void showArr() {
        for(int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public int[] addElement(int element) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == 0) {
                arr[index] = element;

                break;
            }
            else if(index == arr.length - 1 && arr[index] != 0) {
                int[] arrCopy = arr;
                arr = new int[arrCopy.length + 1];

                for (int i = 0; i < arrCopy.length; i++) {
                    arr[i] = arrCopy[i];
                }
                arr[arr.length - 1] = element;

                break;
            }
        }
        return arr;
    }

    public int[] deleteElement(int indexOfElement) {
        int[] arrCopy = arr;
        arr = new int[arrCopy.length - 1];

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if(i == indexOfElement && i < arr.length - 1) {
                arr[i] = arrCopy[i+1];
                flag = true;
            }
            else {
                if(flag) {
                    arr[i] = arrCopy[i + 1];
                }
                else arr[i] = arrCopy[i];
            }
        }
        return arr;
    }
}

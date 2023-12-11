package ss3.TimViTriGiaTriNhoNhat;

public class TimViTriGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9};
        int index = minValue(array);
        System.out.println("phan tu nho nhat trong mang " + array[index]);

    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}


public class Main {
    public static void main(String[] args) {
        //Reverse the num
//        int x = 356;
//        int result = 0;
//
//while (x !=0){
//    result = result * 10 + x % 10;
//    x = x/ 10;
//}
       
        // Task: Reverse the array
//        int [] array = {45,689,457,214,698}; // revers this array
//        for(int i = 0; i < array.length/2;i++){
//            int temp = array[i];
//            array[i] = array[array.length -1 -i];
//            array [array.length-1-i] = temp;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+ " ");
//        }



        //Task 51
//        int num = 123;
//        boolean t = false;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        if (c == a + b) t = true;
//        System.out.println(t);

         //Task 52
//        int num = 123;
//        boolean t = false;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        if (a == b || a == c || b == c) t = true;
//        System.out.println(t);

        //Task 53
//        int k = 4676;
//        int num = 999;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        double numDouble = num;
//
//        if(num > k) System.out.println(numDouble / (a + b + c));
//        else System.out.println(c / numDouble);

        //Task 54
//        int num = 123;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        int max = a;
//        max = max < b ? b : a;
//        max = max < c ? c : max;
//        System.out.println(max);
//
        //Task 55
//        int num = 123;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        int min = a;
//        min = min > b ? b : a;
//        min = min > c ? c : min;
//        System.out.println(min);

        //Task 56
//        int num = 123;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        double numDouble = num;
//        if(c > b) System.out.println((a+b+c)/numDouble);
//        else System.out.println(num);

        //Task 57
//        int num = 323;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        double result1 = (double) b / c;
//        double result2 = (double)a / c;
//        if (num > 300) System.out.println(result1);
//        else System.out.println(result2);

         //Task 58
//        char f;
//        int num = 123;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        if(a+b < 5) f = 'a';
//        else f = 'b';
//        System.out.println(f);

        //Task 59,60
//        int num = 321;
//        int a = num / 100;
//        int b = (num / 10) % 10;
//        int c = num % 10;
//        int min,mid,max;
//        max = (a>b)&&(a>c) ? a : (b>a)&&(b>c) ? b : c;
//        min = (a<b)&&(a<c) ? a : (b<a)&&(b<c) ? b : c;
//        mid = (min<a)&&(a<max) ? a: (min<b)&&(b<max) ? b : (min<c)&&(c<max) ? c : 0;
//        System.out.println(min + " " + mid + " " + max);
//        System.out.println(max + " " + mid + " " + min);

        //Task 211
//        int [] arr = {12,-4235,324,31,-1324,1,324,13};
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > 0){
//                sum += arr[i];
//                count++;
//            }
//        }
//        System.out.println((double)sum / count);

        //Task 214
//        int [] arr = {12,-4235,324,31,-1324,1,324,13};
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < 0){
//                sum += arr[i];
//                count++;
//            }
//        }
//        System.out.println((double)sum / count);


    }
}
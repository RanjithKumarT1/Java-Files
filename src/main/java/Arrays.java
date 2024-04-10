public class Arrays {


        public static void main(string1[] args) {
            //Sum of Elements in Array
       /* int a[] = {1,2,3,4,5};
        int sum = 0;*/
       /* for (int i =0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println(sum);*/

            //Enhanced for loop

       /* for (int value : a){
            sum = sum+value;
        }
        System.out.println(sum);
*/

            //Print Even and Odd numbers

      /*  int a[] = {1,2,3,4,5,6};
        System.out.println("even numbers");
        for (int i = 0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }

        System.out.println("Odd numbers");
        for (int i = 0;i<a.length;i++){
            if (a[i]%2!=0){
                System.out.println(a[i]);*/
        /*    }
        }
        */
            // searching of an element in array

       /* int a[] =  {10,20,30,40,50};
        int search_element = 30;
        boolean status = false;
        for (int i = 0; i<a.length;i++){
            if (a[i]== search_element){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if (status= false){
            System.out.println("Element Not found");
        }*/

            // how many duplicate values in array

        /*int a[] = {100,200,300,100,100,400};
        int num = 100;
        int count = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i] == num){
                count++;

            }
        }
        System.out.println(count);
*/
            // sorting numbers in array

        /*int a[] = {300,500,200,600,100,400};
        System.out.println(Arrays.toString(a));
        Arrays.sort*/

            // Array elements in reserve order

       /* int a[]= {100,200,300,400,500};
        for (int i= a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }*/

            // a number input from console window

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(num);*/

            //taking multiple inputs from keyboard

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Addition of two num : " + (num1+num2));
*/
            // taking inputs with different datatypes
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter Age :");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("Enter Unknow Value ");
        Object value = sc.next();
        System.out.println(value);*/


            //reading and writing the inputs from console


        /*int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i= 0;i<a.length;i++){
            System.out.println("Enter a Value");
            a[i] = sc.nextInt();
        }
        System.out.println("printing Elements");*/
            //System.out.println(Arrays.toString(a));

            // Assignment sorting array

            // find missing number in array

           /* int a[] = {1, 4, 5, 3};
            int missing_num = ;
            System.out.println("The missing number is : " + missing_num);*/


        }


    }


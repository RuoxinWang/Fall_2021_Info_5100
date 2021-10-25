package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;

        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("rem = " + rem);

        a += 2;
        b -= 1;
        boolean bValue = true;
        bValue = !bValue;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("bValue = " + bValue);

        a++; //a = a+1
        b--; //b = b-1
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if( bValue == true) {//if(bValue) is same as if(bValue == true), if(!bValue) is same as if(bValue==flase)
            System.out.println("Boolean value is true");
        }

        if(b > 10){
            System.out.println("b's value is greater than 10");
        }else{
            System.out.println("b's value is less than 10");
        }

        // == equal to
        // != not equal to
        // > greater than
        // >= greater than equal to
        // < less than
        // <= less than equal to

        // if b ==10 and a > 22 then print
        a = 25;
        b += 7;

        if( b == 10 ){
            if( a > 22 ){
                System.out.println("b's value is 10 and a's value is greater than 22");
            }
        }

        //conditional operators
        // && and
        // || or condition
        // ? :

        if( b == 10 && a > 22){
            System.out.println("b's value is 10 and a's value is greater than 22");
        }

        b--;
        if( b== 10 || a > 22){
            System.out.println("b's value is 10 and a's value is greater than 22");
        }

        int result = 5;
        if( b > 10){
            result = 10;
        }else{
            result = 15;
        }
        // result = (conditional expression) ? value 1 : value 2;
        b = 18;
        result = b > 10 ? 10 : 15;

        if( b < 10){
            System.out.println("b is less than 10");
        }else if( a > 28){
            System.out.println("a is greater than 28");
        }//else

        // beta operator
        // 0 & 0 == 0
        // 0 & 1 == 0
        // 1 & 0 == 0
        // 1 & 1 == 1
        // 0 | 0 == 0
        // 0 | 1 == 1
        // 1 | 0 == 1
        // 1 | 1 == 1
        // 0 ^ 0 == 0
        // 0 ^ 1 == 1
        // 1 ^ 0 == 1
        // 1 ^ 1 == 0
        // !0 == 1
        // !1 == 0

        //loops



        int[] arr = {2, -3, 9, 4, 3};
        System.out.println(arr[3]);

        for(int i = 0; i < arr.length; i ++){ // i <= arr.length -1
            System.out.println("Value of i = " + i);
            System.out.println("Value of arr[i] =" + arr[i]);
        }

        for (int num : arr) {
            System.out.println("Value = " + num);
        }

        boolean[] bValues = {true, false, false, true};
        for (boolean booleanValue : bValues){
            System.out.println(booleanValue);
        }


        int count = 10;

        //while
        while( count > 0){
            System.out.println("count value = " + count);
            count --;
        }

        //do while
        do {
            System.out.println("count value = " + count);
            count --;
        } while( count > 0);

        char[] name = {'R','O','S','E','N'};

        for (Character ch : name){
            System.out.println(ch);
        }
        //System.out.println(name.);

        String Name ="Rosen";
        String lastName ="Wang";
        System.out.println(Name);
        System.out.println(lastName);

        Name = Name +" "+ lastName;
        System.out.println(Name);

        printName("Rosen", "Wang");

        printDayOfTheWeek(1);
        printMonth("Jan");
        printMonth("jan");


    }//End of the main function

    private static void  printName(String firstName, String lastName){
        String fullName = firstName + lastName;
        System.out.println("Name = " + fullName);
    }


    static void printDayOfTheWeek(int day){
        //Sun = 0, Mon = 1, Tue = 2, Wed = 3, Thu = 4, Fri = 5, Sat = 6

        switch(day){
            case 0 :
                System.out.println("Today is Sunday");
                break;
            case 1 :
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }


    /*
        if(day == 0){
            System.out.println("Today is Sunday");
        }else if(day == 1){
            System.out.println("Today is Monday");
        }else if(day == 2){
            System.out.println("Today is Tuesday");
        }else if(day == 3){
            System.out.println("Today is Wednesday");
        }else if(day == 4){
            System.out.println("Today is Thursday");
        }else if(day == 5){
            System.out.println("Today is Friday");
        }else if(day == 6){
            System.out.println("Today is Sat");
        }else{
            System.out.println("Invalid Day");
        }

     */

    }



    static void printMonth(String month){
        switch(month){//(month.toLowerCase())
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            case "Mar":
                System.out.println("March");
                break;
            case "Apr":
                System.out.println("April");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}//End of the class


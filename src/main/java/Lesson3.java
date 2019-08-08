public class Lesson3 {
    public static void main(String[] args){
        System.out.println("---------------Bài 1--------------");
        bai1();

        System.out.println();

        System.out.println("---------------Bài 2--------------");
        bai2();

        System.out.println();

        System.out.println("---------------Bài 3--------------");
        bai3();

        System.out.println();

        System.out.println("---------------Bài 4--------------");
        bai4();

        System.out.println();

        System.out.println("---------------Bài 5--------------");
        bai5();

        System.out.println();

        System.out.println("---------------Bài 6--------------");
        bai6();

        System.out.println();

        System.out.println("---------------Bài 7--------------");
        bai7();

        System.out.println();

        System.out.println("---------------Bài 8--------------");
        bai8();

        System.out.println();
    }
    private static void bai1(){
        System.out.println("Nguyễn Tùng Lâm");
    }

    private static void bai2(){
        int a = 7, b = 5, c = 6;
        double d = (6 * (a + b)) / 2;
        System.out.println("Diện tích hình thang = " + d);
    }

    private static void bai3(){
        int a = 3;
        double b = a * a * Math.PI;
        System.out.println("Diện tích hình tròn = " + b);
    }

    private static void bai4(){
        int a = 5, b = 6, c = 7;
        float p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích hình tam giác = " + s);
    }

    private static void bai5(){
        int x = 1234, y = 4321;
        double a = (x + y) / (x - y);
        System.out.println(a);
    }

    private static void bai6(){
        int x = 3;
        double a = Math.sqrt(x + Math.sqrt(x + Math.sqrt(x)));
        System.out.println(a);
    }

    private static void bai7(){
        int x = 6;
        double a = x * x * x + Math.log(x * x * x * x + 2) / Math.log(2) - Math.cbrt(x - 4);
        System.out.println(a);
    }

    private static void bai8(){
        int giay = 543200;
        int gio = 543200 / 3600;
        giay = giay % 3600;
        int phut = giay / 60;
        giay = giay % 60;
        System.out.println(gio + " giờ " + phut + " phút " + giay +" giay");
    }
}

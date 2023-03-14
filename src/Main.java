public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


    }

    public static void task3() {
        System.out.println("Задача 3");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);


    }
    public static void task4() {
        System.out.println("Задача 4");
        var boxerOne=78.2;
        var boxerTwo=82.7;
        var allMass=(boxerOne+boxerTwo);
        System.out.println("Общая масса боксеров  "+ allMass+"кг");
        var difference1=(boxerTwo-boxerOne);
        System.out.println("Разница по весу между боксерами  " +difference1+"кг");
        var difference=(boxerTwo%boxerOne);
        System.out.println("Разница по весу(остаток от деления)  "+difference+"кг");



    }
    public static void task5() {
        System.out.println("Задача 5");
        var allWorkTime=640;
        var workingTime=8;
        var unit=(allWorkTime/workingTime);
        System.out.println("Всего работников в компании "+unit+" человек");
         unit=unit+94;
         allWorkTime=unit*workingTime;
        System.out.println("Если в компании работает  "+unit+"  человек, то всего  "+allWorkTime+"  часов работы должно быть поделено между сотрудниками");


    }
}





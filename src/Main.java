public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    dog = dog  - 3.5;
    System.out.println(dog);
    cat = cat - 1.6;
    System.out.println(cat);
    paper = paper - 7639;
    System.out.println(paper);

        var friend = 19;
    System.out.println(friend);
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);

        var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
    System.out.println(boxerOne + boxerTwo);
    System.out.println(boxerOne - boxerTwo);

    System.out.println(boxerTwo - boxerOne);
    System.out.println(boxerTwo % boxerOne);

var totalTime = 640;
var onePersonHours = 8;
System.out.println("Всего сотрудников в компании - " + totalTime / onePersonHours );

var totalPeople = ((totalTime / onePersonHours) + 94);
var allTime = onePersonHours * totalPeople;
System.out.println("Если в компании работает " + totalPeople + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками ");

    }



}
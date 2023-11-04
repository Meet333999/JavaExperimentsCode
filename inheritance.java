import java.util.*;

public class Inheritance{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.Display();
        Reference_Book r1 = new Reference_Book();
        r1.Display();
        Magazine m1 = new Magazine();
        m1.Display();
    }
}

public class Book{

    public void Display(){
        String Name = (The Silence Of The Lambs");
        String Author = "Thomas Harris";
        int Volume = 2;
        System.out.println(Name + Author + Volume);
    }
}

public class Reference_Book extends Book{

    @Override void Display(){
        String Name = "The Da Vinci Code";
        String Author = " Dan Browm ";
        int Volume = 1;
        System.out.println(Name + Author + Volume);
    }
}

public class Magazine extends Book{

    @Override void Display(){
        String Name = "India Today";
        String Author = " Publisher: Living Media India Limited";
        int Volume = 3;
        System.out.println(Name + Author + Volume);
    }
}
interface Animal{
    void eat();  
    void noise();
}
class Horse implements Animal{
    public void eat()
    { 
         System.out.println("I am eating");
    }
    public void noise()
    {
         System.out.println("I do neigh neigh");
    }
}
class Cat implements Animal{
     public void eat()
     {
            System.out.println("I eat cat food");
     }
     public void noise()
     {
            System.out.println("Meow-meow");
     }
}
public class InterfaceTesterUpdated{
     public static void main(String args[]){
          Horse h = new Horse();
          h.eat();
          h.noise();
          Cat c = new Cat();
          c.noise();
          c.eat();
    }


}


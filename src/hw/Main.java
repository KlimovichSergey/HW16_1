package hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        State city1 = new City(" Gotham ");
        State city2  = new City(" Atlantis ") ;
        State part1 = new Parts("Gotham region");

        State city3 = new City(" Thebes ");
        State city4 = new City(" Apple ");
        State part2 = new Parts(" Apple region");
        State part3 = new Parts(" Thebes region");

    Composite composite = new Composite();
    Composite composite1 = new Composite();

        composite.addState(city1);
        composite.addState(city2);
        composite.addState(part1);

        composite1.addState(city3);
        composite1.addState(city4);
        composite1.addState(part2);
        composite1.addState(part3);

        composite.information();
        composite1.information();
    }
}
class Facade{  
    City city = new City(" Random city");
    Parts parts = new Parts("Random region");

    void  add(){

    }
    void remove(){

    }

}
interface State {
    void information();
}
 class City implements State{
    private String name;
    public  City(String name) {
        this.name = name;
    }
    @Override
    public void information() {
        System.out.println(" Name city " + name);
    }

}

 class Parts implements  State{
    private String name;

    public Parts(String name) {
        this.name = name;
    }

    @Override
    public void information() {
        System.out.println(" Administrative part " + name);
    }
}
  class Composite implements State {

      List<State> components = new ArrayList <  > ();

      public void addState(State component) {
          components.add(component);
      }

      @Override
      public void information() {
          for (State component : components) {
              component.information();

          }
      }
  }

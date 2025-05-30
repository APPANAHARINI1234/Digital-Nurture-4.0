package program_19;
interface Playable{
    public void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Guitar");
    }
}

class Piano implements Playable{
     public void play(){
        System.out.println("Piano");
    }
}
//in interfaces the classes inherited should have all methods implemented
public class Interface {
    public static void main(String[] args) {
        Guitar gui = new Guitar();
        Piano pia = new Piano();
        gui.play();
        pia.play();
    }
}

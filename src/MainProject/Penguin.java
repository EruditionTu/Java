package MainProject;

public class Penguin extends Animal{
    public Penguin(String myName, int myId){
        super(myName,myId);
    }

    @Override
    public void move() {
        System.out.println("小企鹅也可以移动啦");
    }
}

package MainProject;

public class Mouse extends Animal{
    public Mouse(String myName, int myId) {
        super(myName, myId);
    }

    // 重写规则：
    // c
    @Override
    public void move() {
        super.move();
        System.out.println("鼠鼠我啊，可以移动啦");
    }
    public void move(int len){
        System.out.println((len));
    }
}

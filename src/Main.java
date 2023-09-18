public class Main {
    public static void main(String[] args) {
        Rectangle ro = new Rectangle();
        System.out.println(ro.Rectangle(new int[]{0,0,2,2} , new int []{1,1,3,3}));
        System.out.println(ro.Rectangle(new int[]{0,0,1,1} , new int []{1,0,2,1}));
        System.out.println(ro.Rectangle(new int[]{0,0,1,1} , new int []{2,2,3,3}));

    }
}
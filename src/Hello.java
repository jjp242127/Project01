/**
 * @author shkstart
 * @create 2019-01-07 下午 10:18
 */
public class Hello {


    /*
     * 用户姓名
     */
    private String name = "zhangSan";
    

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        String name = "nihao";
        System.out.println(name);
        //for循环
        int[] ints = {1,4,5,3,};
        for (int j = 0; j < ints.length; j++) {
            System.out.println(ints);
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}

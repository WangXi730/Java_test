public class test_2022_9_19 {
    public static void main(String[] args) {
        //内置类，4种8类
        //整型4类
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        //浮点数2类
        float f = 1.1f;
        double d = 2.2;
        System.out.println(f);
        System.out.println(d);
        //字符类型
        char c = 'c';
        System.out.println(c);
        //波尔类
        boolean bl = true;
        System.out.println(bl);

        //包装类
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        //字符串类
        String str = "hello";
        System.out.println(10+str);
        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        long l1 = (long)i1 + i2;
        System.out.println("l1 = " + l1);
    }
}

public class BaseSyntac {
    public static void main(String[] args){
        /*
         * 八大数据类型
         * */
        // 整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;
        // 浮点数
        float num21 = 0.1f;
        double num22 = 1.0/10;
        System.out.print(num21 == num22);
        float n21 = 1232434355f;
        float n22 = n21 + 1;
        System.out.print(n21==n22);
        double num23 = 3.14159265357589;
        // 字符
        char num31 = '可';
        char n31 = 'a';
        System.out.print((int)num31);
        System.out.print(n31);
        System.out.print((int)n31);
        // 布尔值
        boolean flag = true;
        boolean num42 = false;


        /*
        * 强制类型转换
        * 不能对 布尔值 进行转换
        * 不能把对象转换为不相干的类型
        * 在把高容量转换到低容量时，强制转换
        * 在转换时可能存在内存溢出，或者精度的问题
        * */
        System.out.print("\n==========强制类型转换============\n");
        System.out.print((int)23.6+"\n");
        System.out.print((int)-45.6+"\n");
        // 强制转换
        char c = 'a';
        int d = c + 1;
        System.out.print(d+"\n");
        System.out.print((char)d+"\n");
        // 内存溢出
        int money = 10_0000_0000;
        int year = 20;
        int salary_1 = money * year;
        System.out.print(salary_1+"\n");
        long salary_2 = money * (long)year;
        System.out.print(salary_2+"\n");

    }
}

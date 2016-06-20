public class Congtest{//文件名与类名不一致
    public static void main(String[] args){
        int i=1,j=2;
        float f1=0.1f;
        float f2=123;
        long l1=12345678,l2=99999999999L;
        double d1=2e20,d2=124; 
        byte b1=1,b2=2,b3=125;
        j=j+10;
        i=i/10;
        i=(byte)i*10;
        char c1='a',c2=125;
        byte b=b1-b2;//运算时先转化为int,需要加强制转换
        char c=c1+c2-1;//同上
        float f3=f1+f2;
        float f4=f1+f2*0.1f;
        double d=d1*i+j;
        float f=(float)(d1*5+d2);//不知道怎么括号是中文下编辑的
        System.out.println("b="+b);   
        System.out.println("c="+c);
        System.out.println("f3="+f3);
        System.out.println("f4="+f4);
        System.out.println("d="+d);
        System.out.println("f="+f);
    }
}
/*public class Contest{
    public static void main(String[] args){
        int i=1,j=2;
        float f1=0.1f;
        float f2=123;
        long l1=12345678,l2=99999999999L;
        double d1=2e20,d2=124; 
        byte b1=1,b2=2,b3=125;
        j=j+10;
        i=i/10;
        i=(byte)i*10;
        char c1='a',c2=125;
        byte b=(byte)(b1-b2);
        char c=(char)(c1+c2);
        float f3=f1+f2;
        float f4=f1+f2*0.1f;
        double d=d1*i+j;
        float f=(float)(d1*5+d2);
        System.out.println("b="+b);   
        System.out.println("c="+c);
        System.out.println("f3="+f3);
        System.out.println("f4="+f4);
        System.out.println("d="+d);
        System.out.println("f="+f);
    }
}*/
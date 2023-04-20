class TypeeCasting{
    public static void main(String[] args){
        byte c = 7;
        short d = c;
        char e = (char)d;
        int f = e;
        long g = f;
        float h = g;
        double i = h;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);


    }
}
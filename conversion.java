class conversion{
    public static void main (String args[]){
        byte b;
        int i=257;
        double d=357.257;
        b= (byte)i;
        System.out.println(b);
        i = (int)d;
        System.out.println(i);
        d= (double)b;
        System.out.println(d);

    }
}
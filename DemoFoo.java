import java.io.IOException;
import java.util.*;
class Football{
int Ga,Gb,Gc;
int a1,a2,b1,b2,c1,c2;
Football(int x,int y, int z){
    Ga=x;
    Gb=y;
    Gc=z;
}
boolean iscon(){
for(int i=0;i<=Ga;i++)
 { a1=i;
   a2=Ga-i;
 for(int j=0;j<=Gb;j++)
 { b1=j;
   b2=Gb-j;
 for(int k=0;k<Gc&&a1>b1;k++)
 { c1=k;
   c2=Gc-k;
 if(c1>a2&&b2>c2&&c1+c2==Gc)
  return true;
 }}}
 return false;
}
}
class DemoFoo{
public static void main(String arg[]) throws IOException{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
try{
    if(a<0||a>(int)Math.pow(10,9)||b<0||b>(int)Math.pow(10,9)||c<0||c>(int)Math.pow(10,9))
  {IOException e= new IOException();
  throw e;}
}
catch(IOException e){
System.out.println("Figures must be greater than or equal to zero, or less than or equal to 10^9");
}
Football f=new Football(a,b,c);
if(f.iscon())
System.out.println("YES");
else
System.out.println("NO");
}
}
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
 for(int k=0;k<Gc;k++)
 { c1=k;
   c2=Gc-k;
 if(a1>b1&&c1>a2&&b2>c2&&a1+a2==Ga&&b1+b2==Gb&&c1+c2==Gc)
  return true;
  else return false;
 }}}
 return false;
}
}
class DemoFoo{
public static void main(String arg[]){
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
Football f=new Football(a,b,c);
if(f.iscon())
System.out.println("YES");
else
System.out.println("NO");
}
}
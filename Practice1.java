import java.lang.*;
class Two extends Thread {
int i,p;
public void run(){
    for(i=1;i<=10; i++){
        p=2*i;
        System.out.println("Two"+p);
    }
}
}
class Three extends Thread {
int i,q;
public void run(){
    for(i=1;i<=10; i++){
        q=3*i;
        System.out.println("Three"+q);
    }
}
}
class Five extends Thread  {
int i,r;
public void run(){
    for(i=1;i<=10; i++){
        r=5*i;
        System.out.println("Five"+r);
    }
}
}
class Practice1{
    public static void main(String[] args) {
        new Two ().start();
        new Three().start();
        new Five().start();
    }
}
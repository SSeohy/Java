//7번
public class Java0609 {
    public static void main(String[] args){
        int []a = new int[8];
        int i=0;
        int n=10;
        while(n>0){
            a[i++] = n%2;
            n /= 2;
        }
        for(i=7; i>=0; i--)
            System.out.print(a[i]);
    }
}




//7번
// public class Java0609 {
//     public static void main(String[] args){
//         int []a = new int[8];
//         int i=0;
//         int n=10;
//         while(n>0){
//             a[i++] = n%2;
//             n /= 2;
//         }
//         for(i=7; i>=0; i--)
//             System.out.print(a[i]);
//     }
// }


//6번
// public class Java0609 {
//     public static void main(String[] args){
//         Veh vh = new Car("Spark");
//         System.out.println(vh.getName());
//     }
// }
// abstract class Veh{
//     String name;
//     abstract public String getName(String val);
//     public String getName(){
//         return "Veh name:"+name;
//     }
//     public void setName(String val){
//         name = val;
//     }
// }
// class Car extends Veh{
//     public Car(String val){
//         setName(val);
//     }
//     public String geString(String val){
//         return "Car name:"+val;
//     }
//     public String getName(byte val[]){
//         return "Car name:"+val;
//     }
// }


//5번
// public class Java0609 {
//     public static void main(String[] args){
//         int i = 0;
//         int sum = 0;
//         while(i<10){
//             i++;
//             if(i%2 == 1)
//                 continue;
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }


//4번
// public class Java0609 {
//     public static void main(String[] args){
//         B obj = new B(10);
//     }
// }
// class A{
//     private int a;
//     public A(int a){
//         this.a = a;
//     }
//     public void display(){
//         System.out.println("a=" +a);
//     }
// }
// class B extends A{
//     public B(int a){
//         super(a);
//         super.display();
//     }
// }


//3번
// public class Java0609 {
//     public static void main(String[] args){
//         Parent pa = new Chile();
//         pa.show();
//     }
// }
// class Parent{
//     public void show(){
//         System.out.println("Parent");
//     }
// }
// class Chile extends Parent{
//     public void show(){
//         System.out.println("Child");
//     }
// }



//2번
// public class Java0609 {
//     public static void main(String[] args){
//         int i=0, k=1;
//         switch(i){
//             case 0:
//             case 1:
//             case 2:
//             case 3: k=0;
//             case 4: k+=3;
//             case 5: k-=10;
//             default: k--;
//         }
//         System.out.print(k);
//     }
// }



//1번
// public class Java0609 {
//     public static void main(String[] args){
//         int i;
//         int []a={0,1,2,3};
//         for(i=0; i<4; i++)
//                 System.out.print(a[i]+" ");
//     }
// }


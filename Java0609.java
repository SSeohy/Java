//27번
public class Java0609 {
    public static void main(String[] args){
        
    }
}




//26번
// public class Java0609 {
//     public static void main(String[] args){
//         String str1 = "soojebi";
//         String str2 = "soojebi";
//         String str3 = new String("soojebi");
//         System.out.println(str1 == str2);
//         System.out.println(str1 == str3);
//         System.out.println(str1.equals(str3));
//         System.out.println(str2.equals(str3));
//     }
// }
//Java는 문자열 리터럴을 저장할 때 String Pool이라는 특별한 공간을 사용
//"soojebi"가 이미 String Pool에 있으니, 새로 만들지 않고 기존 객체를 재사용. 즉, str1과 str2은 같은 객체.
//equals()는 문자열의 내용 비교.



//25번
// public class Java0609 {
//     public static void main(String[] args){
//         Child cd = new Child();
//         System.out.println(cd.getX());
//     }
// }
// class Parent {
//     int x = 100;
//     Parent(){
//         this(500);
//     }
//     Parent(int x){
//         this.x = x;
//     }
//     int getX(){
//         return x; //이 x는 Parent.x를 의미.
//     }
// }
// class Child extends Parent{
//     int x = 4000;
//     Child(){
//         this(5000);
//     }
//     Child(int x){
//         this.x = x; //이 x는 Child.x를 의미.
//     }
// }
//변수 숨김 문제



//24번
// public class Java0609 {
//     static void swap(int[] a, int idx1, int idx2){
//         int t = a[idx1];
//         a[idx1] = a[idx2];
//         a[???] = t;
//     }
//     static void Usort(int[] a, int len){
//         for(int i=0; i<len; i++){
//             for(int j=0; j<len-i-1; j++){
//                 if(a[j] > a[j+1])
//                     swap(a, j, j+1);
//             }
//         }
//     }
//     public static void main(String[] args){
//         int []item = {5,4,9,1,3,7};
//         int nx = 6;
//         Usort(item, ??? );
//         for(int data:item)
//             System.out.print(data+"");
//     }
// }
//for(int data:item) = item 배열의 원소를 하나씩 꺼내서 data에 넣어라



//23번
// public class Java0609 {
//     public static void main(String[] args){
//         int a = 10;
//         Static.b = a;
//         Static st = new Static();
//         System.out.println(Static.b++);
//         System.out.println(st.b);
//         System.out.println(a);
//         System.out.println(st.a);
//     }
// }
// class Static{
//     public int a = 20;
//     static int b = 0;
// }



//22번
// public class Java0609 {
//     public static void main(String[] args){
//         int a = 0;
//         for(int i=0; i<999; i++){ //0부터998까지 반복하는데,
//             if(i%3==0 && i%2!=0) //홀수이면서, 3의 배수인 수 중
//                 a=i; //가장 마지막 수를 a에 대입(더하기가 아님)
//         }
//         System.out.print(a);
//     }
// }


//21번
// public class Java0609 {
//     static int[] MakeArray(){
//         int[] tempArr = new int[4];
//         for(int i=0; i<tempArr.length; i++)
//             tempArr[i] = i;
//         return tempArr;
//     }
//     public static void main(String[] args){
//         int[] intArr = MakeArray();
//         for(int i=0; i<intArr.length; i++)
//             System.out.print(intArr[i]);
//     }
// }


//20번
// public class Java0609 {
//     public static void main(String[] args){
//         int[] result = new int[5];
//         int[] arr = {79, 34, 10, 99, 50};
//         for(int i=0; i<5; i++){
//             result[i] = 1;
//             for(int j=0; j<5; j++){
//                 if(arr[i] < arr[j])
//                     result[i]++;
//             }
//         }
//         for(int k=0; k<5; k++){
//             System.out.print(result[k]);
//         }
//     }
// }


//19번
// public class Java0609 {
//     int a;
//     public Java0609(int a){ //생성자. 반환형이 없다.
//         this.a = a;
//     }
//     int func(){ //일반 함수
//         int b = 1;
//         for(int i=1; i<a; i++)
//             b = a*i+b;
//         return a+b;
//     }
//     public static void main(String[] args){
//         Java0609 ja = new Java0609(3);
//         ja.a = 5;
//         int b = ja.func();
//         System.out.print(ja.a + b);
//     }
// }
//생성자를 직접 작성하면, 객체 생성때 반드시 마지막에 반환형에 맞는 매개변수를 입력해줘야한다.
//즉, Java0609 ja = new Java0609(3); 가능
//Java0609 ja = new Java0609(); 불가능



//18번
// public class Java0609 {
//     public static void main(String[] args){
//         Thread t = new Thread(new Car());
//         t.start();
//     }
// }
// class Car implements Runnable{
//     int a;
//     public void run(){
//         System.out.println("run");
//     }
// }


//17번
// public class Java0609 {
//     public static void main(String[] args){
//         A m = new A(); //A 객체가 있는 위치를 가리키는 참조(reference)
//         m.a = 100;
//         func1(m);
//         m.b = m.a;
//         func2(m);
//         System.out.printf("%d", m.a);
//     }
//     static void func1(A m){
//         m.a *= 10;
//     }
//     static void func2(A m){
//         m.a += m.b;
//     }
// }
// class A{
//     int a, b;
// }




//16번
// public class Java0609 {
//     public static void main(String[] args){
//         int a=3, b=4, c=3, d=5;
//         if( (a==2 | a==c) & !(c>d) & (1==b ^ c!=d)){
//             a = b+c;
//             if(7==b ^ c!=a){
//                 System.out.println(a);
//             }
//             else
//                 System.out.println(b);
//         }
//         else{
//             a=c+d;
//             if(7==c ^ d!=a)
//                 System.out.println(a);
//             else
//                 System.out.println(d);
//         }
//     }
// }



//15번
// public class Java0609 {
//     public static void main(String[] args){
//         System.out.print(Java0609.check(1));
//     }
//     ??? String check(int num){
//         return (num>=0 ? "positive" : "negative");
//     }
// }


//14번
// public class Java0609 {
//     public static void main(String[] args){
//         Sjb s1 = Sjb.get();
//         s1.count();
//         Sjb s2 = Sjb.get();
//         s2.count();
//         Sjb s3 = Sjb.get();
//         s3.count();
//         System.out.print(s1.getCount());
//     }
// }
// class Sjb{
//     static private Sjb instance = null;
//     private int count = 0;
//     static public Sjb get(){
//         if(instance == null){
//             instance = new Sjb();
//         }
//         return instance;
//     }
//     public void count(){count++;}
//     public int getCount(){return count;}
// }


//13번
// public class Java0609 {
//     public static void main(String[] args){
//         Java0609 j1 = new Java0609();
//         ovr2 j2 = new ovr2();
//         System.out.print(j1.san(3,2)+j2.san(3,2));
//     }
//     int san(int x, int y){
//         return x+y;
//     }
// }
// class ovr2 extends Java0609{
//     int san(int x, int y){
//         return x-y+super.san(x,y);
//     }
// }


//12번
// public class Java0609 {
//     public static void main(String[] args){
//         int i, j;
//         for(j=0, i=0; i<=5; i++){
//             j+=i;
//             System.out.print(i);
//             if(i==5){
//                 System.out.print("=");
//                 System.out.print(j);
//             }
//             else
//                 System.out.print("+");
//         }
//     }
// }


//11번
// public class Java0609 {
//     public static void main(String[] args){
//         int[][] arr = new int[][]{{45,50,75}, {89}};
//         System.out.println(arr[0].length);
//         System.out.println(arr[1].length);
//         System.out.println(arr[0][0]);
//         System.out.println(arr[0][1]);
//         System.out.println(arr[1][0]);
//     }
// }


//10번
// public class Java0609 {
//     public static void main(String[] args){
//         Parent obj = new Child();
//         System.out.print(obj.compute(4));
//     }
// }
// class Parent{
//     public int compute(int num){
//         if(num<=1) return num;
//         return compute(num-1)+compute(num-2);
//     }
// }
// class Child extends Parent{
//     public int compute(int num){
//         if(num<=1) return num;
//         return compute(num-1)+compute(num-3);
//     }
// }


//9번
// public class Java0609 {
//     public static void main(String[] args){
//         int[][] a = new int[??][??];
//         for(int i=0; i<3; i++){
//             for(int j=0; j<5; j++){
//                 a[i][j] = j*3+(i+1);
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//8번
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
//while(n>0){
//a[i++] = n%2;


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


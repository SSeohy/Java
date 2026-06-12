//천기누설 10번
public class Java0609 {
    public static void select(int arr[], int n){
        int i, j, min_idx, temp;
        for(i=0; i<n-1; i++){
            min_idx = i;
            for(j=i+1; j<n; j++){
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,7,1};
        int i, n=4;
        select(arr, n);
        for(i=0; i<n; i++)
            System.out.print(arr[i]);
    }
}


//천기누설 10번
// public class Java0609 {
//     public static void select(int arr[], int n){
//         int i, j, min_idx, temp;
//         for(i=0; i<n-1; i++){
//             min_idx = i;
//             for(j=i+1; j<n; j++){
//                 if(arr[j] < arr[min_idx])
//                     min_idx = j;
//             }
//             temp = arr[i];
//             arr[i] = arr[min_idx];
//             arr[min_idx] = temp;
//         }
//     }
//     public static void main(String[] args){
//         int arr[] = {2,4,7,1};
//         int i, n=4;
//         select(arr, n);
//         for(i=0; i<n; i++)
//             System.out.print(arr[i]);
//     }
// }



//천기누설 9번
// public class Java0609 {
//     public static void main(String[] args){
//         Parent a = new Parent();
//         a.fn2();
//         new Child(5).fn1();
//     }
// }
// class Parent{
//     public Parent(){
//         this(3);
//         System.out.print("A");
//     }
//     public Parent(int x){
//         System.out.print("B");
//     }
//     public void fn1(){
//         System.out.print("C");
//     }
//     public void fn2(){
//         System.out.print("D");
//     }
// }
// class Child extends Parent{
//     public Child(){
//         System.out.print("E");
//     }
//     public Child(int x){
//         this();
//         System.out.print("F");
//     }
//     public void fn1(){
//         System.out.print("G");
//     }
//     public void fn2(){
//         System.out.print("H");
//     }
// }



//천기누설 8번
// public class Java0609 {
//     public static void main(String[] args){
//         int x = 1;
//         System.out.println(!(x==1));
//         System.out.println((x!=0)||(x>0));
//         System.out.println(x<<2);
//         System.out.println(x&2);
//         System.out.println(x%=3);
//     }
// }


//천기누설 7번
// public class Java0609 {
//     public static int a;
//     public static int fn(int t){
//         a+=t;
//         return a;
//     }
//     public static void main(String[] args){
//         for(int i=0; i<5; i++)
//             fn(i);
//         System.out.println(a);
//     }
// }


//천기누설 6번
// public class Java0609 {
//     public static void main(String[] args){
//         Parent p = new Child();
//         p.meth();
//     }
// }
// class Parent{
//     protected String str;
//     public void meth(){
//         print();
//     }
//     public void print(){
//         System.out.print(str);
//     }
// }
// class Child extends Parent{
//     private String str;
//     public void print(){
//         str = "Apple";
//         super.str = "Berry";
//         super.print();
//         System.out.print(str);
//     }
// }



//천기누설 5번
// public class Java0609 {
//     public static void main(String[] args){
//         int [][]arr = new int[3][3];
//         init(arr);
//         hourGlass(arr);
//         arrayPrint(arr);
//     }
//     public static void init(int arr[][]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 arr[i][j] = 0;
//             }
//         }
//     }
//     public static void hourGlass(int arr[][]){
//         int v = 0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i; j<arr[0].length; j++){
//                 arr[i][j] = ++v;
//             }
//         }
//     }
//     public static void arrayPrint(int arr[][]){
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 if(arr[i][j]==0)
//                     System.out.print(" ");
//                 else
//                     System.out.print(arr[i][j]);
//             }
//             System.out.println("");
//         }  
//     }
// }



//천기누설 4번
// public class Java0609 {
//     public static void main(String[] args){
//         int []a = new int[8];
//         int i=0, n=11;
//         while(n>0){
//             a[i++] = n%2;
//             n/=2;
//         }
//         for(i=7; i>=0; i--)
//             System.out.print(a[i]);
//     }
// }



//천기누설 3번
// public class Java0609 {
//     public static void main(String[] args){
//         int a = 26,  b = 91, i=0, g=0;
//         int min = a<b?a:b;
//         for(i=2; i<min; i++){
//             if(a%i==0 && b%i==0)
//                 g=i;
//         }
//         System.out.println(g);
//     }
// }



//천기누설 2번
// public class Java0609 {
//     public static void main(String[] args){
//         int a = 17;
//         a+=1;
//         a-=2;
//         a*=3;
//         a/=4;
//         a%=5;
//         System.out.print(a);
//     }
// }


//천기누설 1번
// public class Java0609 {
//     public static void main(String[] args){
//         int x=1;
//         int tX=0, t_X=0;
//         tX = (x>0)?x:-x;
//         if(x>0)
//             t_X = x;
//         else
//             t_X = -x;
//         System.out.println(tX + " " + t_X); 
//     }
// }


//천기누설 예상문제
//=========================================================================


//51번
// public class Java0609 {
//     public static void main(String[] args){
//         Tri t = Tri.values()[Tri.A.name().length()];
//         System.out.print(t.code());
//     }
// }
// enum Tri{
//     A("A"), B("AB"), C("ABC");
//     private String code;
//     Tri(String code) {
//         this.code = code;
//     }
//     public String code(){
//         return code;
//     }
// }



//50번
// public class Java0609 {
//     public static void main(String[] args){
//         int x=7, y=4, z;
//         z = y%3<3 ? 2: 1;
//         z = z&(z>>1);
//         z = (x>5&&z<=3) ? (z*x) : (z/x);
//         System.out.printf("%d", z);
//     }
// }
//</> Java 에서의 printf: 형식(format)지정 가능


//49번
// public class Java0609 {
//     public static void main(String[] args){
//         Sq sq = new Sq(10);
//         sq.getArea();
//     }
// }
// class Rec{
//     int x, y;
//     Rec(int x, int y){
//         this.x = x;
//         this.y = y;
//     }
//     int getArea(){
//         return x*y;
//     }
// }
// class Sq extends Rec{
//     Sq(int s){
//         super(s, s);
//     }
//     int getSqArea(){
//         return s*s;
//     }
// }



//48번
// public class Java0609 {
//     public static void main(String[] args){
//         Student s = new Student();
//         s.introduce();
//     }
// }
// interface Person{
//     void introduce();
// }
// class Student implements Person {
//     private String name;
    
//     public Student() {
//         this.name = "Yuna";
//     }
//     public void introduce(){
//         System.out.println("Hello, my name is "+name);
//     }
// }


//47번
// public class Java0609 {
//     public static class BO{
//         public int v;
//         public BO(int v){
//             this.v = v;
//         }
//     }
//     public static void main(String[] args){
//         BO a = new BO(1);
//         BO b = new BO(2);
//         BO c = new BO(3);
//         BO[] arr = {a,b,c};
//         BO t = arr[0];
//         arr[0] = arr[2];
//         arr[2] = t;
//         arr[1].v = arr[0].v;
//         System.out.println(a.v + "a" + b.v + "b" + c.v);
//     }
// }


//46번
// public class Java0609 {
//     public static class Parent{
//         public int x(int i){return i+2;}
//         public static String id(){return "P";}
//     }
//     public static class Child extends Parent{
//         public int x(int i){return i+3;}
//         public String x(String s){return s+"R";}
//         public static String id(){return "C";}
//     }
//     public static void main(String[] args){
//         Parent re = new Child();
//         System.out.println(re.x(2) + re.id());
//     }
// }



//45번
// public class Java0609 {
//     static interface F {
//         int apply(int x);
//     }
//     public static int run(F f){
//         try{
//             return f.apply(3);
//         }
//         catch(Exception e){
//             return 7;
//         }
//     }
//     public static void main(String[] args){
//         F f = (x)->{
//             if(x>2){
//                 throw new RuntimeException();
//             }
//             return x*2;
//         };
//         System.out.print(run(f) + run((int n)->n+9));
//     }
// }


//44번
// public class Java0609 {
//     public static void main(String[] args){
//         String data[] = {"A"};
//         String s = "B";
//         fn(data, s);
//         System.out.print(data[0]+s);
//     }
//     public static void fn(String[] data, String s){
//         data[0] = s;
//         s = "Z";
//     }
// }


//43번
// public class Java0609 {
//     public static void main(String[] args){
//         System.out.println(calc("5"));
//     }
//     static int calc(int value){
//         if(value<=1) return value;
//         return calc(value-1)+calc(value-2);
//     }
//     static int calc(String str){
//         int value = Integer.valueOf(str);
//         if(value<=1) return value;
//         return calc(value-1)+calc(value-3);
//     }
// }



//42번
// public class Java0609 {
//     public static void main(String[] args){
//         int[] values = {3,5,8,12,17};
//         System.out.println(fn(values, 0, values.length-1));
//     }
//     static int fn(int[] a, int st, int end){
//         if(st>=end) return 0;
//         int mid = (st+end)/2;
//         return a[mid]+Math.max(fn(a, st, mid), fn(a, mid+1, end));
//     }
// }



//41번
// public class Java0609 {
//     public static void main(String[] args){
//         new Child();
//         System.out.println(Parent.total);
//     }
// }
// class Parent{
//     static int total = 0;
//     int v = 1;
//     public Parent(){
//         total += (++v);
//         show();
//     }
//     public void show(){
//         total += total;
//     }
// }
// class Child extends Parent{
//     int v = 10;
//     public Child(){
//         v+=2;
//         total += v++;
//         show();
//     }
//     @Override
//     public void show(){
//         total += total*2;
//     }
// }


//40번
// public class Java0609 {
//     public static void main(String[] args){
//         int a=5, b=0;
//         try{
//             System.out.print(a/b);
//         }
//         catch(ArithmeticException e){
//             System.out.print("출력1");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.print("출력2");
//         }
//         catch(NumberFormatException e){
//             System.out.print("출력3");
//         }
//         catch(Exception e){
//             System.out.print("출력4");
//         }
//         finally{
//             System.out.print("출력5");
//         }
//     }
// }


//39번
// public class Java0609 {
//     public static void main(String[] args){
//         new Collection<>(0).print();
//     }
// }
// class Printer{
//     void print(Integer x){
//         System.out.print("A" + x);
//     }
//     void print(Object x){
//         System.out.print("B" + x);
//     }
//     void print(Number x){
//         System.out.print("C" + x);
//     }
// }
// class Collection<T> {
//     T value;
//     public Collection(T t){
//         value = t;
//     }
//     public void print(){
//         new Printer().print(value);
//     }
// }


//38번
// public class Java0609 {
//     public static void main(String[] args){
//           int sum = 0;
//           try {
//             func();
//           }
//           catch (NullPointerException e){
//             sum += 1;
//           }
//           catch (Exception e) {
//             sum += 10;
//           }
//           finally {
//             sum += 100;
//           }
//           System.out.print(sum);
//     }
//     static void func() throws Exception{
//         throw new NullPointerException();
//     }
// }


//37번
// public class Java0609 {
//     public static void main(String[] args){
//           Base b = new Derivate();
//           Derivate d= new Derivate();
//           System.out.print(b.getX() + b.x + d.getX() + d.x);
//     }
// }
// class Base{
//     int x = 3;
//     int getX(){
//         return x*2;
//     }
// }
// class Derivate extends Base {
//     int x = 7;
//     int getX() {
//         return x*3;
//     }
// }



//36번
// public class Java0609 {
//     static void func(String[] sM, int size){
//         for(int i=1; i<size; i++){
//             if(sM[i-1].equals(sM[i]))
//                 System.out.print("O");
//             else
//                 System.out.print("N");
//         }
//         for(String m:sM)
//             System.out.print(m);
//     }
//     public static void main(String[] args){
//           String[] sM = new String[3];
//           sM[0] = "A";
//           sM[1] = "A";
//           sM[2] = new String("A");
//           func(sM, 3);
//     }
// }


//35번
// public class Java0609 {
//     public static String fn(String str, int index, boolean[] seen){
//         if(index < 0) return "";
//         char c = str.charAt(index);
//         String result = fn(str, index-1, seen);
//         if(!seen[c]){
//             seen[c] = true;
//             return c+result;
//         }
//         return result;
//     }
//     public static void main(String[] args){
//         String str = "abacabcd";
//         int length = str.length();
//         boolean[] seen = new boolean[256];
//         System.out.print(fn(str, length-1, seen));    
//     }
// }


//34번
// public class Java0609 {
//     public static void main(String[] args){
//         int a[] = {1,2,3,4,5,6,7,8,9};
//         B x = new B();
//         System.out.print(x.sum(a, true) + ", " + x.sum(a, false));
//     }
// }
// interface A{
//     int sum(int[] a, boolean odd);
// }
// class B implements A{
//     public int sum(int[] a, boolean odd){
//         int result = 0;
//         for(int i=0; i<a.length; i++){
//             if((odd && a[i]%2!=0) || (!odd && a[i]%2==0))
//                 result += a[i];
//         }
//         return result;
//     }
// }


//30번
// public class Java0609 {
//     public static void main(String[] args){
//         Sjb s1 = Sjb.get();
//         s1.connt();
//         Sjb s2 = Sjb.get();
//         s2.connt();
//         Sjb s3 = Sjb.get();
//         s3.connt();
//         s1.connt();
//         System.out.print(s1.getCount());
//     }
// }
// class Sjb {
//     static private Sjb instance = null;
//     private int count = 0;
//     static public Sjb get(){
//         if(instance == null){
//             instance = new Sjb();
//         }
//         return instance;
//     }
//     public void connt(){count++;}
//     public int getCount(){ return count;}
// }


//29번
// public class Java0609 {
//     public static void main(String[] args){
//         Person p = new Person("soojebi");    
//     }
// }
// class Person{
//     private String name;
//     public Person(String val){
//         name = val;
//     }
//     public static String get(){
//         return name;
    
//     }
//     public void print(){
//         System.out.println(name);
//     }
// }



//28번
// public class Java0609 {
//     public static void main(String[] args){
//         int sum = fact(7);
//         System.out.println(sum);
//     }
//     public static int fact(int n){
//         if(n==1)
//             return 1;
//         else
//             return n*fact(n-1);
//     }
// }
//자바는 객체지향 언어. 즉, 객체가 없으면, 함수를 호출할 때도 어떤 객체의 함수를 호출해야할지 알지 못한다.
//따라서 객체를 만들어줘야함.
//이 역할을 static이 해준다. 객체를 만들지 않고도 사용할 수 있는 멤버.



//27번
// public class Java0609 {
//     public static void main(String[] args){
//         Parent c = new Child();
//         c.paint();
//         c.draw();
//     }
// }
// class Parent{
//     public void paint(){
//         System.out.print("A");
//         draw();
//     }
//     public void draw(){
//         System.out.print("B");
//         draw();
//     }
// }
// class Child extends Parent{
//     public void paint(){
//         super.draw();
//         System.out.print("C");
//         this.draw();
//     }
//     public void draw(){
//         System.out.print("D");
//     }
// }



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


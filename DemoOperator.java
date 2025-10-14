public class DemoOperator {
  public static void main(String[] arges){
    //++, --
    int x = 3;
    x++;
    System.out.println(x);//4
    x += 1; //5
    System.out.println(x);
    x = x + 1;//6
    System.out.println(x);

    //+=,-+, *=, /=
    int y = 8;
    y += 2;
    System.out.println(y); //10
    y = y + 2;
    System.out.println(y); //12

    y -= 3;
    System.out.println(y);//9

    int z = 3;
    z *= 3;
    System.out.println(z);
    z = z * 3;
    System.out.println(z);

    int q = 4;
    q /= 4;
    System.out.println(q);

    // if only +1, might prefer to use ++
// % -> remainder
int r = 10 % 3;
System.out.println(r); //1

// ++, -- (pre, post)
int k = 6;
int a1 = ++k + 3; //k +1 before +3
System.out.println(a1);
System.out.println(k);
int j=6;
int a2 = k = k++ + 3; // k +3 0> assign, K+1
System.out.println(a2);
System.out.println(j);

//post
int o = 9;
System.out.println(o);
int result = o + 2;
System.out.println(o);
o++;
System.out.println(o);

//deal with what is pre and post first

int h = 3;
int m = (h++ + 3) * h++;
System.out.println(m);//24
// what is y?
// h + 3 -> 6
// h++ -> h becomes 4
// 6 * 4
// h++ -> becomes 5

  }
}

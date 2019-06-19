public class PersonRunner {
public static void main(String[] args) {
Person p = new Person();
Person t = new Person();
Person n = new Person();
p.setName("Peter");
p.setSuperpower("Spiderman");

t.setName("Tony");
t.setSuperpower("Ironman");

n.setName("Natasha");
n.setSuperpower("Black Widow");
System.out.println(p);
System.out.println(t);
System.out.println(n);

}
}
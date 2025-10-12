// example of encapsulation - practise for interview by myself as on 12 oct 11:21pm

class Animal {
    private String name;

    public void setName( String name){
        this.name= name;
    }
    public String getName() {
        return name;
    }
}
 public class encap{
    public static void main(String[] args) {
        Animal an = new Animal();
        an.setName("Snigdha");
        System.out.println(an.getName());
    }
 }
public class Activity13 {
    public int one;
    public int two;
    private int three;
    private int four;



     Activity13(int one, int two, int three, int four){
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

   // private void getOne(){
   //      System.out.println(one);
   // }

    public void getTwo(){
        System.out.println(two);
    }

    void getThree(){
        System.out.println(three);
    }

    protected void getFour(){
         System.out.println(four);
    }
}

class Main extends Fraction{
    public static void main(String[] args){
        Fraction f1 = new Fraction("2/3");
        Fraction f2 = new Fraction(10,50);
      
        System.out.println(f1 + " " + f2);
        
        Fraction prod;
        prod = Fraction.multiply(f1,f2);
        System.out.println(prod);
        
        Fraction div;
        div = Fraction.divide(f1,f2);
        System.out.println(div);
        
        Fraction sum;
        sum = Fraction.add(f1,f2);
        System.out.println(sum);
        
        Fraction dif;
        dif = Fraction.sub(f1,f2);
        System.out.println(dif);
        
        int i = dif.GCF(9,24);
        System.out.println(i);
       
    }
}
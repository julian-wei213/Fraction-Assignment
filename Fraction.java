class Fraction{
    private int num,deno;
    
    Fraction(){
        num = 0;
        deno = 1;
    }
    
    Fraction(int num,int deno){
        this.num = num;
        
        if(deno == 0){
            System.out.println("ERROR");
            deno = 1;
        }else{
        this.deno = deno;
        }
    }
    
    Fraction(String str){
        int i = str.indexOf("/");
        num = Integer.parseInt(str.substring(0,i));
        
        if(Integer.parseInt(str.substring(i+1,str.length())) != 0){
        deno = Integer.parseInt(str.substring(i+1,str.length()));
        }else{
        deno = 1;
        }
    }
    
    Fraction(Fraction f){
        this.num = f.num;
        this.deno = f.deno;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public int getDenom(){
        return this.deno;
    }
    
    public String toString(){
        return num + "/" + deno;
    }
    
    public double toDouble(){
        double n = (double)num/deno;
        return n;
    }
    
    public void reduce(){
        int small = 0;
        int ans = 0;
        if(num > deno){
            small = deno;
        }else{
            small = num;
        }
        
        for(int i = 1; i<=small;i++){
            if(num%i == 0 && deno%i == 0){
                ans = i;
            }
        }
        
        num = num/ans;
        deno = deno/ans;
    }
    
    public void setNum(int num){
        this.num = num;   
    }
    
    public void setDeno(int deno){
        this.deno = deno;
    }
    
    public static Fraction multiply(Fraction a, Fraction b){
        int numer = a.num * b.num;
        int denom = a.deno * b.deno;
        
        Fraction f = new Fraction(numer,denom);
        f.reduce();
        return f;
    }
    
    public static Fraction divide(Fraction a, Fraction b){
        int numer = a.num * b.deno;
        int denom = a.deno * b.num;
        
        Fraction f = new Fraction(numer,denom);
        f.reduce();
        return f;
    }
    
    public static Fraction add(Fraction a, Fraction b){
        int denom = a.deno * b.deno;
        int numer = a.num*b.deno + b.num*a.deno;
        
        Fraction f = new Fraction(numer,denom);
        f.reduce();
        return f;
    }
    
    public static Fraction sub(Fraction a, Fraction b){
        int denom = a.deno * b.deno;
        int numer = a.num*b.deno - b.num*a.deno;
        
        Fraction f = new Fraction(numer,denom);
        f.reduce();
        return f;
    }
    
    public static int GCF(int a,int b){
        
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        
        for(int i = 0; small != big ;i++){
            if(big > small){
                big = big - small;
            }else{
                small = small - big;
            }
        }
        
        return big;
    }
}

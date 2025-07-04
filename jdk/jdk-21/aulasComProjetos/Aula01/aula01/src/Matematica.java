public class Matematica{
    private int a;
    private int b;
    private int c;

    public Matematica(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Matematica(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculo(int a, int b){
        return this.getA() + this.getB();
    }

    public int calculosub(int a, int b){
        return this.getA() - this.getB();
    }

    public float calculo(int a, int b, int c){
        return (this.getA() + this.getB() + this.getC())/3;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
     
    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void setC(int c) {
        this.c = c;
    }

  
}
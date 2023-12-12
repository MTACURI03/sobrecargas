public class OperacionesMatematicas {
    public int num1;
    public int num2;
    public int num3;
    public double decimal1;
    public double decimal2;
    public int resultado;
    public double resultado2;

    public OperacionesMatematicas() {
    }

    public OperacionesMatematicas(int num1, int num2, int num3, int resultado) {
        this.num1=num1;
        this.num2=num1;
        this.num3=num3;
        this.resultado=resultado;
    }
    public OperacionesMatematicas(double decimal1,double decimal2) {
        this.decimal1=decimal1;
        this.decimal2=decimal2;
    }
    public void suma(int num1,int num2){

        resultado=num1+num2;
        System.out.println("la suma es igual a :"+resultado);
    }
    public void suma(int num1,int num2,int num3){

        resultado=num1+num2+num3+5;
        System.out.println("la suma es igual a :"+resultado);
    }
    public void suma(double decimal1,double decimal2){
        resultado2=decimal1+decimal2+2;
        System.out.println("la suma es igual a :"+resultado2);
    }
    public static void main(String[]args){
        OperacionesMatematicas suma1=new OperacionesMatematicas();
        suma1.suma(2,2);
        OperacionesMatematicas suma2=new OperacionesMatematicas();
        suma2.suma(5,5);
        OperacionesMatematicas suma3=new OperacionesMatematicas();
        suma3.suma(1.5,2.5);
    }
}

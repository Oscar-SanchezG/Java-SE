public class formula_pitagoras {
    final static int Pi = 5; // Tiene que estar fuera del método cuando se usa la kw 'static'
    // arguments are passed using the text field below this editor
    public static void main(String[] args) {
        int a;
        a = 1;
        int b;
        b = 4;
        int c;
        c = 4;
        final int constante = 12; //Cuando se utiliza dentro de main no se necesita la kw 'static'
        double x2;
        double x1;
        x1 = ((b + Math.sqrt((b*b) - (4*a*c))) / (2*a));
        x2 = -b + Math.sqrt((b*b) - (4*a*c)) / (2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}

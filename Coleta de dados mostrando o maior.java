public static void main(String[] args) {

int  n, maior = 0;

  Scanner teclado = new Scanner(System.in);

System.out.println("Informe um número”);

n = teclado.nextInt();

while (n!= 0){
if (n > maior) {
maior = n;
}
System.out.println("O maior número é %d”, maior);
Teclado.close();
}
}

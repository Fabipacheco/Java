public static void main(String[] args) {

float peso_ideal, altura;
char sexo;

  Scanner teclado = new Scanner(System.in);
System.out.println("Informe sua altura:”);
altura = teclado.nextFloat ();

System.out.println("Informe seu sexo M/F”);
sexo = teclado.next.chaAt(0);

If (sexo== ‘M’){
peso_ideal = (float)(72,7 * altura ) – 58;
System.out.println("Seu peso ideal é  “ + peso_ideal);
}

If ( sexo == ‘F’){
peso_ideal = (float)(62,1 * altura) – (float)44,7;
System.out.println("Seu peso ideal é “ + peso_ideal);
}
If (sexo != ‘M’ && sexo != ‘F’) {
System.out.println("Sexo não reconhecido”);
peso_ideal = 0
}
teclado.close();
}
}

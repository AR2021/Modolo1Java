import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner ler = new Scanner(System.in);
	System.out.print("CALCULADORA OP��ES: 1-soma 2-Subtra��o 3-Multiplica��o 4-Divis�o 5-Raiz Quadrada 6-Potencia: ");
	int opcao = ler.nextInt();
	
	switch(opcao) {
	   case 1: 
		System.out.print("Digite o primeiro numero:");
		  int a = ler.nextInt();
		    System.out.print("Digite o segundo numero:");
              int n1 = ler.nextInt();
                int soma = a + n1;
                 System.out.println("Resultado= " + soma);
                   if(soma %2 ==0) {System.out.println("� par e � divisivel"); }
                      else if(soma %3 ==0) { System.out.println(" � impar e � divisivel por 3"); }
                        else { System.out.println("� impar e n�o � divisivel ");  }
	                      break;
	 case 2: 
		System.out.print("Digite o primeiro numero:");
		 int b = ler.nextInt();
		   System.out.print("Digite o segundo numero:");
             int n2 = ler.nextInt();
               int sub = b-n2;
                System.out.println("Resultado= " + sub);
                  if(sub %2 ==0) {System.out.println("� par e � divisivel"); }
                    else if(sub %3 ==0) { System.out.println(" � impar e � divisivel por 3");  }
                      else { System.out.println("� impar e n�o � divisivel "); }
                        break;
                        
	 case 3: 
		System.out.print("Digite o primeiro numero:");
		 int c = ler.nextInt();
		   System.out.print("Digite o segundo numero:");
             int n3= ler.nextInt();
               int mult= c * n3;
                System.out.println("Resultado= " + mult);
                  if(mult %2 ==0) {System.out.println("� par e � divisivel"); }
                    else if(mult%3 ==0) { System.out.println(" � impar e � divisivel por 3");  }
                      else { System.out.println("� impar e n�o � divisivel "); }
                        break;
                        
	 case 4: 
		System.out.print("Digite o primeiro numero:");
		 int d = ler.nextInt();
		   System.out.print("Digite o segundo numero:");
             int n4= ler.nextInt();
               int div = d / n4;
                System.out.println("Resultado= " + div);
                  if(div %2 ==0) {System.out.println("� par e � divisivel"); }
                    else if(div%3 ==0) { System.out.println(" � impar e � divisivel por 3");  }
                      else { System.out.println("� impar e n�o � divisivel "); }
                        break;
   
	 case 5: 
		System.out.print("Digite o primeiro numero:");
		 int e = ler.nextInt();
           double rQ = Math.sqrt(e);
             System.out.println("Resultado = " + rQ);
              if(rQ %2 ==0) {System.out.println("� par e � divisivel"); }
                else if(rQ%3 ==0) { System.out.println(" � impar e � divisivel por 3");  }
                  else { System.out.println("� impar e n�o � divisivel "); }
                    break;

                    
	 case 6: 
  		System.out.print("Digite o  numero:");
  		  double f = ler.nextInt();
   		    System.out.print("Digite o expoente:");
 		      int n5 = ler.nextInt();
                double pT = Math.pow(f, n5);
                  System.out.println("Resultado = " + pT);
                    if(pT %2 ==0) {System.out.println("� par e � divisivel"); }
                      else if(pT%3 ==0) { System.out.println(" � impar e � divisivel por 3");  }
                       else { System.out.println("� impar e n�o � divisivel "); }
                        break;
	}
	
	
		ler.close();

	}

}

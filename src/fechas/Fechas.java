package fechas;
import java.util.Scanner;
public class Fechas{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese Fecha de Nacimiento de la primera persona (DD/MM/AA)");
		String fechaprimerapersona=sc.nextLine();
		System.out.println("Ingrese Fecha de Nacimiento de la segunda persona (DD/MM/AA)");
		String fechasegundapersona=sc.nextLine();
		
		int diafecha1=Integer.parseInt(fechaprimerapersona.substring(0,2));
		int mesfecha1=Integer.parseInt(fechaprimerapersona.substring(3,5));
		int a�ofecha1=Integer.parseInt(fechaprimerapersona.substring(6));
		int diafecha2=Integer.parseInt(fechasegundapersona.substring(0,2));
		int mesfecha2=Integer.parseInt(fechasegundapersona.substring(3,5));
		int a�ofecha2=Integer.parseInt(fechasegundapersona.substring(6));
			
			if((2020-a�ofecha2)>(2020-a�ofecha1))
			{System.out.print("La segunda persona es mayor que la primera");
			}
			else if ((2020-a�ofecha2)<(2020-a�ofecha1))
			{System.out.print("La primera personda es mayor que la segunda");
			}
			else if((a�ofecha2)==(a�ofecha1)&&(mesfecha2)>(mesfecha1))
			{System.out.println("La primera personda es mayor que la segunda");
			}
			else if((a�ofecha2)==(a�ofecha1)&&(mesfecha2)<(mesfecha1))
			{System.out.println("La segunda personda es mayor que la primera");
			}
			else if((a�ofecha2)==(a�ofecha1)&&(mesfecha2)==(mesfecha1)&&(diafecha2>diafecha1))
			{System.out.println("La primera personda es mayor que la segunda");
			}
			else if((a�ofecha2)==(a�ofecha1)&&(mesfecha2)==(mesfecha1)&&(diafecha2<diafecha1))
			{System.out.print("La segunda persona es mayor que la primera");
			}
			else
			{System.out.println("Las personas tienen la misma edad");
			}				
	}
}

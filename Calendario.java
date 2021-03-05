package projetoJavaVacina;

import java.util.Scanner;

public class Calendario extends Pessoas{
	
	public Calendario(String pNome, String mNome, String uNome, String zCidade, String dNasc, String aNasc, int idade)
	{
		super(pNome,mNome,uNome,zCidade,dNasc,aNasc,idade);
	}
	
	public void datasVacinacao()
	{
		System.out.println("\n Sua idade: "+super.getIdade() );
		System.out.println("\n LEMBRE-SE de tomar a SEGUNDA DOSE após 28 dias!!!");
		
		if  (super.getIdade()<=79 && super.getIdade()>75)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 03 e 11 de março de 2021.");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 31 de março e 10 de abril de 2021.");
		}
		else if (super.getIdade()<=75 && super.getIdade()>=70)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 12 e 25 de março de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 11 e 24 de abril de 2021");
		}
		else if (super.getIdade()<70 && super.getIdade()>=65)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 26 e 10 de abril de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 25 de abril e 11 de maio de 2021");
		}
		else if (super.getIdade()<65 && super.getIdade()>=60)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 11 de abril e 03 de maio de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 12 de maio e 2 de junho de 2021");
		}
		else if (super.getIdade()<60 && super.getIdade()>=55)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 04 de maio e 02 de junho de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 03 de junho e 1 de julho de 2021");
		}
		else if (super.getIdade()<55 && super.getIdade()>=50)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 03 de junho e 08 de julho de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 02 julho e 8 de agosto de 2021");
		}
		else if (super.getIdade()<50 && super.getIdade()>=45)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 09 de julho e 17 de agosto de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 09 de agosto e 17 de setembro de 2021");
		}
		else if (super.getIdade()<45 && super.getIdade()>=40)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 18 de agosto e 29 de setembro de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 18 de setembro e 29 de outubro de 2021");
		}
		else if (super.getIdade()<40 && super.getIdade()>=35)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 30 de setembro e 15 de novembro de 2021");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 30 de outubro e 15 de novembro de 2021");
		}
		else if (super.getIdade()<35 && super.getIdade()>=30)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 16 de novembro de 2021 e 06 de janeiro de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 14 de dezembro de 2021 e 4 de fevereiro de 2022");
		}
		else if (super.getIdade()<=30 && super.getIdade()>25)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 07 de janeiro e 04 de março de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 05 de fevereiro e 01 de abril de 2022");
		}
		else if (super.getIdade()<=25 && super.getIdade()>=18)
		{
			System.out.printf("\n Você deve se vacinar entre os dias 04 de março e 08 de maio de 2022");
			System.out.printf("\n Você deve tomar a segunda dose entre os dias 02 de abril e 14 de junho de 2022");
		}
		else if  (super.getIdade()<18)
		{
			System.out.printf("\n Você não pode ser vacinado ");
		}
		else if (super.getIdade()>79)
		{
			System.out.printf("\n Você já foi Vacinado");
		}

	}
}

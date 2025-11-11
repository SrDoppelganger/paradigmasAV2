package paradigmasAV2;
import java.time.Duration;
import java.time.LocalDate;

abstract class Usuario {
	//retorna quantos dias faltam para a devolução
	public long prazoDias(int prazo, LocalDate hoje,LocalDate diaEmprestimo) {
		int diasRestantes;
		LocalDate diaDevolução = diaEmprestimo.plusDays(prazo);
		if(hoje.isBefore(diaDevolução)) {
			//converte o tempo (em dias) de long para int
			diasRestantes = (int) Duration.between(hoje, diaDevolução).toDays();
		}else {
			System.out.println("O recurso passou do prazo de entrega!");
			diasRestantes = 0;
		}
		return diasRestantes;
	}
	
	public double fatorMulta(LocalDate hoje, LocalDate diaEmprestimo, double taxa) {
		double valorFinal;
		if(hoje.isAfter(diaEmprestimo)) {
			long dias =  Duration.between(diaEmprestimo, hoje).toDays();
			//add o valor da taxa para cada dia após o prazo (taxação varia com a mídia emprestada)
			valorFinal = dias * taxa;
		}else {
			System.out.println("Recurso ainda está dentro do prazo");
			valorFinal = 0;
		}
		return valorFinal;
	}
}

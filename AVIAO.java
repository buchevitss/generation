package TURMA24;

public class AVIAO {
	
	private String aeroporto;
	private String destino;
	private String horario;
	
	
	public AVIAO (String aeroporto, String destina, String horario) {
		this.aeroporto = aeroporto;
		this.destino = destino;
		this.horario = horario;
	}
	
		public void imprimirInfo() {
			System.out.println("o avião sai do aeroporto"+aeroporto +destino+ " às"+horario);
				}
		public String getAeroporto() {
			return aeroporto;
		}
		public void setAeroporto(String aeroporto) {
			this.aeroporto = aeroporto;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
	
}

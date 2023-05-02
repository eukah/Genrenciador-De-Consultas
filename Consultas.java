public class Consultas {

 //Varieaveis de Instacia/Ambiente
 private String paciente;
 private String medico;
 private String data;

//Construtor
public Consultas (String paciente, String medico, String data){
    this.paciente = paciente;
    this.medico = medico;
    this.data = data;
}

 //Representação Textual
 @Override
 public String toString() {
    return "Consulta: [Paciente: " + paciente + " Medico: " + medico + " Data: " + data + "]";
 }

}
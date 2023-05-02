import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeConsultas{

//Varieaveis de Instacia/Ambiente
private List <Consultas> consultar;


//Construtor que ao ser chamado atribui um array a minha lista
public GerenciadorDeConsultas(){
    consultar = new ArrayList<>();
}

//Metodo para cadastrar uma consulta
public void cadastrarConsulta(String paciente, String medico, String data){
    Consultas consulta = new Consultas(paciente, medico, data);
    consultar.add(consulta);
}
//Metodo para excluir consulta
public void excluirConsulta(int index){
    consultar.remove(index);

    //Ou, if(index < 0 || index > consultar.size())
}

 //Listar consultas
 public void listarConsulta(){
    //Verifica se a lista está vazia
    if(consultar.isEmpty()){
        System.out.println("Não tem consultas");      
    }else{
        //Percorre a lista e imprime cada item
        for(Consultas consultas : consultar){
            System.out.println(consultas);
        }
    }
 }

 public static void main(String[] args){
    //cria o objeto gerenciador
    GerenciadorDeConsultas gerenciador = new GerenciadorDeConsultas();
    gerenciador.cadastrarConsulta("Kaian", "Luis Fernando", "18/05");
    gerenciador.excluirConsulta(0);
    gerenciador.listarConsulta();

 }
}

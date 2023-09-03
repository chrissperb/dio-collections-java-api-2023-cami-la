package main.java.list.MeuCode;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List <Tarefa> tarefaList;

    // Construindo o construtor
    // Clique botão direito --> Generate --> Constructor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionartarefa(String descricao) {
        tarefaList.add(new Tarefa (descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    // Criando um teste para os métodos. Seria interessante aprender logo os testes unitários...
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(" O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionartarefa("Tarefa 1");
        listaTarefa.adicionartarefa("Tarefa 1");
        listaTarefa.adicionartarefa("Tarefa 2");
        System.out.println(" O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println(" O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}

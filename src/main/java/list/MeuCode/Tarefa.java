package main.java.list.MeuCode;

import java.util.List;

public class Tarefa {
    // Atributo
    private String descricao;

    // Construindo o construtor
    // Clique botão direito --> Generate --> Constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Construindo o MÉTODO GET, que retorna o valor da variavel descrição.
    // Clique botão direito --> Generate --> Getter
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

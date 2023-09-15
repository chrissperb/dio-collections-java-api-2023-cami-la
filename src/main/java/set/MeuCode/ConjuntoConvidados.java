package main.java.set.MeuCode;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCandidatoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados () {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main (String [] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados.");

        conjuntoConvidados.adicionarConvidado("Ana", 1234);
        conjuntoConvidados.adicionarConvidado("João", 1432);
        conjuntoConvidados.adicionarConvidado("Cintia", 1234);
        conjuntoConvidados.adicionarConvidado("Chris", 8888);

        System.out.println("convidados no conjunto: ");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados");

        conjuntoConvidados.removerCandidatoPorCodigoConvite(8888);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados.");

        System.out.println("Cnovidados no conjunto de convidados após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}


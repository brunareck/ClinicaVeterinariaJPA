package teste;

import model.Animal;
import model.dao.PersistenciaJPA;

public class TestePersisteAnimal {
     public static void main(String[] args) {
        PersistenciaJPA jpa = new PersistenciaJPA();

        if (jpa.conexaoAberta()) {
            System.out.println("✅ Conexão aberta com sucesso!");
            
            Animal a = new Animal();
            a.setNome(null);
            a.setIdade(0);
            a.setEspecie(null);
            try {
                jpa.persist(a);
                System.out.println("✅ Animal salvo no banco!");
            } catch (Exception e) {
                System.out.println("❌ Erro ao salvar: " + e.getMessage());
            }

            jpa.fecharConexao();
        } else {
            System.out.println("❌ Falha ao abrir conexão.");
        }
    }
}

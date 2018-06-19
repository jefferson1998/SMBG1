/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelSMBG;

import java.time.Instant;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jessin
 */
public class zzzTeste {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesteSMBG");
        EntityManager em = emf.createEntityManager();

            Admissao ad = new Admissao();
            ad.setDataAdmissao("15/05/1998");
            ad.setFuncao("Motorista");
            ad.setHoras(12);
            ad.setInstrucao("Zé");
            ad.setNumeroDeFilhos(12);
            ad.setValorSalario(1200);
            
            Conta c = new Conta();
            c.setNumeroAgencia("12");
            c.setNumeroConta("15");
            ad.setConta(c);
            
            em.getTransaction().begin();
            em.persist(ad);
            em.getTransaction().commit();

            System.out.println("Persistiu Admissao");
            
            Identidade i = new Identidade();
            Endereco e = new Endereco("SP", 0, "Magano", "123");
            Funcionario f = new Funcionario();

            f.setCpf("125.225.945/70");
            i.setNome("José");
            i.setNumeroIdentidade("12");
            i.setNomeDaMae("Maria");
            i.setOrgaoEmissor("SDS");
            i.setDataDeEmissao("12/05/1998");
            i.setuFIdentidade("PE");
            f.setFuncionarioIdentidade(i);
            f.setFuncionarioEndereco(e);
            f.setAdmissao(ad);
            
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
            
       
            System.out.println("Persistiu Funcionario");
        
        
    }
}

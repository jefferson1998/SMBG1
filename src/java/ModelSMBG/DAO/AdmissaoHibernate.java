package ModelSMBG.DAO;

import ModelSMBG.Entity.Admissao;
import java.util.List;
import javax.persistence.EntityManager;

public class AdmissaoHibernate implements AdmissaoDAO {

	private final EntityManager em = GeradorDeEntityManager.getEntityManager();

        public AdmissaoHibernate() {
        }
        
        
	public void inserir(Admissao admissao) {
            em.getTransaction().begin();
            em.persist(admissao);
            em.getTransaction().commit();
		
	}
	
	public void atualizar(Admissao admissao) {
		// TODO Auto-generated method stub
		
	}

	public void deletar(Admissao admissao) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Admissao> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPeloCpfDoFuncionario(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPelaIdentidadeDoFuncionario(String numeroIdentidade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Admissao buscarPelaCnhDoFuncionario(String cnh) {
		// TODO Auto-generated method stub
		return null;
	}

}
public class EmprestimoDAO {
    private EntityManager em;

    public EmprestimoDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Emprestimo e) {
        this.em.persist(e);
    }

    public void atualizar(Emprestimo e) {
        this.em.merge(e);
    }

    public void excluir(Emprestimo e) {
        this.em.remove(this.em.merge(e));
    }

    public Emprestimo buscarPorId(Long id) {
        return em.find(Emprestimo.class, id);
    }

    public List<Emprestimo> buscarTodos() {
        return em.createQuery("SELECT e FROM Emprestimo e", Emprestimo.class).getResultList();
    }

    public List<Emprestimo> buscarPorNomeAluno(String nome) {
        String jpql = "SELECT e FROM Emprestimo e WHERE e.aluno.nome LIKE :nome";
        return em.createQuery(jpql, Emprestimo.class)
                 .setParameter("nome", "%" + nome + "%")
                 .getResultList();
    }
}
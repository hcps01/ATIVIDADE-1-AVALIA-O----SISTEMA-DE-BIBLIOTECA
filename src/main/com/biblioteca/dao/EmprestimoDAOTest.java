public class EmprestimoDAOTest {
    private EntityManager em;
    private EmprestimoDAO dao;

    @Before
    public void setup() {
        this.em = JPAUtil.getEntityManager(); 
        this.dao = new EmprestimoDAO(em);
        em.getTransaction().begin();
    }

    @Test
    public void testeCicloDeVidaEmprestimo() {
        Emprestimo emp = new Emprestimo();
        emp.setDataEmprestimo(new Date());
        dao.salvar(emp);
        assertNotNull(dao.buscarPorId(emp.getId()));

        emp.setDataDevolucao(new Date());
        dao.atualizar(emp);
        assertEquals(emp.getDataDevolucao(), dao.buscarPorId(emp.getId()).getDataDevolucao());

        assertFalse(dao.buscarTodos().isEmpty());
        
        dao.excluir(emp);
        assertNull(dao.buscarPorId(emp.getId()));
    }

    @After
    public void tearDown() {
        em.getTransaction().rollback(); 
        em.close();
    }
}
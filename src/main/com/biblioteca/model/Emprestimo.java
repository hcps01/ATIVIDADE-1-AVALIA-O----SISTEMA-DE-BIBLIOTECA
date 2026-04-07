@Entity
public class Emprestimo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;
    
    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "publicacao_id")
    private Publicacao publicacao;

}
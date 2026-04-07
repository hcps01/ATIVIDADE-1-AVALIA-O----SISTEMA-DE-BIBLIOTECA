@Entity
public class Publicacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int codigoPub;
    private String titulo;
    private int ano;
    private String autor;
    private String tipo;

}
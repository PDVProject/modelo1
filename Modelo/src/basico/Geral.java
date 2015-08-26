package basico;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




public abstract class Geral {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;

}

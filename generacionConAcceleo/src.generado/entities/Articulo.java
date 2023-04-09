package entities;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited

@Entity
@Table(name="articulo")

public class Articulo extends extends Base{{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name=denominacion)
	private String denominacion;
	
	@Column(name=precio)
	private int precio;
	
	@Column(name=cantidad)
	private int cantidad;
	
	@OneToOne
	private Categoria categoria;
	
	
}

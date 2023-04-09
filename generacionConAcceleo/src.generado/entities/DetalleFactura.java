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
@Table(name="detalleFactura")

public class DetalleFactura extends extends Base{{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name=cantidad)
	private int cantidad;
	
	@Column(name=subtotal)
	private int subtotal;
	
	@OneToMany
	private Articulo articulo;
	
	
}

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
@Table(name="factura")

public class Factura extends extends Base{{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name=fecha)
	private String fecha;
	
	@Column(name=numero)
	private int numero;
	
	@Column(name=total)
	private int total;
	
	@OneToOne
	private DetalleFactura detallefactura;
	@OneToOne
	private Cliente cliente;
	
	
}

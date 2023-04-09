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
@Table(name="cliente")

public class Cliente extends extends Base{{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name=nombre)
	private String nombre;
	
	@Column(name=apellido)
	private String apellido;
	
	@Column(name=dni)
	private int dni;
	
	@OneToOne
	private Domicilio domicilio;
	
	public void comprar (){
	}
	
	public boolean esCasado (){
	return null;
	}	
	
}

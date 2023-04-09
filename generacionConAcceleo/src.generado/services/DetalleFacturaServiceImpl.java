package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura, Long> implements DetalleFacturaService{

	@Autowired
	private DetalleFacturaRepository detallefacturaRepository;

	public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

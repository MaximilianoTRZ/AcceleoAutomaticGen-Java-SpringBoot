package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{

	@Autowired
	private FacturaRepository facturaRepository;

	public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class ArticuloServiceImpl extends BaseServiceImpl<Articulo, Long> implements ArticuloService{

	@Autowired
	private ArticuloRepository articuloRepository;

	public ArticuloServiceImpl(BaseRepository<Articulo, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

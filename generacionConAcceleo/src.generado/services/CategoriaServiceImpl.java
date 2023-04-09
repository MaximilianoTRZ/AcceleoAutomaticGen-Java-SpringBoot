package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;

	public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

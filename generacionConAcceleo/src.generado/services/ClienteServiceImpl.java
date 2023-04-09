package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;

	public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

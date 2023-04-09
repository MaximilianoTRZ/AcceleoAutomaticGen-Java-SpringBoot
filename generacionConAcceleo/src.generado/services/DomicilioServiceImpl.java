package services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.*;
import repositories.*;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

	@Autowired
	private DomicilioRepository domicilioRepository;

	public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
}

package repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apiPractica.entities.*;

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID>{
}


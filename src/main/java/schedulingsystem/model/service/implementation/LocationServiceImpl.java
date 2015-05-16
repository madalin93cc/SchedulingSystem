package schedulingsystem.model.service.implementation;

import org.springframework.stereotype.Service;
import schedulingsystem.model.repository.LocationRepository;
import schedulingsystem.model.service.LocationService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Colezea on 16/05/2015.
 */
@Service
@Transactional
public class LocationServiceImpl implements LocationService{
    @Inject
    LocationRepository locationRepository;

    @Override
    public List<String> getAllCityes() {
        List<String> cityes = locationRepository.getAllCityes();
        return cityes;
    }
}

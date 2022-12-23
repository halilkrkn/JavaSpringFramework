package javaDeveloperSpring.io.rentAcar.business.abstracts;

import java.util.List;

import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

// Business - İş kurallarının yazılacağı yer.
public interface BrandService {

	List<Brand> getAll();

}

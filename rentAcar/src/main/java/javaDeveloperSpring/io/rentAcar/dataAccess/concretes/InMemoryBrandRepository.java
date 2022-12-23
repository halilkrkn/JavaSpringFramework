package javaDeveloperSpring.io.rentAcar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import javaDeveloperSpring.io.rentAcar.dataAccess.abstracts.BrandRepository;
import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

// DataAccess - Veri Tabanı ile ilişkilendirilen yer.
// Yani bu sınıf bir DataAccess nesnesidir.
@Repository
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>(); // elde boş bir liste var.
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Fiat"));
		brands.add(new Brand(4, "Togg"));
		brands.add(new Brand(5, "REnault"));
		brands.add(new Brand(6, "Wolkswagen"));
		brands.add(new Brand(7, "Bugatti"));
		brands.add(new Brand(8, "Ferrari"));
		brands.add(new Brand(9, "Duster"));
	}

	@Override
	public List<Brand> getAll() {
		return brands;
	}

}

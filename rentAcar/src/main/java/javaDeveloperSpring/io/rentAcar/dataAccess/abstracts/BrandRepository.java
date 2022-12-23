package javaDeveloperSpring.io.rentAcar.dataAccess.abstracts;

import java.util.List;

import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

// DataAccess - Veri Tabanı ile ilişkilendirilen yer.
// Yani veritabanındaki dataların nasıl kullanılması gerektiğini belirttiğimiz yer.
public interface BrandRepository {

	List<Brand> getAll();

}

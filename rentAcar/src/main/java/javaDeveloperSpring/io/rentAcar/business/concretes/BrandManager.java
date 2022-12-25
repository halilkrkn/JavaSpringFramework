package javaDeveloperSpring.io.rentAcar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaDeveloperSpring.io.rentAcar.business.abstracts.BrandService;
import javaDeveloperSpring.io.rentAcar.business.requests.CreateGetAllBrandsRequest;
import javaDeveloperSpring.io.rentAcar.business.responses.GetAllBrandsResponse;
import javaDeveloperSpring.io.rentAcar.dataAccess.abstracts.BrandRepository;
import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

// İş kuralları yazılacak.
// Business Katmanı, DataAccess katmanını çağrırarak gerek işlemleri yapar.
// IoC, ilgili annotation'ları alan sınıfların birden fazla referans oluşturmaması için IoC içerisine alınır ve tek bir referans olarak kullanılması sağlanır. 
// Yani bir sınıfı bir kutu içerisinde tek bir referansı olur ve o referans kullanılır.
@Service // IoC'ye eklettik ve bu sınıf bir Business Nesnesidir.
public class BrandManager implements BrandService {

	// Buraya aslında BraBrandRepository'i inject ettik. Yani bir nevi Dependency Injection kullandık.
	private BrandRepository brandRepository;

	// Business, DataAccess'i(İlgili Repository'i) çağırır.
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	
	// Mapping İşlemi Yaptık.
	// Yani Veritabanı Nesnesi olan Brand'deki verileri GetAllBrandsResponse içerisine attık yani mapledik.
	// Bu işlem ilkel bir işlemdir.
	// Bu Spring tools'ları ile daha kolay map'lenebiliyor.
	@Override
	public List<GetAllBrandsResponse> getAll() {
				
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> getAllBrandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand : brands) {
			GetAllBrandsResponse getAllBrandsResponseItem = new GetAllBrandsResponse();
			getAllBrandsResponseItem.setId(brand.getId());
			getAllBrandsResponseItem.setName(brand.getName());
			getAllBrandsResponse.add(getAllBrandsResponseItem);	
		}
		
		return getAllBrandsResponse;
	}


	// Burada Service işlemi olarak son kullanıcının Apiden istekte bulunması için gerekli add() methodunu yazdık.
	// Burada kullanıcının veritabanı içerisindeki tüm verileri değilde sadece ilgili yerleri doldurmasını ve istekte bulunmasını sağlattık.
	@Override
	public void add(CreateGetAllBrandsRequest createGetAllBrandsRequest) {
		// TODO Auto-generated method stub
		Brand brand = new Brand();
		brand.setName(createGetAllBrandsRequest.getName());
		this.brandRepository.save(brand);
		
	}

}

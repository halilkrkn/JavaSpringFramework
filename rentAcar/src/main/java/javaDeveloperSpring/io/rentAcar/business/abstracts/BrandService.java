package javaDeveloperSpring.io.rentAcar.business.abstracts;

import java.util.List;

import javaDeveloperSpring.io.rentAcar.business.requests.CreateGetAllBrandsRequest;
import javaDeveloperSpring.io.rentAcar.business.responses.GetAllBrandsResponse;

// Business - İş kurallarının yazılacağı yer.
// Buradaki BrandService'ten itibaren Veritabanı Nesnesi(Entities) kullanmak yasak. 
// Yani en son kullanıcı Veritabanını nesnesine tamamen erişmemesi için
// BrandService'ten itibaren olan kısımlarda Mapping işlemi yaparak son kullanıcıya response olarak dönülür.
public interface BrandService {

	
	// Api'den verileri Response(yanıt) olarak dönmek için ilgili verileri databaseden kullanıcı önüne çıkardık.
	List<GetAllBrandsResponse> getAll();
	
	// Api Request(İstek)te bulunmak için bir ekleme fonksiyonu oluşturduk.
	void add(CreateGetAllBrandsRequest createGetAllBrandsRequest);

}

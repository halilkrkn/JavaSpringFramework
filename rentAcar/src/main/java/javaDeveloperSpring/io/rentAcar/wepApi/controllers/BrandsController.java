package javaDeveloperSpring.io.rentAcar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaDeveloperSpring.io.rentAcar.business.abstracts.BrandService;
import javaDeveloperSpring.io.rentAcar.business.requests.CreateGetAllBrandsRequest;
import javaDeveloperSpring.io.rentAcar.business.responses.GetAllBrandsResponse;
import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

 // Restful olduğunu belirten bir annotation. Yani burası bir Access Point(Erişim Noktası)
 // RestController'e erişim için iletişim kurmak için bu annotation kullanılır ve tarayıcıdaki adres yerinde görülen yer bu adress olarak karşımıza çıkarır.
@RestController
@RequestMapping("/api/brands")
public class BrandsController {

	private BrandService brandService;

	// Api, Service çağırır.
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	// Veritabanındaki veya Apideki GetMapping ile verileri alma
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}

	// Apiye ve Veritabanına PostMapping ile veri ekleme
	@PostMapping("/add")
	public void add(CreateGetAllBrandsRequest createGetAllBrandsRequest) {
		this.brandService.add(createGetAllBrandsRequest);
	}
}

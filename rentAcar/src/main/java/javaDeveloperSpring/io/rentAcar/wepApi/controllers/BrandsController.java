package javaDeveloperSpring.io.rentAcar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaDeveloperSpring.io.rentAcar.business.abstracts.BrandService;
import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

@RestController // Restful olduğunu belirten bir annotation. Yani burası bir Access Point(Erişim
				// Noktası)
@RequestMapping("/api/brands") // RestController'e erişim için iletişim kurmak için bu annotation kullanılır ve
								// tarayıcıdaki adres yerinde görülen yer bu adress olarak karşımıza çıkarır.
public class BrandsController {

	private BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<Brand> getAll() {
		return brandService.getAll();
	}
}

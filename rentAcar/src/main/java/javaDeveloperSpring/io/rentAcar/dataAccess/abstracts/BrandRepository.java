package javaDeveloperSpring.io.rentAcar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaDeveloperSpring.io.rentAcar.entities.concretes.Brand;

// DataAccess - Veri Tabanı ile ilişkilendirilen yer.
// Yani veritabanındaki dataların nasıl kullanılması gerektiğini belirttiğimiz yer.
// Spring-JPA kullanarak JPARepository sayesinde veritabanı işlemlerinin çoğunu halletmiş oluyoruz
// Yani Brand Entity ile match etmiş oluyoruz yani iki ayrı öğeyi mukayese etmiş oluyoruz/eşleştiriyoruz.
// Her entity için bir repository yazılmalıdır.
// DataAccess Katmanı, Entities Katmanındaki ilgili veritabanı nesnesini çağırır ve Respository'sini oluşturur.
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}

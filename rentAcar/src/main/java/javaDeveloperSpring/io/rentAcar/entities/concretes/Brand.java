package javaDeveloperSpring.io.rentAcar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Concretes - Somut Nesneler için
// Veri tabanı ile alakalı olan yer.
// Yani burada veritabanındaki tabloyu ve içerisindeki column'ları tasarladık

@Table(name= "brands") // Veritabanı için bir table oluşturuyoruz.
@Entity // Sen bir Veritabanı varlığısın demektir.
@Data // Data, @Getter ve @Setter'ın toplamı 
@AllArgsConstructor // İlgili sınıfın contstructor'lı yani parametreli halini oluşturuyor. Örn. Brand(int,String) gibi.
@NoArgsConstructor
public class Brand {
	
	@Id // Primary Key alansın
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id'yi veritabanı tarafından otomatik arttırmak için
	@Column(name = "id") //Bu şekilde Veritabınında brand tablosundaki column'larını oluşturduk.
	private int id;
	
	@Column(name = "name")
	private String name;
}

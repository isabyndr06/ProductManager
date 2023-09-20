package isabyndr.ProductManager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 45, nullable = false)
    private String name;
    @Column(length = 45, nullable = false)
    private String brand;
    @Column(length = 45, nullable = false)
    private String madein;
    @Column(nullable = false)
    private double price;


}























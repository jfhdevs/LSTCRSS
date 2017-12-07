package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "PRODUITS")
@NamedQueries({
		@NamedQuery(name = "Produit.findAll", query = " SELECT p FROM Produit p ORDER BY p.nom ")
}) // NamedQueries

public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "QUANTITE")
	private String quantite;

	@ManyToOne
	private Categorie categorie;
	

} // class Produit

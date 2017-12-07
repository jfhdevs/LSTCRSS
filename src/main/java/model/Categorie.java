package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
@NamedQueries({
		@NamedQuery(name = "Categorie.findAll", query = " SELECT c FROM Categorie c ORDER BY c.nom ")
}) // NamedQueries

public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOM", unique = true, nullable = false)
	private String nom;

	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Produit> produits;
	
	@ManyToMany(mappedBy = "categories", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Marchand> marchands;

} // class Categorie

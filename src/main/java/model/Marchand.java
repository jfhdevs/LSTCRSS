package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "MARCHANDS")
@NamedQueries({
		@NamedQuery(name = "Marchand.findAll", query = " SELECT m FROM Marchand m ORDER BY m.nom ")
}) // NamedQueries

public class Marchand implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "VILLE")
	private String ville;

	@ManyToMany
	private Set<Categorie> categories;

//	Constructeurs
	public Marchand() {}
	public Marchand(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	} // Marchand
	
//	Getteurs
	public Long getId()						{ return id; }
	public String getNom()					{ return nom; }
	public String getVille()				{ return ville; }
	public Set<Categorie> getCategories()	{ return categories; }
	
//	Setteurs
	public void setNom(String nom)							{ this.nom = nom; }
	public void setVille(String ville)						{ this.ville = ville; }
	public void setCategories(Set<Categorie> categories)	{ this.categories = categories; }
	
//	Autres	
	@Override
	public String toString() { return "Marchand [id=" + id + ", nom=" + nom + ", ville=" + ville + ", categories=" + categories + "]"; }
	
} // class Marchand

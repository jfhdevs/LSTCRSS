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

} // class Marchand

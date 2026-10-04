package tn.esprit.actuariat.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;

    @OneToOne(fetch = FetchType.LAZY)
    private Reservation reservation;
//Les Paiement appartiennent au cycle de vie du Contrat.
//
//Donc si le contrat est supprimé, ses paiements doivent être supprimés également.
//
//C'est justement ici que CascadeType.ALL devient pertinent.
    @OneToMany(
            mappedBy = "contrat",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Set<Paiement> paiements = new HashSet<>();
}
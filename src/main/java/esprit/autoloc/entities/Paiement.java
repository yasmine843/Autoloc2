package esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paiement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_paiement")
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode_paiement")
    private ModePaiement modePaiement;

    @Column(precision = 10, scale = 2)
    private BigDecimal montant;

    @Column(name = "contrat_id")
    private Long contratId;

    // Enum imbriqué pour le mode de paiement
    public enum ModePaiement {
        CARTE,
        ESPECE,
        VIREMENT
    }
}
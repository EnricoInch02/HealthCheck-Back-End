package it.contrader.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BloodTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "redBloodCell")
    private Float redBloodCell;

    @NotNull
    @Column(name = "whiteBloodCell")
    private Float whiteBloodCell;

    @NotNull
    @Column(name = "platelets")
    private Float platelets;

    @NotNull
    @Column(name = "hemoglobin")
    private Float hemoglobin;

    @NotNull
    @OneToOne
    @JoinColumn(referencedColumnName  = "id", name = "testFk")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Test testFk;
}

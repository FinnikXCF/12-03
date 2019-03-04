package mosecom.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = "Wells_Construction", schema = "public")
@Data
public class WellsConstruction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pkey_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Conctruction_type")
    protected ConstructionType constructionType;

    @Column(name = "Diametr")
    private int diameter;

    // TODO: Число?
    @Column(name = "Depth_from")
    private Double depthFrom;

    // TODO: Число?
    @Column(name = "Depth_till")
    private Double depthTo;

    @ManyToOne
    @JoinColumn(name = "Well_ID", referencedColumnName = "Well_ID")
    protected Well well;
}

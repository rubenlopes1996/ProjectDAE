package entities;

import entities.Artifact;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-28T23:06:39")
@StaticMetamodel(Software.class)
public class Software_ { 

    public static volatile SingularAttribute<Software, String> name;
    public static volatile SingularAttribute<Software, Integer> id;
    public static volatile SingularAttribute<Software, Double> version;
    public static volatile ListAttribute<Software, Artifact> artifacts;

}
package com.lab.promotion.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    @Access(value=AccessType.FIELD)
    @Id
    private Long id;
    private Date birthDay;
}

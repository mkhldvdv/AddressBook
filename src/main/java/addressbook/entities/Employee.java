/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@Entity
@JsonInclude(NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "[employees]")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String email;
    private String username;
    private String password;
    private String phone;
    private String extphone;
    private Date startdate;
    private Date enddate;
    private Long roleId;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "[department_id]")
    private Department department;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "[employee_id]")
    private Employee manager;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "[position_id]")
    private Position position;
    private Boolean enabled = true;
}

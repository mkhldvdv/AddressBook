/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@Data
@Entity
@JsonInclude(NON_EMPTY)
@Table(name = "[workplaces]")
public class Workplace implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Room room;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "[employee_id]")
    private Employee employee;
}

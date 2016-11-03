/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by mikhail.davydov on 21.10.2016.
 */

@Data
public class Building implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Long city;
    private Long plan;
}

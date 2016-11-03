/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Workplace implements Serializable {
  private Long id;
  private Long room;
  private Long employee;
}

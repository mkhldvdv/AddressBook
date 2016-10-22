/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

@Data
public class Stages {
  private Long id;
  private Long number;
  private String description;
  private Long building;
  private Long plan;
}

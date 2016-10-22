/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

@Data
public class Rooms {
  private Long id;
  private String name;
  private String description;
  private Long stage_id;
  private Long plan_id;
}

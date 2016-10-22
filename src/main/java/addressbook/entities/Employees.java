/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

@Data
public class Employees {
  private Long id;
  private String firstname;
  private String lastname;
  private java.sql.Date birthdate;
  private String email;
  private String username;
  private String password;
  private String phone;
  private String extphone;
  private java.sql.Date startdate;
  private java.sql.Date enddate;
  private Long role_id;
  private Long department_id;
  private Long employee_id;
  private Long position_id;
}

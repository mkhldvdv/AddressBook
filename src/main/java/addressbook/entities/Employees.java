/*
 *  Copyright (c) 2016 Mikhail Davydov <mkhldvdv@gmail.com> - All Rights Reserved
 *
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 */

package addressbook.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Employees {
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
  private Long department;
  private Long employee;
  private Long position;
}

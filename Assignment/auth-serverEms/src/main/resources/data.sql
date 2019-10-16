INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('mobile', '{bcrypt}$2a$10$gPhlXZfms0EpNHX0.HHptOhoFD1AoxSr/yUIdTqA8vtjeP4zi0DDu', 'http://localhost:8082/login', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO permission (NAME) VALUES
 ('write_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 INSERT INTO role (NAME) VALUES('ROLE_manager'),('ROLE_operator');

 INSERT INTO permission_role (PERMISSION_ID, ROLE_ID) VALUES
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read operator */
     (3,2);  /* update operator */
insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'Dasuni','{bcrypt}$2a$10$tlohLI7ArJ7soJIMJKUb.OYyQy//gIGwaJDybdd6ur.gVnhwsbhFS', 'dperera@gmail.com', '1', '1', '1', '1');
 insert into  user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'Nadun', '{bcrypt}$2a$10$tlohLI7ArJ7soJIMJKUb.OYyQy//gIGwaJDybdd6ur.gVnhwsbhFS','nadun@yahoo.com', '1', '1', '1', '1');

INSERT INTO role_user (ROLE_ID, USER_ID) VALUES (1, 1),(2, 2) ;
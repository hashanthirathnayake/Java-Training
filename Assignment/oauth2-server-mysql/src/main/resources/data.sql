INSERT INTO oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) VALUES ('web', '{bcrypt}$2a$10$YzL54RL2hGp1EvrCi51IF.wope7TZ5u3lWQdNlxmnxvhEhppneeyC', 'http://localhost:8281/login', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

 INSERT INTO permission (name) VALUES
 ('read_profile'),
 ('write_profile'),
 ('delete_profile');

 INSERT INTO role (name) VALUES
		('ROLE_manager'),('ROLE_operator');

 INSERT INTO permission_role (permission_id, role_id) VALUES
     (1,1), /*read manager */
     (2,1), /*write manager */
     (3,1), /*delete manager */
     (1,2); /*read operator */
 INSERT INTO user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('1', 'hash','{bcrypt}$2a$10$LAlNQw7Qcu3xf1C2k6drw.NBeMP4uboRjsDGDKYPequuxXw.dGtCm', 'pubudu@pubudu.com', '1', '1', '1', '1');
 INSERT INTO user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES ('2', 'sally', '{bcrypt}$2a$10$iOZbI7Tz646iVNGWa03Y/.oviEvtCZRWl8wdSStAr7SgfvIF93DOW','prasanna@prasanna.com', '1', '1', '1', '1');

 INSERT INTO role_user (role_id, user_id)
    VALUES
    (1, 1) /* hash-manager */,
    (2, 2) /* sally-operatorr */ ;

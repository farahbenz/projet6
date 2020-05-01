insert into user (username, actived, email, password) values ('admin1', true, 'farahben@wanadoo.fr', 'fafa');
insert into user (username, actived, email, password) values ('user1', true, 'farah.benzerrouk@gmail.com', 'fafa');

insert into role (role) values ('admin');
insert into role (role) values ('user'); 

insert into user_role (user_username, roles_role) values ('admin1', 'admin');
insert into user_role (user_username, roles_role) values ('user1', 'user');

insert into spot (id, coordonee_geo, cotation, hauteur, nom, nombre_de_voies, orientation, secteur, tag, type, user_username) values(1,'N34567765','8b','80m','Ablon','400','Sud-Est','Haute-Savoie',false,'Falaise','admin1');
insert into spot (id, coordonee_geo, cotation, hauteur, nom, nombre_de_voies, orientation, secteur, tag, type, user_username) values(2,'N45678654','4b','60m','Balme de Yenne','200','Nord','Savoie',false,'Falaise','user1');
insert into spot (id, coordonee_geo, cotation, hauteur, nom, nombre_de_voies, orientation, secteur, tag, type, user_username) values(3,'N78909876','4b à 6a+','5m','Chamiere','25','Toutes','Ardèche',false,'Bloc','admin1');

insert into comment (id, auteur, commentaire, date_parution, id_spot) values (1,'admin1','Je conseil cet endroit magnifique','2019-12-05',1);
insert into comment (id, auteur, commentaire, date_parution, id_spot) values (2,'user1','Super pour les amateurs de sensation forte','2020-04-22',1);
insert into comment (id, auteur, commentaire, date_parution, id_spot) values (3,'admin1','Genial, super expérience','2020-02-02',2);
insert into comment (id, auteur, commentaire, date_parution, id_spot) values (4,'user1','Olala c"était superbe','2019-03-21',2);
insert into comment (id, auteur, commentaire, date_parution, id_spot) values (5,'admin1','Top! ','2018-04-22',3);
insert into comment (id, auteur, commentaire, date_parution, id_spot) values (6,'user1','Je recommande cet endroit pour débutant','2019-05-22',3);

insert into topo (id, booking_user, date_parution, description, disponibilite, nom, region, user_username,echange_email) values (1,'','2019-01-23','Super endroit pour amateur de sensation forte',false,'admin1','Savoie','admin1', false);
insert into topo (id, booking_user, date_parution, description, disponibilite, nom, region, user_username,echange_email) values (2,'','2020-02-02','Pour débutant',false,'admin2','Ardèche','admin1', false);
insert into topo (id, booking_user, date_parution, description, disponibilite, nom, region, user_username,echange_email) values (3,'','2019-03-17','Pour une balade',false,'user1','Haute-Savoie','user1', false);
insert into topo (id, booking_user, date_parution, description, disponibilite, nom, region, user_username,echange_email) values (4,'','2020-04-28','Belle vue',false,'user2','Ile-de-france','user1', false);









CREATE TABLE User (
                username VARCHAR NOT NULL,
                password VARCHAR NOT NULL,
                email VARCHAR NOT NULL,
                actived BOOLEAN DEFAULT true NOT NULL,
                CONSTRAINT User_pk PRIMARY KEY (username)
);


CREATE TABLE Spot (
                id INTEGER NOT NULL,
                username VARCHAR NOT NULL,
                secteur VARCHAR NOT NULL,
                tag BOOLEAN DEFAULT false NOT NULL,
                nom VARCHAR NOT NULL,
                type VARCHAR NOT NULL,
                hauteur VARCHAR NOT NULL,
                orientation VARCHAR NOT NULL,
                nombre_de_voies INTEGER NOT NULL,
                cotation VARCHAR NOT NULL,
                Coordonnee_geo VARCHAR NOT NULL,
                CONSTRAINT Spot_pk PRIMARY KEY (id, username)
);


CREATE TABLE Commentaire (
                id INTEGER NOT NULL,
                username VARCHAR NOT NULL,
                commentaire LONGNVARCHAR NOT NULL,
                auteur VARCHAR NOT NULL,
                CONSTRAINT Commentaire_pk PRIMARY KEY (id, username)
);


CREATE TABLE Topo (
                id INTEGER NOT NULL,
                username VARCHAR NOT NULL,
                nom VARCHAR NOT NULL,
                descriptif VARCHAR NOT NULL,
                region VARCHAR NOT NULL,
                date_parution DATE NOT NULL,
                disponibilite BOOLEAN DEFAULT false NOT NULL,
                bookingUser VARCHAR,
                CONSTRAINT Topo_pk PRIMARY KEY (id, username)
);


CREATE TABLE User_role (
                username VARCHAR NOT NULL,
                user_username VARCHAR NOT NULL,
                roles_role VARCHAR NOT NULL,
                CONSTRAINT User_role_pk PRIMARY KEY (username)
);


CREATE TABLE Role (
                role VARCHAR NOT NULL,
                username VARCHAR NOT NULL,
                CONSTRAINT Role_pk PRIMARY KEY (role, username)
);


ALTER TABLE User_role ADD CONSTRAINT User_User_role_fk
FOREIGN KEY (username)
REFERENCES User (username)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Topo ADD CONSTRAINT User_Topo_fk
FOREIGN KEY (username)
REFERENCES User (username)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Spot ADD CONSTRAINT User_Spot_fk
FOREIGN KEY (username)
REFERENCES User (username)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Commentaire ADD CONSTRAINT Spot_Commentaire_fk
FOREIGN KEY (id, username)
REFERENCES Spot (id, username)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE Role ADD CONSTRAINT User_role_Role_fk
FOREIGN KEY (username)
REFERENCES User_role (username)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

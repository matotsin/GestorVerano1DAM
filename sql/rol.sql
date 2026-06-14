/*
    usuario 1:1 rol
    usuario 1:n cuentas (contr, n_usu, fechas...)
    cuebtas n:1 usuario ()
*/



CREATE TABLE ROL(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL
);


CREATE TABLE USUARIO(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usu VARCHAR(30) UNIQUE,
    contrasenya_usuario VARCHAR(500) NOT NULL,
    id_rol INT NOT NULL,
    CONSTRAINT fk_usuario_rol FOREIGN KEY (id_rol) REFERENCES ROL(id)
);

CREATE TABLE CUENTA(
    id_cuenta INT  AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    correo VARCHAR(100) NOT NULL, 
    contrasenya VARCHAR(500) NOT NULL,
    url VARCHAR(500),
    f_creacion DATE,
    f_mod DATE,
    id_usuario INT NOT NULL,
    CONSTRAINT fk_cuenta_usuario FOREIGN KEY (id_usuario) REFERENCES USUARIO(id)
);

INSERT INTO ROL (nombre) VALUES ('admin');
INSERT INTO ROL (nombre) VALUES ('normal');
INSERT INTO ROL (nombre) VALUES ('pruebas');
CREATE table Usuarios(
    us_username varchar(20) primary key,
    us_nombre varchar(20),
    us_apellido varchar(20),
    us_email varchar(20),
    us_celular bigint,
    us_contraseña varchar(5) not null,
    us_fechaNacimiento date
    );

INSERT into Usuarios values("lucky", "Pedro", "Perez", "pedro@correo.com", 3220000000, "12345", "1998-05-31"),
("malopez", "Maria", "Lopez", "Maria@correo.com", 3220000001, "02345", "1998-06-11"),
("diva", "Ana", "Diaz", "Ana@correo.com", 3220000011, "00345", "1997-06-01"),
("dreamer", "Luis", "Rojas", "Luis@correo.com", 3220000211, "00145", "1999-03-01"),
("ninja", "Andres", "Cruz", "Andres@correo.com", 3220003211, "10145", "1998-02-11"),
("neon", "Nelson", "Ruiz", "Nelson@correo.com", 3220013211, "10146", "1995-12-11"),
("rose", "Claudia", "Mendez", "Clau@correo.com", 3220513211, "12346", "1993-02-10"),
("green", "Jorge", "Rodriguez", "Jorge@correo.com", 3222513211, "12026", "1992-12-15");
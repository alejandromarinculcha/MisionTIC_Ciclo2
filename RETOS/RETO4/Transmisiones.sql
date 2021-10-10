CREATE table Transmisiones(
    tra_id int primary key,
    tra_username varchar(20),
    tra_contenido int,
    tra_fecha datetime,

    FOREIGN KEY (tra_username) REFERENCES Usuarios (us_username),
    FOREIGN KEY (tra_contenido) REFERENCES Contenidos (contenido_id)
);

INSERT into Transmisiones values    (1, "lucky", 1, '2017-10-25 20:00:00'),
                                    (2, "lucky", 2, '2019-03-15 18:30:00'),
                                    (3, "lucky", 3, '2019-05-20 20:30:00'),
                                    (4, "malopez", 1, '2018-05-20 20:30:00'),
                                    (5, "malopez", 3, '2020-01-20 20:30:00'),
                                    (6, "diva", 4, '2019-05-20 20:30:00'),
                                    (7, "diva", 5, '2018-06-22 21:30:00'),
                                    (8, "diva", 6, '2020-03-17 15:30:20'),
                                    (9, "dreamer", 6, '2020-03-17 15:30:20'),
                                    (10, "dreamer", 8, '2020-04-10 18:30:20'),
                                    (11, "ninja", 9, '2020-02-17 20:30:20'),
                                    (12, "ninja", 3, '2020-02-20 16:30:20'),
                                    (13, "ninja", 7, '2020-03-27 18:30:20'),
                                    (14, "rose", 11, '2020-03-20 21:30:20'),
                                    (15, "green", 4, '2020-01-10 17:30:20'),
                                    (16, "green", 2, '2020-02-15 20:30:20'),
                                    (17, "green", 12, '2020-03-17 18:30:20');
CREATE table Series(
    serie_id int primary key,
    serie_num_temporadas int,
    serie_num_episodios int,

    FOREIGN KEY (serie_id) REFERENCES Contenidos (contenido_id));

INSERT into Series values(06, 7, 329),
                         (07, 2, 50),
                         (08, 5, 50),
                         (09, 8, 178),
                         (10, 1, 6),
                         (11, 1, 96),
                         (12, 5, 124),
                         (13, 13, 75);
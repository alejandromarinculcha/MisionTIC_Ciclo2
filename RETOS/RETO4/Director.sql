CREATE table Director(
    director_id int primary key,
    director_nombre char(20),
    director_apellido char(20),
    director_nacionalidad char(50)
    );

INSERT into Director values (01, "Andrew", "Stanton", "canadiense"),
                           (02, "Mark", "Andrews", "estadounidense"),
                           (03, "Chris", "Columbus", "estadounidense"),
                           (04, "Jennifer", "Kluska", "rusa"),
                           (05, "Dean", "DeBlois", "frances");
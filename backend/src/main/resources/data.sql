-- Géneros
INSERT INTO generos (nombre)
VALUES ('RPG'),
       ('Shooter'),
       ('Aventura');

-- Videojuegos
INSERT INTO videojuegos (titulo, plataforma, favorito, genero_id)
VALUES ('The Witcher 3', 'PC', true, 1),
       ('Call of Duty MW3', 'PlayStation 5', false, 2),
       ('Zelda Breath of the Wild', 'Nintendo Switch', true, 3);
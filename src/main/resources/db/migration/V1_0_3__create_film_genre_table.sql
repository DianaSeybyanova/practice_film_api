CREATE TABLE film_genre (
    ID_FILM VARCHAR(40) REFERENCES film(id_film),
    ID_GENRE VARCHAR(40) REFERENCES genre(id_genre)
)
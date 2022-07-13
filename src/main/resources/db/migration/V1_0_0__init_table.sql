create schema if not exists film_db_schema;
create table film_db_schema.film (
    id bigint primary key,
    name varchar(64) not null,
    name_original varchar(64) not null,
    release_date date,
    runtime int,
    certification float,
    count_reviews int,
    rating_kinopoisk float,
    rating_imdb float,
    budget int,
    gross int
);
create table film_db_schema.genre (
    id bigint primary key,
    name VARCHAR(32) not null
);
create table film_db_schema.film_genre (
    id_film bigint references film_db_schema.film(id),
    id_genre bigint references film_db_schema.genre(id),
    primary key (id_film, id_genre)
);
create table film_db_schema.personality (
    id bigint primary key,
    name varchar(128) not null,
    dob date
);
create table film_db_schema.position (
    id bigint primary key,
    name varchar(100) not null
);
create table film_db_schema.actor (
    id_genre bigint references film_db_schema.personality(id),
    id_film bigint references film_db_schema.film(id),
    character varchar(64),
    role varchar(64),
    primary key (id_genre, id_film)
);
create table film_db_schema.creators (
    id_film bigint references film_db_schema.film(id),
    id_personality bigint references film_db_schema.personality(id),
    id_position bigint references film_db_schema.position(id),
    primary key (id_film, id_personality, id_position)
);
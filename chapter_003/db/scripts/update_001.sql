CREATE TABLE cars(
    id serial primary key,
    model varchar(255),
    created timestamp,
    owner varchar(255)
);
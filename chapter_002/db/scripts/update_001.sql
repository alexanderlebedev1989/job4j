create table items (
   id serial primary key not null,
   name varchar(2000),
   description TEXT,
   created TIMESTAMP
);
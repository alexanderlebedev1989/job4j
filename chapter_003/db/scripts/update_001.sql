DROP TABLE IF EXISTS items;

create table items (
   id serial primary key not null,
   item_name varchar(2000)
);

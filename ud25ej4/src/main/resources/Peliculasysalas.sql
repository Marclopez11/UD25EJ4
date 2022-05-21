CREATE DATABASE Peliculasysalas;


USE Peliculasysalas;




DROP TABLE IF EXISTS peliculas;
CREATE TABLE peliculas(
id int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100) NOT NULL,
calificacionedad int not null
);






DROP TABLE IF EXISTS salas;
CREATE TABLE salas(
id int AUTO_INCREMENT PRIMARY KEY,
nombre nvarchar(100) NULL,
id_pelicula int,
CONSTRAINT FK_pelicula FOREIGN KEY (id_pelicula)
REFERENCES peliculas(id)
ON DELETE CASCADE ON UPDATE CASCADE


);
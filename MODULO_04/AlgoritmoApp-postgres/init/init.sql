-- init/init.sql

-- Este script se ejecuta automáticamente cuando el contenedor inicia por primera vez

-- Crear el usuario 'said' con contraseña 'said'
CREATE USER said WITH PASSWORD 'said';

-- Crear la base de datos 'said' y asignarla al usuario
CREATE DATABASE said OWNER said;
CREATE DATABASE cometa OWNER said;

-- (Opcional) Darle todos los privilegios sobre la base de datos
GRANT ALL PRIVILEGES ON DATABASE said TO said;
GRANT ALL PRIVILEGES ON DATABASE cometa TO said;
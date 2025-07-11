-- This SQL script creates a table named 'empleados' with the following columns
CREATE TABLE empleados (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE tareas (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    descripcion TEXT,
    fecha_creacion DATE NOT NULL DEFAULT CURRENT_DATE,
    estado VARCHAR(20) NOT NULL DEFAULT 'pendiente',
    empleado_id INTEGER NOT NULL
    --CONSTRAINT fk_empleado
      --  FOREIGN KEY (empleado_id)
      --  REFERENCES empleados(id)
     --   ON DELETE CASCADE
);

INSERT INTO empleados (nombre, apellido, email) VALUES ('Juan', 'Pérez', 'juan.perez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Ana', 'Gómez', 'ana.gomez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Carlos', 'Lopez', 'carlos.lopez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Luis', 'Martínez', 'luis.martinez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Sofía', 'Rodríguez', 'sofia.rodriguez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Miguel', 'Fernández', 'miguel.fernandez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Laura', 'Hernández', 'laura.hernandez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Pedro', 'García', 'pedro.garcia@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('Marta', 'Sánchez', 'marta.sanchez@email.com');
INSERT INTO empleados (nombre, apellido, email) VALUES ('José', 'Díaz', 'jose.diaz@email.com');

---
-- Asumiendo que los IDs de los empleados ya están generados como 1, 2, 3, ...
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 1', 'Revisar informe financiero', 1);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 2', 'Actualizar página web', 2);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 3', 'Desarrollar nueva funcionalidad', 3);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 4', 'Reunión con clientes', 4);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 5', 'Preparar presentación para conferencia', 5);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 6', 'Revisión de código', 6);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 7', 'Redactar reporte mensual', 7);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 8', 'Gestionar presupuesto de proyecto', 8);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 9', 'Entrenamiento de equipo', 9);
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 10', 'Analizar estadísticas de ventas', 10);

--1. LEFT JOIN (devuelve todos los registros de la tabla empleados y los correspondientes de tareas si existen):
SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
LEFT JOIN tareas t ON e.id = t.empleado_id;

--2. RIGHT JOIN (devuelve todos los registros de la tabla tareas y los correspondientes de empleados si existen):  
SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
RIGHT JOIN tareas t ON e.id = t.empleado_id;

--3. INNER JOIN (devuelve solo los registros que tienen coincidencias en ambas tablas):
SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
INNER JOIN tareas t ON e.id = t.empleado_id;

--4. FULL OUTER JOIN (devuelve todos los registros de ambas tablas, combinando coincidencias):
SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
FULL OUTER JOIN tareas t ON e.id = t.empleado_id;
--5. CROSS JOIN (devuelve el producto cartesiano de ambas tablas):
SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
CROSS JOIN tareas t;
--6. SELF JOIN (unir la tabla empleados consigo misma para encontrar empleados con el mismo apellido):
SELECT e1.id AS empleado_id, e1.nombre, e1.apellido, e2.id AS empleado_id_2, e2.nombre AS nombre_2, e2.apellido AS apellido_2
FROM empleados e1
INNER JOIN empleados e2 ON e1.apellido = e2.apellido AND e1.id <> e2.id;



-- Insertar empleados
INSERT INTO empleados (nombre, apellido, email) VALUES ('Juan', 'Pérez', 'juan.perez@email.com');   -- id=1
INSERT INTO empleados (nombre, apellido, email) VALUES ('Ana', 'Gómez', 'ana.gomez@email.com');     -- id=2
INSERT INTO empleados (nombre, apellido, email) VALUES ('Carlos', 'Lopez', 'carlos.lopez@email.com'); -- id=3
INSERT INTO empleados (nombre, apellido, email) VALUES ('Luis', 'Martínez', 'luis.martinez@email.com');-- id=4
INSERT INTO empleados (nombre, apellido, email) VALUES ('Sofía', 'Rodríguez', 'sofia.rodriguez@email.com');-- id=5


-- Insertar tareas
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 1', 'Revisar informe financiero', 1);   -- id=1
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 2', 'Actualizar página web', 2);         -- id=2
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 3', 'Desarrollar nueva funcionalidad', 2); -- id=3
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 4', 'Reunión con clientes', 3);           -- id=4
INSERT INTO tareas (name, descripcion, empleado_id) VALUES ('Tarea 5', 'Preparar presentación', 6);           -- id=5


SELECT e.id AS empleado_id, e.nombre, e.apellido, e.email, t.id AS tarea_id, t.name AS tarea_name, t.estado
FROM empleados e
LEFT JOIN tareas t ON e.id = t.empleado_id;

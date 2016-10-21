-- Create schemas

-- Create tables
CREATE TABLE IF NOT EXISTS employees
(
    id INTEGER NOT NULL,
    firstname TEXT,
    lastname TEXT,
    birthdate DATE,
    email TEXT UNIQUE,
	username TEXT UNIQUE,
	password TEXT,
    phone NUMERIC(15, 0),
    extphone NUMERIC(5, 0),
    startdate DATE,
    enddate DATE,
    role_id INTEGER,
    department_id INTEGER,
    employee_id INTEGER,
    position_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS roles
(
    id INTEGER NOT NULL,
    name TEXT,
    enabled BOOLEAN,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS departments
(
    id INTEGER NOT NULL,
    name TEXT,
    department_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS cities
(
    id INTEGER NOT NULL,
    name TEXT,
    country_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS buildings
(
    id INTEGER NOT NULL,
    name TEXT,
    description TEXT,
    city_id INTEGER,
    plan_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS stages
(
    id INTEGER NOT NULL,
    number INTEGER,
    description TEXT,
    building_id INTEGER,
    plan_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS rooms
(
    id INTEGER NOT NULL,
    name TEXT,
    description TEXT,
    stage_id INTEGER,
    plan_id INTEGER,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS workplaces
(
    id INTEGER NOT NULL,
    room_id INTEGER,
    employee_id INTEGER UNIQUE,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS countries
(
    id INTEGER NOT NULL,
    name TEXT,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS plans
(
    id INTEGER NOT NULL,
    code TEXT,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS positions
(
    id INTEGER NOT NULL,
    name TEXT,
    PRIMARY KEY(id)
);


-- Create FKs
ALTER TABLE departments
    ADD    FOREIGN KEY (department_id)
    REFERENCES departments(id)
    MATCH SIMPLE
;
    
ALTER TABLE employees
    ADD    FOREIGN KEY (employee_id)
    REFERENCES employees(id)
    MATCH SIMPLE
;
    
ALTER TABLE employees
    ADD    FOREIGN KEY (role_id)
    REFERENCES roles(id)
    MATCH SIMPLE
;
    
ALTER TABLE employees
    ADD    FOREIGN KEY (department_id)
    REFERENCES departments(id)
    MATCH SIMPLE
;
    
ALTER TABLE employees
    ADD    FOREIGN KEY (position_id)
    REFERENCES positions(id)
    MATCH SIMPLE
;
    
ALTER TABLE workplaces
    ADD    FOREIGN KEY (employee_id)
    REFERENCES employees(id)
    MATCH SIMPLE
;
    
ALTER TABLE workplaces
    ADD    FOREIGN KEY (room_id)
    REFERENCES rooms(id)
    MATCH SIMPLE
;
    
ALTER TABLE rooms
    ADD    FOREIGN KEY (stage_id)
    REFERENCES stages(id)
    MATCH SIMPLE
;
    
ALTER TABLE stages
    ADD    FOREIGN KEY (building_id)
    REFERENCES buildings(id)
    MATCH SIMPLE
;
    
ALTER TABLE buildings
    ADD    FOREIGN KEY (city_id)
    REFERENCES cities(id)
    MATCH SIMPLE
;
    
ALTER TABLE cities
    ADD    FOREIGN KEY (country_id)
    REFERENCES countries(id)
    MATCH SIMPLE
;
    
ALTER TABLE buildings
    ADD    FOREIGN KEY (plan_id)
    REFERENCES plans(id)
    MATCH SIMPLE
;
    
ALTER TABLE stages
    ADD    FOREIGN KEY (plan_id)
    REFERENCES plans(id)
    MATCH SIMPLE
;
    
ALTER TABLE rooms
    ADD    FOREIGN KEY (plan_id)
    REFERENCES plans(id)
    MATCH SIMPLE
;


-- Create Indexes
CREATE INDEX  ON employees (role_id);
CREATE INDEX  ON employees (department_id);
CREATE INDEX  ON employees (employee_id);
CREATE INDEX  ON employees (position_id);
CREATE INDEX  ON departments (department_id);
CREATE INDEX  ON cities (country_id);
CREATE INDEX  ON buildings (city_id);
CREATE INDEX  ON buildings (plan_id);
CREATE INDEX  ON stages (building_id);
CREATE INDEX  ON stages (plan_id);
CREATE INDEX  ON rooms (stage_id);
CREATE INDEX  ON rooms (plan_id);


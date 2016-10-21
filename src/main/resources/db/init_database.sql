create database addressbook with encoding='UTF-8' connection limit=-1;

\connect addressbook

CREATE ROLE addressbook LOGIN PASSWORD 'addressbookadmin';
CREATE SCHEMA addressbook AUTHORIZATION addressbook;
DROP TABLE IF EXISTS organizations;

CREATE TABLE organizations (
    organization_id     VARCHAR(15) PRIMARY KEY,
    organization_name   VARCHAR NOT NULL,
    email   VARCHAR NOT NULL,
    phone   VARCHAR NOT NULL
);
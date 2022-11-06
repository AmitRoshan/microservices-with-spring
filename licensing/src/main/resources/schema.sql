DROP TABLE IF EXISTS licenses;

CREATE TABLE licenses (
    license_id      VARCHAR(15) PRIMARY KEY,
    organization_id VARCHAR(15) NOT NULL,
    license_type    VARCHAR NOT NULL,
    product_name    VARCHAR NOT NULL,
    licenses_max    INT,
    licenses_allocated   INT,
    comment     VARCHAR
);
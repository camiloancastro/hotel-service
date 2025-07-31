CREATE TABLE hotel
(
    id      UUID    NOT NULL,
    name    VARCHAR(255),
    address VARCHAR(255),
    city    VARCHAR(255),
    country VARCHAR(255),
    enabled BOOLEAN NOT NULL,
    CONSTRAINT pk_hotel PRIMARY KEY (id)
);
CREATE TABLE room
(
    id              UUID NOT NULL,
    room_number     VARCHAR(255),
    type            VARCHAR(255),
    capacity        INTEGER,
    price_per_night DOUBLE PRECISION,
    available       BOOLEAN,
    hotel_id        UUID NOT NULL,
    CONSTRAINT pk_room PRIMARY KEY (id)
);

ALTER TABLE room
    ADD CONSTRAINT FK_ROOM_ON_HOTEL FOREIGN KEY (hotel_id) REFERENCES hotel (id);
package com.hotel.hotel_service.service;

import java.util.UUID;
import org.springframework.data.domain.Page;

/**
 * Generic interface for CRUD operations.
 *
 * @param <R> the type of the request object
 * @param <T> the type of the response object
 */
public interface CrudApiHandler <R, T>{

    T create(R request);

    T update(UUID id, R request);

    T getById(UUID id);

    void deleteById(UUID id);

    Page<T> getAll();

}

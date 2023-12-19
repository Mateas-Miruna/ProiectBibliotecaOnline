package ro.uvt.info.splabmm1.service;

import org.springframework.http.ResponseEntity;


public interface Command<T> {

    T execute();
}
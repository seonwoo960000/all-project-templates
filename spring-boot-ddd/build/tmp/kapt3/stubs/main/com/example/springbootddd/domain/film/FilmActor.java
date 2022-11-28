package com.example.springbootddd.domain.film;

import java.time.Instant;
import javax.persistence.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/example/springbootddd/domain/film/FilmActor;", "", "()V", "actor", "Lcom/example/springbootddd/domain/film/Actor;", "getActor", "()Lcom/example/springbootddd/domain/film/Actor;", "setActor", "(Lcom/example/springbootddd/domain/film/Actor;)V", "film", "Lcom/example/springbootddd/domain/film/Film;", "getFilm", "()Lcom/example/springbootddd/domain/film/Film;", "setFilm", "(Lcom/example/springbootddd/domain/film/Film;)V", "id", "Lcom/example/springbootddd/domain/film/FilmActorId;", "getId", "()Lcom/example/springbootddd/domain/film/FilmActorId;", "setId", "(Lcom/example/springbootddd/domain/film/FilmActorId;)V", "lastUpdate", "Ljava/time/Instant;", "getLastUpdate", "()Ljava/time/Instant;", "setLastUpdate", "(Ljava/time/Instant;)V", "spring-boot-ddd"})
@javax.persistence.Table(name = "film_actor")
@javax.persistence.Entity()
public class FilmActor {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.EmbeddedId()
    private com.example.springbootddd.domain.film.FilmActorId id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "actor_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, optional = false)
    @javax.persistence.MapsId(value = "actorId")
    private com.example.springbootddd.domain.film.Actor actor;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "film_id", nullable = false)
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, optional = false)
    @javax.persistence.MapsId(value = "filmId")
    private com.example.springbootddd.domain.film.Film film;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column(name = "last_update", nullable = false)
    private java.time.Instant lastUpdate;
    
    public FilmActor() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.example.springbootddd.domain.film.FilmActorId getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable()
    com.example.springbootddd.domain.film.FilmActorId p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.example.springbootddd.domain.film.Actor getActor() {
        return null;
    }
    
    public void setActor(@org.jetbrains.annotations.Nullable()
    com.example.springbootddd.domain.film.Actor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.example.springbootddd.domain.film.Film getFilm() {
        return null;
    }
    
    public void setFilm(@org.jetbrains.annotations.Nullable()
    com.example.springbootddd.domain.film.Film p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.time.Instant getLastUpdate() {
        return null;
    }
    
    public void setLastUpdate(@org.jetbrains.annotations.Nullable()
    java.time.Instant p0) {
    }
}
package com.example.springbootddd.domain.film

import com.example.springbootddd.domain.film.FilmCategory
import java.math.BigDecimal
import java.time.Instant
import javax.persistence.*

@Entity
@Table(name = "film")
open class Film {
    @Id
    @Column(name = "film_id", columnDefinition = "SMALLINT UNSIGNED not null")
    open var id: Int? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @Lob
    @Column(name = "description")
    open var description: String? = null

    @Column(name = "release_year")
    open var releaseYear: Int? = null

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "language_id", nullable = false)
    open var language: Language? = null

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "original_language_id")
    open var originalLanguage: Language? = null

    @Column(name = "rental_duration", columnDefinition = "TINYINT UNSIGNED not null")
    open var rentalDuration: Short? = null

    @Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
    open var rentalRate: BigDecimal? = null

    @Column(name = "length", columnDefinition = "SMALLINT UNSIGNED")
    open var length: Int? = null

    @Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
    open var replacementCost: BigDecimal? = null

    @Lob
    @Column(name = "rating")
    open var rating: String? = null

    @Lob
    @Column(name = "special_features")
    open var specialFeatures: String? = null

    @Column(name = "last_update", nullable = false)
    open var lastUpdate: Instant? = null

    @OneToMany(mappedBy = "film")
    open var filmCategories: MutableSet<FilmCategory> = mutableSetOf()

    @Entity
    @Table(name = "language")
    open class Language {
        @Id
        @Column(name = "language_id", columnDefinition = "TINYINT UNSIGNED not null")
        open var id: Short? = null

        @Column(name = "name", nullable = false, length = 20)
        open var name: String? = null

        @Column(name = "last_update", nullable = false)
        open var lastUpdate: Instant? = null
    }

    @Entity
    @Table(name = "film_text")
    open class FilmText {
        @Id
        @Column(name = "film_id", nullable = false)
        open var id: Short? = null

        @Column(name = "title", nullable = false)
        open var title: String? = null

        @Lob
        @Column(name = "description")
        open var description: String? = null
    }
}
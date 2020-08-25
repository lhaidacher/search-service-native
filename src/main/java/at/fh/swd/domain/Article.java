package at.fh.swd.domain;

import java.util.Comparator;

public class Article implements Comparable<Article> {
    private static final Comparator<Article> ORDER_BY_NAME = Comparator.comparing(Article::getName);

    private final Long id;
    private final String name;

    public Article(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Article article) {
        return ORDER_BY_NAME.compare(this, article);
    }
}

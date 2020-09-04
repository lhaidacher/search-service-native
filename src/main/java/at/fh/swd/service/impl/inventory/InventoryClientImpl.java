package at.fh.swd.service.impl.inventory;

import at.fh.swd.domain.Article;
import at.fh.swd.service.impl.InventoryClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
class InventoryClientImpl implements InventoryClient {
    @Override
    public Set<Article> getArticles(String keyword) {
        return new HashSet<>() {{
            add(new Article(1213L, "MacBook Pro 15'"));
            add(new Article(542L, "iPhone 12S Pro Plus"));
            add(new Article(65535L, "Apple TV"));
            add(new Article(435L, "Sony TV HS+123"));
            add(new Article(13061996L, "Nagellack von Gucci für Laura <3"));
        }};
    }
}

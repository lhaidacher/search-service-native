package at.fh.swd.service.impl.inventory;

import at.fh.swd.domain.Article;
import at.fh.swd.service.impl.InventoryClient;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@ApplicationScoped
class InventoryClientImpl implements InventoryClient {
    private static final Logger LOGGER = Logger.getLogger(InventoryClientImpl.class.getName());

    @Override
    public Set<Article> getArticles(String keyword) {
        LOGGER.fine("started getArticles() method");
        return new HashSet<>() {{
            add(new Article(1213L, "MacBook Pro 15'"));
            add(new Article(542L, "iPhone 12S Pro Plus"));
            add(new Article(65535L, "Apple TV"));
        }};
    }
}

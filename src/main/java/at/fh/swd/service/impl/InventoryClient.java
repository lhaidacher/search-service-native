package at.fh.swd.service.impl;

import at.fh.swd.domain.Article;

import java.util.Set;

public interface InventoryClient {
    Set<Article> getArticles(String keyword);
}

package at.fh.swd.service;

import at.fh.swd.domain.Article;

import java.util.List;
import java.util.Set;

public interface ArticleService {
    List<Article> getArticles(String keyword);

    Set<String> getTrendingKeywords();
}

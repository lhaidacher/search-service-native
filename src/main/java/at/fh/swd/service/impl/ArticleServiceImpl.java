package at.fh.swd.service.impl;

import at.fh.swd.dao.TrendDao;
import at.fh.swd.domain.Article;
import at.fh.swd.service.ArticleService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
class ArticleServiceImpl implements ArticleService {
    private final InventoryClient client;
    private final TrendDao dao;

    @Inject
    public ArticleServiceImpl(final InventoryClient client, final TrendDao dao) {
        this.client = client;
        this.dao = dao;
    }

    @Override
    public List<Article> getArticles(String keyword) {
        dao.addKeyword(keyword);
        return client.getArticles(keyword).stream()
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public Set<String> getTrendingKeywords() {
        return dao.findTrendingKeywords();
    }
}

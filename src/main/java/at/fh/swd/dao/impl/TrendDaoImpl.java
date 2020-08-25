package at.fh.swd.dao.impl;

import at.fh.swd.dao.TrendDao;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

@ApplicationScoped
class TrendDaoImpl implements TrendDao {
    private static final Logger LOGGER = Logger.getLogger(TrendDaoImpl.class.getName());

    public Set<String> findTrendingKeywords() {
        LOGGER.fine("started findTopArticle() method");
        return new HashSet<>() {{
            add("MacBook");
            add("iPhone");
        }};
    }


    @Override
    public void addKeyword(String keyword) {
        LOGGER.fine("started findTopArticle() method");
        //TODO save search request
    }
}

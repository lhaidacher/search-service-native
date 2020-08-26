package at.fh.swd.dao.impl;

import at.fh.swd.dao.TrendDao;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
class TrendDaoImpl implements TrendDao {
    public Set<String> findTrendingKeywords() {
        return new HashSet<>() {{
            add("MacBook");
            add("iPhone");
        }};
    }


    @Override
    public void addKeyword(String keyword) {
        //TODO save search request
    }
}

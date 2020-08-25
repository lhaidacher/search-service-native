package at.fh.swd.dao;

import java.util.Set;

public interface TrendDao {
    Set<String> findTrendingKeywords();

    void addKeyword(String keyword);
}

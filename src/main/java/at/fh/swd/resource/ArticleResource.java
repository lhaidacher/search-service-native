package at.fh.swd.resource;

import at.fh.swd.domain.Article;
import at.fh.swd.service.ArticleService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Set;

@Path("/articles")
public class ArticleResource {
    private final ArticleService service;

    @Inject
    public ArticleResource(final ArticleService service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Article> articles(@QueryParam("keyword") String keyword) {
        return service.getArticles(keyword);
    }

    @GET
    @Path("/trends")
    @Produces(MediaType.APPLICATION_JSON)
    public Set<String> trends() {
        return service.getTrendingKeywords();
    }
}

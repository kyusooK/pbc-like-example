package likeserver.domain;

import likeserver.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "likes", path = "likes")
public interface LikeRepository
    extends PagingAndSortingRepository<Like, String> {}

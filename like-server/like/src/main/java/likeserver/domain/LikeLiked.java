package likeserver.domain;

import java.util.*;
import likeserver.domain.*;
import likeserver.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LikeLiked extends AbstractEvent {

    private String topicId;
    private String userId;
    private Boolean likes;

    public LikeLiked(Like aggregate) {
        super(aggregate);
    }

    public LikeLiked() {
        super();
    }
}

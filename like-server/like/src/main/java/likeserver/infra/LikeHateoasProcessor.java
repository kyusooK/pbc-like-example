package likeserver.infra;

import likeserver.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LikeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Like>> {

    @Override
    public EntityModel<Like> process(EntityModel<Like> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/like")
                .withRel("like")
        );

        return model;
    }
}

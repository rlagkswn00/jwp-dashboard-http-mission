package nextstep.jwp.controller;

import org.apache.coyote.request.HttpRequest;
import org.apache.coyote.response.ContentType;
import org.apache.coyote.response.HttpResponse;
import org.apache.coyote.response.HttpStatus;

import java.io.IOException;

import static nextstep.util.Constant.INDEX_VIEW_PATH;


public class IndexController implements Controller {

    @Override
    public HttpResponse execute(HttpRequest httpRequest, HttpResponse httpResponse) throws IOException {
        httpResponse.setViewPath(INDEX_VIEW_PATH);
        httpResponse.setContentType(ContentType.from(INDEX_VIEW_PATH));
        httpResponse.setHttpStatus(HttpStatus.OK);
        return httpResponse.makeResponse();

    }
}
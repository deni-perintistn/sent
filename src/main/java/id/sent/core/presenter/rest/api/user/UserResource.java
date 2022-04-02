package id.sent.core.presenter.rest.api.user;

import id.sent.core.core.domain.User;
import id.sent.core.presenter.rest.api.entities.BaseResponse;
import id.sent.core.presenter.rest.api.entities.Metadata;
import id.sent.core.presenter.rest.api.entities.SignUpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/v1/users")
public interface UserResource {
    @PostMapping
    CompletableFuture<BaseResponse<User, Metadata>> signUp(@Valid @RequestBody SignUpRequest signUpRequest,
                                                           HttpServletRequest httpServletRequest);
}

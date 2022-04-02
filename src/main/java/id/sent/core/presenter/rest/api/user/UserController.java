package id.sent.core.presenter.rest.api.user;

import id.sent.core.core.domain.User;
import id.sent.core.core.usecases.UseCaseExecutor;
import id.sent.core.core.usecases.user.CreateUserUseCase;
import id.sent.core.presenter.rest.api.entities.BaseResponse;
import id.sent.core.presenter.rest.api.entities.Metadata;
import id.sent.core.presenter.rest.api.entities.SignUpRequest;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.CompletableFuture;

@Component
public class UserController implements UserResource {
    private final UseCaseExecutor useCaseExecutor;
    private final CreateUserUseCase createUserUseCase;

    public UserController(UseCaseExecutor useCaseExecutor, CreateUserUseCase createUserUseCase) {
        this.useCaseExecutor = useCaseExecutor;
        this.createUserUseCase = createUserUseCase;
    }

    @Override
    public CompletableFuture<BaseResponse<User, Metadata>> signUp(SignUpRequest signUpRequest, HttpServletRequest httpServletRequest) {
        return useCaseExecutor.execute(createUserUseCase, createUserUseCase.`)
    }
}

package id.sent.core.core.usecases.user;

import id.sent.core.core.domain.User;
import id.sent.core.core.usecases.UseCase;
import lombok.Value;

public class CreateUserUseCase extends UseCase<CreateUserUseCase.InputValues, CreateUserUseCase.OutputValues> {

    @Override
    public OutputValues execute(InputValues input) {
        return null;
    }

    @Value
    public static class InputValues implements UseCase.InputValues{
        private final String name;
        private final String email;
        private final String address;
        private final String password;
    }

    @Value
    public static class OutputValues implements UseCase.OutputValues {
        private final User user;
    }
}

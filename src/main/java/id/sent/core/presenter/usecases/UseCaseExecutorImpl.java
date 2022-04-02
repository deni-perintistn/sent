package id.sent.core.presenter.usecases;

import id.sent.core.core.usecases.UseCase;
import id.sent.core.core.usecases.UseCaseExecutor;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class UseCaseExecutorImpl implements UseCaseExecutor {
    @Override
    public <RX, I extends UseCase.InputValues, O extends UseCase.OutputValues> CompletableFuture<RX> execute(UseCase<I, O> useCase, I input, Function<O, RX> outputMapper) {
        return CompletableFuture
                .supplyAsync(() -> input)
                .thenApplyAsync(useCase::execute)
                .thenApplyAsync(outputMapper);
    }
}

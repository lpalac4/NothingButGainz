package com.morasoftware.domain.executor;

import java.util.concurrent.Executor;

/**
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * {@link } out of the UI thread.
 */
public interface ThreadExecutor extends Executor {}

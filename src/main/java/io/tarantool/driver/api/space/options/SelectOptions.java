package io.tarantool.driver.api.space.options;

import io.tarantool.driver.api.space.options.crud.OperationWithBatchSizeOptions;
import io.tarantool.driver.api.space.options.crud.OperationWithBucketIdOptions;
import io.tarantool.driver.api.space.options.crud.OperationWithFieldsOptions;
import io.tarantool.driver.api.space.options.crud.OperationWithModeOptions;
import io.tarantool.driver.api.space.options.crud.OperationWithTimeoutOptions;

/**
 * Marker interface for space select operation options
 * <p>TODO: separate proxy options and cluster options:
 * <a href="https://github.com/tarantool/cartridge-java/issues/425">issue</a></p>
 *
 * @author Artyom Dubinin
 * @author Alexey Kuzin
 */
public interface SelectOptions<T extends SelectOptions<T>>
    extends OperationWithBucketIdOptions<T>, OperationWithTimeoutOptions<T>, OperationWithFieldsOptions<T>,
    OperationWithModeOptions<T>, OperationWithBatchSizeOptions<T> {
}

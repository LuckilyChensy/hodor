package org.dromara.hodor.remoting.netty.rpc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rpc request
 *
 * @author tomgs
 * @since 2020/9/10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RpcRequest<T extends RequestBody> {

    private Header header;

    private T body;

}

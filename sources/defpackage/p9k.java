package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.backoff.BackOff;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.ipc.NoHostsToBindException;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.retry.RequestRetryComponent;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class p9k extends RequestRetryComponent {
    public final /* synthetic */ int d = 1;
    public final Logger e;

    public p9k(Logger logger) {
        super(RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest());
        this.e = logger.createLogger("PushTokenRequestRetryComponent");
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final Logger getLogger() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.e;
    }

    @Override // com.vk.push.core.retry.RequestRetryComponent
    public final boolean isRetryableError(Throwable th) {
        switch (this.d) {
            case 0:
                if (th instanceof HostIsNotMasterException) {
                    return true;
                }
                return th instanceof NoHostsToBindException;
            default:
                if (th instanceof IOException) {
                    return true;
                }
                if (th instanceof VkpnsRequestException) {
                    VkpnsRequestException vkpnsRequestException = (VkpnsRequestException) th;
                    if (vkpnsRequestException.getHttpStatusCode() == 429) {
                        return true;
                    }
                    int httpStatusCode = vkpnsRequestException.getHttpStatusCode();
                    if (500 <= httpStatusCode && httpStatusCode < 600) {
                        return true;
                    }
                }
                return false;
        }
    }

    public p9k(Logger logger, BackOff backOff) {
        super(backOff);
        this.e = logger.createLogger("IPCClientRetryComponent");
    }
}

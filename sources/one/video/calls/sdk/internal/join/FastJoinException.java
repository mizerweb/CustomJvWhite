package one.video.calls.sdk.internal.join;

import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/internal/join/FastJoinException;", "Lru/ok/android/api/core/ApiInvocationException;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FastJoinException extends ApiInvocationException {
    public final Throwable a;

    /* JADX WARN: Illegal instructions before constructor call */
    public FastJoinException(Throwable th) {
        String name = null;
        String message = th != null ? th.getMessage() : null;
        if (message != null) {
            name = message;
        } else if (th != null) {
            name = th.getClass().getName();
        }
        super(1, name);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}

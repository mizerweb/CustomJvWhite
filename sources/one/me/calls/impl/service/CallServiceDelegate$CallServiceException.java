package one.me.calls.impl.service;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"one/me/calls/impl/service/CallServiceDelegate$CallServiceException", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "calls-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallServiceDelegate$CallServiceException extends IssueKeyException {
    public /* synthetic */ CallServiceDelegate$CallServiceException(String str, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public CallServiceDelegate$CallServiceException(String str, Throwable th) {
        super("48866", str, th);
    }
}

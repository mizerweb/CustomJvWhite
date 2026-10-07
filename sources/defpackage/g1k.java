package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg1k;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "apiKeyHash", "", "cause", "<init>", "(Ljava/lang/Integer;Ljava/lang/Throwable;)V", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class g1k extends IssueKeyException {
    public g1k(Integer num, Throwable th) {
        super("ONEME-26284", qv1.j("failed to load preview; api key hash = ", num), th);
    }
}

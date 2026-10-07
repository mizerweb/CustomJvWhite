package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lso7;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "qr-scanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class so7 extends IssueKeyException {
    public /* synthetic */ so7(Throwable th, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : th);
    }

    public so7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public so7(Throwable th) {
        super("ONEME-39934", "GoogleMlKit scanner result error", th);
    }
}

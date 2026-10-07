package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqhb;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "message", "<init>", "(Ljava/lang/String;)V", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class qhb extends IssueKeyException {
    public /* synthetic */ qhb(String str, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : str);
    }

    public qhb(String str) {
        super(4, "50017", str, null);
    }

    public qhb() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

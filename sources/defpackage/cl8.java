package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcl8;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "ver", "mask", "", "cause", "<init>", "(IILjava/lang/Throwable;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class cl8 extends IssueKeyException {
    public cl8(int i, int i2, Throwable th) {
        super("ONEME-36447", s5h.y0("WARNING! Call invalidate db,\n            |isSuccess=" + (th == null) + ",\n            |ver=" + i + ",\n            |mask=" + i2 + "\n            |"), th);
    }

    public /* synthetic */ cl8(int i, int i2, Throwable th, int i3, j95 j95Var) {
        this(i, i2, (i3 & 4) != 0 ? null : th);
    }
}

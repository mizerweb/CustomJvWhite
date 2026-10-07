package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmxe;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "cause", "", "message", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "rustore"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class mxe extends IssueKeyException {
    public mxe(Throwable th, String str) {
        super("rustore", str, th);
    }
}

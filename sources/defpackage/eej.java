package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Leej;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "isCurrentQueryIdEmpty", "", "botId", "<init>", "(ZJ)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class eej extends IssueKeyException {
    public eej(boolean z, long j) {
        super("ONEME-34833", bc1.l(j, "Invalid queryId for ", ", current is empty:", z), null);
    }
}

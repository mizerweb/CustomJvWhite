package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lal8;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "isCurrentQueryIdEmpty", "", "botId", "", "hash", "<init>", "(ZJI)V", "web-app"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class al8 extends IssueKeyException {
    public al8(boolean z, long j, int i) {
        super("ONEME-30137", zo5.v(qt4.u(j, "Invalid queryId for ", ", current is empty:", z), ", hash: ", i), null);
    }
}

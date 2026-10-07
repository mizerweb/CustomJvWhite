package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liuj;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "webViewVersion", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "webview"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class iuj extends IssueKeyException {
    public iuj(String str, String str2) {
        super(4, "31599", qv1.l("Got JS exception on WebView (", str, ") with message: ", str2), null);
    }
}

package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltki;", "Lru/ok/tamtam/exception/IssueKeyException;", "Ljava/lang/NullPointerException;", "Lkotlin/NullPointerException;", "exception", "<init>", "(Ljava/lang/NullPointerException;)V", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class tki extends IssueKeyException {
    public tki(NullPointerException nullPointerException) {
        super("ONEME-35858", null, nullPointerException);
    }
}

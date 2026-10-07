package defpackage;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luki;", "Lru/ok/tamtam/exception/IssueKeyException;", "<init>", "()V", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class uki extends IssueKeyException {
    public uki() {
        super("ONEME-35858", qv1.k("Try to draw UrlDrawable on ", Thread.currentThread().getName()), null);
    }
}

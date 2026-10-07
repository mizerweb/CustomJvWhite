package one.me.android;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/android/OnNewIntentException;", "Lru/ok/tamtam/exception/IssueKeyException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnNewIntentException extends IssueKeyException {
    public /* synthetic */ OnNewIntentException(Throwable th, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : th);
    }

    public OnNewIntentException(Throwable th) {
        super(2, "30476", null, th);
    }

    public OnNewIntentException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

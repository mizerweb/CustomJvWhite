package one.me.sdk.database;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/sdk/database/DbCorruptionException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "database"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DbCorruptionException extends IssueKeyException {
    public /* synthetic */ DbCorruptionException(String str, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public DbCorruptionException(String str, Throwable th) {
        super("db_corrupt", str, th);
    }
}

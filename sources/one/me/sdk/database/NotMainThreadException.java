package one.me.sdk.database;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/database/NotMainThreadException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "database"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotMainThreadException extends IllegalStateException {
    public NotMainThreadException(boolean z, String str) {
        super("NotMainThreadException(isInTransaction=" + z + ", curThread=" + str + ")");
    }
}

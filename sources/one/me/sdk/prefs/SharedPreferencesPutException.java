package one.me.sdk.prefs;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/sdk/prefs/SharedPreferencesPutException;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "prefs"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SharedPreferencesPutException extends IssueKeyException {
    public SharedPreferencesPutException(String str, Exception exc) {
        super("shared_prefs", str, exc);
    }
}

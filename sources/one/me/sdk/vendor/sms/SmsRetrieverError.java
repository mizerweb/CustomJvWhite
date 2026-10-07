package one.me.sdk.vendor.sms;

import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lone/me/sdk/vendor/sms/SmsRetrieverError;", "Lru/ok/tamtam/exception/IssueKeyException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "google"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SmsRetrieverError extends IssueKeyException {
    public SmsRetrieverError(String str) {
        super(4, "google", str, null);
    }

    public SmsRetrieverError(String str, Throwable th) {
        super("google", str, th);
    }
}

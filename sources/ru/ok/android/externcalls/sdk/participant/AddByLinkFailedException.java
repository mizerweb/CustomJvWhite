package ru.ok.android.externcalls.sdk.participant;

import defpackage.la6;
import defpackage.ma6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "reason", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "<init>", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;)V", "getReason", "()Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "Reason", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddByLinkFailedException extends RuntimeException {
    private final Reason reason;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "LINK_OUTDATED", "WRONG_SIGNATURE", "MALFORMED_QR_URL", "QR_WRONG_PREFIX", "QR_NO_USER_ID_PARAMETER", "QR_GENERAL_ERROR", "UNKNOWN", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Reason {
        LINK_OUTDATED,
        WRONG_SIGNATURE,
        MALFORMED_QR_URL,
        QR_WRONG_PREFIX,
        QR_NO_USER_ID_PARAMETER,
        QR_GENERAL_ERROR,
        UNKNOWN;

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());

        public static la6 getEntries() {
            return $ENTRIES;
        }
    }

    public AddByLinkFailedException(String str, Reason reason) {
        super(str);
        this.reason = reason;
    }

    public final Reason getReason() {
        return this.reason;
    }
}

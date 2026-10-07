package ru.ok.tamtam.messages;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\tB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lru/ok/tamtam/messages/MessageException;", "Lru/ok/tamtam/exception/IssueKeyException;", "issueKey", "", "message", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "ZeroId", "Lru/ok/tamtam/messages/MessageException$ZeroId;", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class MessageException extends IssueKeyException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/messages/MessageException$ZeroId;", "Lru/ok/tamtam/messages/MessageException;", "<init>", "()V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ZeroId extends MessageException {
        public ZeroId() {
            super("ONEME-32661", null, null, 6, null);
        }
    }

    public /* synthetic */ MessageException(String str, String str2, Throwable th, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th, null);
    }

    private MessageException(String str, String str2, Throwable th) {
        super(str, str2, th);
    }

    public /* synthetic */ MessageException(String str, String str2, Throwable th, j95 j95Var) {
        this(str, str2, th);
    }
}

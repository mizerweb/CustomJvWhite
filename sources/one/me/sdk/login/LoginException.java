package one.me.sdk.login;

import defpackage.j95;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lone/me/sdk/login/LoginException;", "Lru/ok/tamtam/exception/IssueKeyException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "ClearCache", "InvalidUserId", "Lone/me/sdk/login/LoginException$ClearCache;", "Lone/me/sdk/login/LoginException$InvalidUserId;", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class LoginException extends IssueKeyException {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/login/LoginException$ClearCache;", "Lone/me/sdk/login/LoginException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClearCache extends LoginException {
        public ClearCache(Throwable th) {
            super(th, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/login/LoginException$InvalidUserId;", "Lone/me/sdk/login/LoginException;", "<init>", "()V", "tamtam-android-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidUserId extends LoginException {
        public InvalidUserId() {
            super(null, 0 == true ? 1 : 0);
        }
    }

    private LoginException(Throwable th) {
        super(2, "login", null, th);
    }

    public /* synthetic */ LoginException(Throwable th, j95 j95Var) {
        this(th);
    }
}

package defpackage;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx73;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "Lru/ok/tamtam/chats/ChatServerId;", ApiProtocol.PARAM_CHAT_ID, "", "cause", "<init>", "(JLjava/lang/Throwable;)V", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class x73 extends IssueKeyException {
    public x73(long j, Throwable th) {
        super("45531", zo5.j(j, "fail convert, sid="), th);
    }
}

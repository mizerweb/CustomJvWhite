package ru.ok.android.externcalls.sdk.api;

import defpackage.i3f;
import defpackage.it7;
import defpackage.nb1;
import defpackage.ps4;
import defpackage.qs4;
import defpackage.rg4;
import defpackage.v7g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/api/CallApiServiceImpl;", "Lnb1;", "Lps4;", "cidProvider", "<init>", "(Lps4;)V", "Lit7;", "reason", "Lsbi;", "hangupConversation", "(Lit7;)V", "Lps4;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "apiServiceImpl", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "getApiServiceImpl$calls_sdk", "()Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "setApiServiceImpl", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallApiServiceImpl implements nb1 {
    private OkApiServiceInternal apiServiceImpl;
    private final ps4 cidProvider;

    public CallApiServiceImpl(ps4 ps4Var) {
        this.cidProvider = ps4Var;
    }

    /* JADX INFO: renamed from: getApiServiceImpl$calls_sdk, reason: from getter */
    public final OkApiServiceInternal getApiServiceImpl() {
        return this.apiServiceImpl;
    }

    @Override // defpackage.nb1
    public void hangupConversation(it7 reason) {
        v7g v7gVarHangupConversation;
        OkApiServiceInternal okApiServiceInternal = this.apiServiceImpl;
        if (okApiServiceInternal == null || (v7gVarHangupConversation = okApiServiceInternal.hangupConversation(((qs4) this.cidProvider).b, reason, "")) == null) {
            return;
        }
        v7gVarHangupConversation.j(i3f.b()).g(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
    }

    public final void setApiServiceImpl(OkApiServiceInternal okApiServiceInternal) {
        this.apiServiceImpl = okApiServiceInternal;
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.CallApiServiceImpl$hangupConversation$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T> implements rg4 {
        public static final AnonymousClass1<T> INSTANCE = ;

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(HangupConversation.Response response) {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.CallApiServiceImpl$hangupConversation$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements rg4 {
        public static final AnonymousClass2<T> INSTANCE = ;

        @Override // defpackage.rg4, defpackage.tg4
        public final void accept(Throwable th) {
        }
    }
}

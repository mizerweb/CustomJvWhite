package ru.ok.android.externcalls.sdk.api.session;

import defpackage.j95;
import defpackage.xp;
import defpackage.yp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/api/session/InMemorySessionStore;", "Lyp;", "Lxp;", "sessionInfo", "<init>", "(Lxp;)V", "Lxp;", "getSessionInfo", "()Lxp;", "setSessionInfo", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InMemorySessionStore implements yp {
    private xp sessionInfo;

    public /* synthetic */ InMemorySessionStore(xp xpVar, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : xpVar);
    }

    @Override // defpackage.yp
    public xp getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // defpackage.yp
    public void setSessionInfo(xp xpVar) {
        this.sessionInfo = xpVar;
    }

    public InMemorySessionStore(xp xpVar) {
        this.sessionInfo = xpVar;
    }

    public InMemorySessionStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

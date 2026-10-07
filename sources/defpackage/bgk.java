package defpackage;

import com.vk.push.common.messaging.RemoteMessage;

/* JADX INFO: loaded from: classes3.dex */
public final class bgk extends nq4 {
    public hgk d;
    public RemoteMessage e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hgk g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgk(hgk hgkVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = hgkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}

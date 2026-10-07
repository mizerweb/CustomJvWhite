package defpackage;

import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public final class pii extends nq4 {
    public fd4 d;
    public URI e;
    public j9b f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ uii i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pii(uii uiiVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = uiiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.h(null, null, this);
    }
}

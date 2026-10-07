package defpackage;

import javax.net.ssl.SSLEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class iuh extends nq4 {
    public String d;
    public j9b e;
    public SSLEngine f;
    public Exception g;
    public int h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nuh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuh(nuh nuhVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = nuhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, 0, null, this);
    }
}

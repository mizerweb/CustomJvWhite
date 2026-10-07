package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wm extends nq4 {
    public List d;
    public i7e e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xm g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(xm xmVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = xmVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.p(null, null, this);
    }
}

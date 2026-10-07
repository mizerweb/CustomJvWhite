package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class y0j extends nq4 {
    public Size d;
    public hgd e;
    public g1j f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g1j h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0j(g1j g1jVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = g1jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.q(null, null, this);
    }
}

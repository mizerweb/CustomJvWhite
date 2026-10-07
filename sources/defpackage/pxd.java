package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pxd extends nq4 {
    public kle d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ txd g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxd(txd txdVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = txdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(null, this);
    }
}

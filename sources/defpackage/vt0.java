package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vt0 extends nq4 {
    public Iterator d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wt0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(wt0 wt0Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = wt0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}

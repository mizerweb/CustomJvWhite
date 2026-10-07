package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kse extends nq4 {
    public long d;
    public long e;
    public Collection f;
    public Iterator g;
    public Collection h;
    public boolean i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ose m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(ose oseVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = oseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.u(0L, 0L, null, null, false, null, this);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class nse extends nq4 {
    public long d;
    public Collection e;
    public Iterator f;
    public Collection g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ose k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nse(ose oseVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = oseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(0L, null, null, this);
    }
}

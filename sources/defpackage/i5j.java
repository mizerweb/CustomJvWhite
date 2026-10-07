package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i5j extends nq4 {
    public long d;
    public Iterator e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k5j g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5j(k5j k5jVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = k5jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.u(0L, null, this);
    }
}

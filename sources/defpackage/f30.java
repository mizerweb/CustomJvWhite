package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class f30 extends nq4 {
    public long d;
    public AtomicInteger e;
    public List f;
    public ztc g;
    public List h;
    public List i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f30(n30 n30Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = n30Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return n30.a(this.l, this);
    }
}

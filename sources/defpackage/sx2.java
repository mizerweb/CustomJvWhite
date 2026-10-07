package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sx2 extends nq4 {
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public List j;
    public c79 k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ c7k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx2(c7k c7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = c7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.s(0L, 0, 0, 0L, 0L, this);
    }
}

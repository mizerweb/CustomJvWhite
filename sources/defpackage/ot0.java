package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ot0 extends nq4 {
    public Iterator d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rt0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(rt0 rt0Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = rt0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(null, this);
    }
}

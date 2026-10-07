package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qc extends nq4 {
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public rc i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rc l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(rc rcVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = rcVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, 0L, 0L, 0, this);
    }
}

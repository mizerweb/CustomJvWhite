package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ijb extends nq4 {
    public akb d;
    public q24 e;
    public s04 f;
    public ky3 g;
    public List h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mjb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijb(mjb mjbVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = mjbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}

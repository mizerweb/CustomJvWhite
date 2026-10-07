package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s8d extends nq4 {
    public long d;
    public long e;
    public List f;
    public v3b g;
    public rt2 h;
    public Object[] i;
    public q6d j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ v8d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8d(v8d v8dVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = v8dVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.y(0L, null, null, this);
    }
}

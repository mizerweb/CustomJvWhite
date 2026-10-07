package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qed extends nq4 {
    public int d;
    public Object e;
    public List f;
    public Exception g;
    public long h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wed k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qed(wed wedVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = wedVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.t(0, null, null, this);
    }
}

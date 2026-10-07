package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class iqe extends nq4 {
    public u8b d;
    public Map e;
    public Map f;
    public Map g;
    public Map h;
    public Object[] i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lqe n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqe(lqe lqeVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = lqeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return lqe.b(this.n, null, this);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bdh extends nq4 {
    public long d;
    public boolean e;
    public List f;
    public f9b g;
    public Object h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ldh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdh(ldh ldhVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = ldhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.p(0L, false, this);
    }
}

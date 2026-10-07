package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uq8 extends nq4 {
    public long d;
    public long e;
    public List f;
    public tq8 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vq8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq8(vq8 vq8Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = vq8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objA = this.k.a(0L, 0L, null, null, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}

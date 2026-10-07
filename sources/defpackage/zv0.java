package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zv0 extends nq4 {
    public q63 d;
    public LinkedHashMap e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bw0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(bw0 bw0Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = bw0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return bw0.h(this.i, null, 0L, this);
    }
}

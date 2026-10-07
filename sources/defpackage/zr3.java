package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zr3 extends nq4 {
    public q24 d;
    public List e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ bs3 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr3(bs3 bs3Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = bs3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0L, 0L, null, this);
    }
}

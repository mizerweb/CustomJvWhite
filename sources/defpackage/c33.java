package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c33 extends nq4 {
    public long d;
    public long e;
    public int f;
    public List g;
    public /* synthetic */ Object h;
    public final /* synthetic */ f33 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c33(f33 f33Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = f33Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.q(0L, 0, 0L, this);
    }
}

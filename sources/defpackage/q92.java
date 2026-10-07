package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class q92 extends nq4 {
    public Context d;
    public String e;
    public CharSequence f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ u92 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q92(u92 u92Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = u92Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.h(null, null, 0L, null, this);
    }
}

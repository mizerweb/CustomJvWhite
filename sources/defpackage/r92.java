package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class r92 extends nq4 {
    public Context d;
    public String e;
    public CharSequence f;
    public /* synthetic */ Object g;
    public final /* synthetic */ u92 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r92(u92 u92Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = u92Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, null, null, this);
    }
}

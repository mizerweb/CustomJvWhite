package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class t92 extends nq4 {
    public Context d;
    public be1 e;
    public String f;
    public CharSequence g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ u92 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t92(u92 u92Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = u92Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(null, null, false, null, this);
    }
}

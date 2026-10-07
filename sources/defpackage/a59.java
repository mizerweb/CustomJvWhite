package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class a59 extends nq4 {
    public njd d;
    public Uri e;
    public String f;
    public Object g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c59 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a59(c59 c59Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = c59Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(null, null, 0L, null, this);
    }
}

package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class x49 extends nq4 {
    public njd d;
    public Uri e;
    public u69 f;
    public Object g;
    public Throwable h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c59 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x49(c59 c59Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = c59Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return c59.a(this.k, null, null, this);
    }
}

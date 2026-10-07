package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class b59 extends nq4 {
    public njd d;
    public Uri e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ c59 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b59(c59 c59Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = c59Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.n(null, null, 0L, 0L, this);
    }
}

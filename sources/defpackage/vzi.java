package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class vzi extends nq4 {
    public Uri d;
    public Object e;
    public l9b f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xzi i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzi(xzi xziVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = xziVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.f(null, 0L, null, this);
    }
}

package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class to7 extends nq4 {
    public Uri d;
    public op0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vo7 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to7(vo7 vo7Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = vo7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}

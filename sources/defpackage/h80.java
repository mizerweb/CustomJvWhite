package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class h80 extends nq4 {
    public Uri d;
    public String e;
    public String f;
    public va0 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ m80 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(m80 m80Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = m80Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0L, null, null, null, null, null, null, this);
    }
}

package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class jb8 extends nq4 {
    public Uri d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rb8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb8(rb8 rb8Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = rb8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}

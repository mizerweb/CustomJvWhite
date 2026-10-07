package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class cfb extends nq4 {
    public LinkedHashSet d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kfb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(kfb kfbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = kfbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}

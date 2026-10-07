package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class uq5 extends nq4 {
    public File d;
    public /* synthetic */ Object e;
    public final /* synthetic */ er5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq5(er5 er5Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = er5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.g(null, this);
    }
}

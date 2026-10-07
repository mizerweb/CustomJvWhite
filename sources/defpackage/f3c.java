package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class f3c extends nq4 {
    public File d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i3c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objR = this.f.r(null, null, null, null, this);
        return objR == hu4.a ? objR : new roe(objR);
    }
}

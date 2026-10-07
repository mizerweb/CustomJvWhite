package defpackage;

import java.nio.file.Path;

/* JADX INFO: loaded from: classes3.dex */
public final class y3c extends nq4 {
    public Path d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a4c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3c(a4c a4cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = a4cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}

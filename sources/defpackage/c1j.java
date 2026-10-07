package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class c1j extends nq4 {
    public yce d;
    public File e;
    public /* synthetic */ Object f;
    public final /* synthetic */ g1j g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1j(g1j g1jVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = g1jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}

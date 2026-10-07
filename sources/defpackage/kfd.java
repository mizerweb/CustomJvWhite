package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class kfd extends nq4 {
    public d3h d;
    public f3h e;
    public cf7 f;
    public qx6 g;
    public e3h h;
    public Object i;
    public File j;
    public sfe k;
    public /* synthetic */ Object l;
    public final /* synthetic */ lfd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(lfd lfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = lfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, null, this);
    }
}

package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ww4 extends nq4 {
    public File d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xw4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww4(xw4 xw4Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = xw4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, null, this);
    }
}

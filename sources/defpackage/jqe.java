package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class jqe extends nq4 {
    public File[] d;
    public /* synthetic */ Object e;
    public final /* synthetic */ lqe f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqe(lqe lqeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = lqeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return lqe.c(this.f, this);
    }
}

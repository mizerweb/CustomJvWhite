package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class e3c extends nq4 {
    public String d;
    public o18 e;
    public File f;
    public File g;
    public String h;
    public String i;
    public dle j;
    public y2c k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i3c n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3c(i3c i3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.n = i3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(null, null, null, null, false, null, null, this);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vfa extends nq4 {
    public boolean d;
    public List e;
    public mg5 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wfa h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfa(wfa wfaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = wfaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(false, null, null, this);
    }
}

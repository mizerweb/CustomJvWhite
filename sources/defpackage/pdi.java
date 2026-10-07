package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class pdi extends nq4 {
    public long d;
    public Set e;
    public l9b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ vdi h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdi(vdi vdiVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = vdiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return vdi.a(this.h, 0L, null, this);
    }
}

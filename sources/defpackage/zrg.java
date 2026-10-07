package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zrg extends nq4 {
    public List d;
    public u8b e;
    public l9b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ asg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrg(asg asgVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = asgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.u(null, null, this);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hm2 extends nq4 {
    public int d;
    public pm2 e;
    public List f;
    public rl2 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ pm2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.n(null, 0, null, this);
    }
}

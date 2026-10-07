package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cm2 extends nq4 {
    public List d;
    public rl2 e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ pm2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.j(null, 0, 0, 0, null, this);
    }
}

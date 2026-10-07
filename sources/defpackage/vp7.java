package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vp7 extends nq4 {
    public List d;
    public pp7 e;
    public ufe f;
    public List g;
    public pp7 h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xp7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp7(xp7 xp7Var, lq4 lq4Var) {
        super(lq4Var);
        this.l = xp7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.E(null, 0, null, this);
    }
}

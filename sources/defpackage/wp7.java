package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wp7 extends nq4 {
    public List d;
    public pp7 e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ xp7 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp7(xp7 xp7Var, lq4 lq4Var) {
        super(lq4Var);
        this.i = xp7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.I(null, this);
    }
}

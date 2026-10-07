package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oob extends nq4 {
    public nob d;
    public pw e;
    public ArrayList f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rob h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oob(rob robVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = robVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}

package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qt0 extends nq4 {
    public String d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rt0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(rt0 rt0Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = rt0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return rt0.h(this.g, null, null, this);
    }
}

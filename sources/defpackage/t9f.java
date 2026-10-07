package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class t9f extends nq4 {
    public String d;
    public ArrayList e;
    public Object f;
    public m8b g;
    public ArrayList h;
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u9f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9f(u9f u9fVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = u9fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}

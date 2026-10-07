package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class v9f extends nq4 {
    public String d;
    public m8b e;
    public ArrayList f;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ x9f i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9f(x9f x9fVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = x9fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, null, this);
    }
}

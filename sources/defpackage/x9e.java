package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class x9e extends nq4 {
    public aae d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ aae g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9e(aae aaeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = aaeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return aae.b(this.g, null, this);
    }
}

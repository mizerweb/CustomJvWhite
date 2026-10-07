package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w9f extends nq4 {
    public ArrayList d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x9f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9f(x9f x9fVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = x9fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}

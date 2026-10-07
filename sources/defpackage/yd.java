package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yd extends nq4 {
    public ArrayList d;
    public /* synthetic */ Object e;
    public final /* synthetic */ be f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(be beVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = beVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}

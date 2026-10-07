package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class h7i extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ o44 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7i(o44 o44Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = o44Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Serializable serializableE = this.e.e(null, null, this);
        return serializableE == hu4.a ? serializableE : new roe(serializableE);
    }
}

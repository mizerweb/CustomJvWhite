package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class v5b extends nq4 {
    public Set d;
    public f9b e;
    public Set f;
    public List g;
    public /* synthetic */ Object h;
    public final /* synthetic */ x5b i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5b(x5b x5bVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = x5bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return x5b.a(this.i, null, this);
    }
}

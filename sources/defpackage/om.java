package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class om extends nq4 {
    public ArrayList d;
    public ArrayList e;
    public Map f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xm h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(xm xmVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = xmVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return xm.b(this.h, null, this);
    }
}

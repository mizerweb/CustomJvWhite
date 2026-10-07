package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class nm extends nq4 {
    public Map d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xm g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(xm xmVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = xmVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return xm.a(this.g, null, this);
    }
}

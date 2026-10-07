package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tua extends nq4 {
    public long d;
    public long e;
    public g4b f;
    public Iterator g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ uua j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tua(uua uuaVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = uuaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, null, null, this);
    }
}

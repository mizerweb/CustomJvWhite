package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gfa extends nq4 {
    public long d;
    public l8b e;
    public List f;
    public ArrayList g;
    public /* synthetic */ Object h;
    public final /* synthetic */ hfa i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfa(hfa hfaVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = hfaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, null, this);
    }
}

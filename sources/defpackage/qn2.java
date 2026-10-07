package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qn2 extends nq4 {
    public Context d;
    public mn2 e;
    public wfe f;
    public wfe g;
    public wfe h;
    public wfe i;
    public Iterator j;
    public ln2 k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ un2 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn2(un2 un2Var, nq4 nq4Var) {
        super(nq4Var);
        this.o = un2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, null, this);
    }
}

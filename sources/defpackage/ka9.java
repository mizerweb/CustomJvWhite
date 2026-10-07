package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ka9 extends nq4 {
    public List d;
    public LinkedHashMap e;
    public Iterator f;
    public rt2 g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ na9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka9(na9 na9Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = na9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.p(null, this);
    }
}

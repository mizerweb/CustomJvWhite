package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uei extends nq4 {
    public List d;
    public qf7 e;
    public tf7 f;
    public Map g;
    public Map h;
    public Iterator i;
    public Long j;
    public rtc k;
    public String l;
    public String m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vei p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uei(vei veiVar, nq4 nq4Var) {
        super(nq4Var);
        this.p = veiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, null, null, null, this);
    }
}

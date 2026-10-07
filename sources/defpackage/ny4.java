package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ny4 extends nq4 {
    public List d;
    public Map e;
    public vy2 f;
    public r17 g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sy4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return sy4.e(this.k, null, this);
    }
}

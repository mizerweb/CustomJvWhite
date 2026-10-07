package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zta extends nq4 {
    public Map d;
    public long[] e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ hua o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zta(hua huaVar, nq4 nq4Var) {
        super(nq4Var);
        this.o = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return hua.a(this.o, null, this);
    }
}

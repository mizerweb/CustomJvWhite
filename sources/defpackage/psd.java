package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class psd extends nq4 {
    public vg4 d;
    public rt2 e;
    public xmd f;
    public zmd g;
    public Long h;
    public List i;
    public List j;
    public qfd k;
    public Object l;
    public String m;
    public int n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ ssd q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psd(ssd ssdVar, nq4 nq4Var) {
        super(nq4Var);
        this.q = ssdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(null, null, null, null, null, this);
    }
}

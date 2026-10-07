package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rgk extends nq4 {
    public hgk d;
    public Object e;
    public Object f;
    public List g;
    public /* synthetic */ Object h;
    public final /* synthetic */ hgk i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgk(hgk hgkVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = hgkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return hgk.a(this.i, null, this);
    }
}

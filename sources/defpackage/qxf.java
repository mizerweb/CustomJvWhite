package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class qxf extends nq4 {
    public ShareData d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rxf f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(rxf rxfVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = rxfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}

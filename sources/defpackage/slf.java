package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class slf extends ilf {
    public final String l;
    public final boolean m;
    public final List n;

    public slf(mlf mlfVar) {
        super(mlfVar);
        this.l = mlfVar.i;
        this.m = mlfVar.j;
        this.n = (List) mlfVar.k;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        rfa rfaVar = new rfa();
        rfaVar.g = this.l;
        rfaVar.u = this.m;
        rfaVar.b(Collections.unmodifiableList(this.n));
        return rfaVar;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendTextMessage";
    }
}

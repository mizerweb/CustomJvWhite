package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class eda implements ohf {
    public final sw a;
    public final sw b;

    public eda(sw swVar, sw swVar2, wf0 wf0Var) {
        this.a = swVar;
        this.b = swVar2;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        return new dda(this);
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class abg implements ohf {
    public final /* synthetic */ sw a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public abg(sw swVar, int i, int i2) {
        this.a = swVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        Iterator it = ((Iterable) this.a.b).iterator();
        if (!it.hasNext()) {
            return q66.a;
        }
        thf thfVar = new thf();
        zag zagVar = new zag(this.b, this.c, it, thfVar);
        zagVar.h = thfVar;
        thfVar.d = zagVar;
        return thfVar;
    }
}

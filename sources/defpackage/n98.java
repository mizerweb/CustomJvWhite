package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n98 extends pci {
    public int b;
    public Object c;
    public final /* synthetic */ Iterator d;

    public n98(pci pciVar) {
        super(0);
        this.d = pciVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0 || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b <= 0) {
            xpb xpbVar = (xpb) this.d.next();
            this.c = xpbVar.a;
            this.b = xpbVar.a();
        }
        this.b--;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}

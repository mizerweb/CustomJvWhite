package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l98 extends pci {
    public final pci b;
    public Object c;
    public pci d;

    public l98(d98 d98Var) {
        super(0);
        this.b = d98Var.e.entrySet().iterator();
        this.c = null;
        this.d = wn8.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext() || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            this.d = ((s88) entry.getValue()).iterator();
        }
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return new u88(obj, this.d.next());
    }
}

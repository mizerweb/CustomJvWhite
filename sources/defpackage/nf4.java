package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class nf4 implements ohf {
    public final AtomicReference a;

    public nf4(ohf ohfVar) {
        this.a = new AtomicReference(ohfVar);
    }

    @Override // defpackage.ohf
    public final Iterator iterator() {
        ohf ohfVar = (ohf) this.a.getAndSet(null);
        if (ohfVar != null) {
            return ohfVar.iterator();
        }
        ore.k("This sequence can be consumed only once.");
        return null;
    }
}

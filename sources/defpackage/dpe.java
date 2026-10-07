package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dpe implements oah {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public oah b = null;

    public final void a(oah oahVar) {
        this.b = oahVar;
        for (cpe cpeVar : this.a) {
            if (!cpeVar.d()) {
                cpeVar.o(oahVar);
            }
        }
    }

    @Override // defpackage.oah
    public final Object get() {
        cpe cpeVar = new cpe();
        cpeVar.h = null;
        cpeVar.o(this.b);
        this.a.add(cpeVar);
        return cpeVar;
    }
}

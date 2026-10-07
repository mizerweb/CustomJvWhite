package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class tw3 extends sw3 {
    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((Collection) obj).size();
    }
}

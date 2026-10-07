package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class szj {
    public final rre a;
    public final ezj b = new ezj(2);

    public szj(rre rreVar) {
        this.a = rreVar;
    }

    public final void a(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ch3.G(this.a, false, true, new ol(this, 28, new rzj((String) it.next(), str)));
        }
    }
}

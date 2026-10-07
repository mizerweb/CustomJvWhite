package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dj9 {
    public Set a;

    public final void a() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cj9) it.next()).e();
        }
    }

    public final void b() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cj9) it.next()).f();
        }
    }
}

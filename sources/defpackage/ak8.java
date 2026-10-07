package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class ak8 implements zj8 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.zj8
    public final void a(String str, boolean z) {
        str.getClass();
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((zj8) it.next()).a(str, z);
        }
    }
}

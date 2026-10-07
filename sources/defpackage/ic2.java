package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ic2 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(String str, int i, boolean z) {
        iaj iajVar;
        synchronized (this.a) {
            iajVar = (iaj) this.b.get(new ef2(str));
        }
        if (iajVar == null) {
            return;
        }
        iajVar.b.a(new cq7(i, z));
    }
}

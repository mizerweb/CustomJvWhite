package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class pc8 {
    public final boolean a;
    public final CidLogger b;
    public final fi9 c = new fi9();
    public final fi9 d = new fi9();
    public final fi9 e = new fi9();
    public final fi9 f = new fi9();
    public final fi9 g = new fi9();
    public final HashMap h = new HashMap();
    public final fi9 i = new fi9();
    public final fi9 j = new fi9();
    public final fi9 k = new fi9();
    public final fi9 l = new fi9();
    public final ex8 m = new ex8(29);

    public pc8(CidLogger cidLogger, boolean z) {
        this.a = z;
        this.b = cidLogger;
    }

    public static long a(ArrayList arrayList, cf7 cf7Var) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l = (Long) cf7Var.invoke((dgg) obj);
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (((Number) obj2).longValue() != -1) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = arrayList3.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public final void b() {
        this.c.a = null;
        this.d.a = null;
        this.e.a = null;
        this.f.a = null;
        this.g.a = null;
        this.i.a = null;
        this.j.a = null;
        this.l.a = null;
        this.k.a = null;
        if (this.a) {
            return;
        }
        this.h.clear();
    }
}

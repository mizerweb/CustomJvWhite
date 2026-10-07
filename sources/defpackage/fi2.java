package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fi2 {
    public static final g40 d = gvk.b(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final ei2 a(Surface surface) {
        ei2 ei2Var;
        List listT1;
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.a) {
            try {
                ei2Var = new ei2(this, surface);
                Integer num = (Integer) this.b.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.b.put(surface, Integer.valueOf(iIntValue));
                listT1 = iIntValue == 1 ? ww3.T1(this.c) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (listT1 != null) {
            Iterator it = listT1.iterator();
            while (it.hasNext()) {
                ((nmi) it.next()).d(surface);
            }
        }
        return ei2Var;
    }
}

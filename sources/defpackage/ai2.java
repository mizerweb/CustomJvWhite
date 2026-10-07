package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ai2 {
    public final List a;

    public ai2(List list) {
        this.a = list;
        xjc xjcVar = (xjc) ww3.r1(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((xjc) it.next()).b != xjcVar.b) {
                ore.k("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return qv1.n(", imageSourceConfig=null)", new StringBuilder("CameraStream.Config(outputs="), this.a);
    }
}

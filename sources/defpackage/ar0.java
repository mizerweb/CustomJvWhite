package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ar0 implements yc6 {
    @Override // defpackage.yc6
    public final lrc a(qrc qrcVar, String str, b9b b9bVar, List list, lrc lrcVar) {
        if (lrcVar == null) {
            Iterator it = b().iterator();
            while (it.hasNext()) {
                if (!b9bVar.b((String) it.next())) {
                    return mrc.LACK_REQUIRED_PROPS;
                }
            }
        }
        return (lrcVar != null || c(b9bVar, ww3.l1(list, 1))) ? lrcVar : mrc.LACK_SPAN_COUNT;
    }

    public List b() {
        return r66.a;
    }

    public abstract boolean c(b9b b9bVar, List list);
}

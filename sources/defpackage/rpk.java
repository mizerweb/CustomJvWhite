package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rpk {
    public static final Object a = new Object();

    public static mw a(List list) {
        mw mwVar = new mw(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mwVar.put((Long) it.next(), 0L);
        }
        return mwVar;
    }
}

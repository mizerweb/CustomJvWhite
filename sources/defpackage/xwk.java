package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class xwk {
    public static void a(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}

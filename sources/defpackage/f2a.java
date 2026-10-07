package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface f2a {
    default e88 h(k2a k2aVar, i2a i2aVar) {
        return new e88(new UnsupportedOperationException());
    }

    default e89 l(k2a k2aVar, i2a i2aVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ry9) it.next()).b == null) {
                return new e88(new UnsupportedOperationException());
            }
        }
        return rx8.J(list);
    }
}

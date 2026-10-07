package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class og0 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return list.equals(list);
    }

    public final int hashCode() {
        return Collections.EMPTY_LIST.hashCode() ^ 1000003;
    }

    public final String toString() {
        return qv1.n("}", new StringBuilder("ArrayBasedTraceState{entries="), Collections.EMPTY_LIST);
    }
}

package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bzf {
    public final tnh a;
    public final List b;

    public bzf(tnh tnhVar, List list) {
        this.a = tnhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzf)) {
            return false;
        }
        bzf bzfVar = (bzf) obj;
        return this.a.equals(bzfVar.a) && this.b.equals(bzfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + zo5.c(this.a.c, Integer.hashCode(R.drawable.ic_shield_24) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareScreenRequestBottomSheet(icon=");
        sb.append(R.drawable.ic_shield_24);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", buttons=");
        return qv1.n(")", sb, this.b);
    }
}

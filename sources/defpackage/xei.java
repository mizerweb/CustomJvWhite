package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xei implements pve {
    public final ArrayList a;
    public final boolean b;

    public xei(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    @Override // defpackage.pve
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xei.class != obj.getClass()) {
            return false;
        }
        xei xeiVar = (xei) obj;
        return this.b == xeiVar.b && this.a.equals(xeiVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateDisplayLayoutV2Command{layouts=");
        sb.append(this.a);
        sb.append(", isSnapshot=");
        return c0a.p(sb, this.b, '}');
    }
}

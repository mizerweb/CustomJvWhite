package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qya {
    public final Set a;
    public final Map b;

    public qya(Set set, Map map) {
        this.a = set;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qya)) {
            return false;
        }
        qya qyaVar = (qya) obj;
        return cqk.d(this.a, qyaVar.a) && cqk.d(this.b, qyaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ValidatedData(dynamicRanges=" + this.a + ", qualityToSizeMap=" + this.b + ')';
    }

    public /* synthetic */ qya() {
        this(c76.a, s66.a);
    }
}

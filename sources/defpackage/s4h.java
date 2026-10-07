package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s4h {
    public final Map a;
    public final int b;

    public s4h(int i, Map map) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4h)) {
            return false;
        }
        s4h s4hVar = (s4h) obj;
        return cqk.d(this.a, s4hVar.a) && this.b == s4hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return qt4.p(sb, this.b, ')');
    }
}

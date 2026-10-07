package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z1j extends a2j {
    public final List a;
    public final rui b;
    public final boolean c;

    public z1j(List list, rui ruiVar, boolean z) {
        this.a = list;
        this.b = ruiVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1j)) {
            return false;
        }
        z1j z1jVar = (z1j) obj;
        return cqk.d(this.a, z1jVar.a) && cqk.d(this.b, z1jVar.b) && this.c == z1jVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rui ruiVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (ruiVar == null ? 0 : ruiVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pause(videoUris=");
        sb.append(this.a);
        sb.append(", videoContent=");
        sb.append(this.b);
        sb.append(", isFirstFrameRendered=");
        return qt4.r(sb, this.c, ")");
    }
}

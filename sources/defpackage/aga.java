package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aga implements Serializable {
    public static final zfa g = new zfa();
    public final long a;
    public final String b;
    public final ega c;
    public final short d;
    public final short e;
    public final Map f;

    public aga(long j, String str, ega egaVar, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = egaVar;
        this.d = s;
        this.e = s2;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aga)) {
            return false;
        }
        aga agaVar = (aga) obj;
        return this.a == agaVar.a && cqk.d(this.b, agaVar.b) && this.c == agaVar.c && this.d == agaVar.d && this.e == agaVar.e && cqk.d(this.f, agaVar.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (Short.hashCode(this.e) + ((Short.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.f;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "MessageElement(entityId=", ", entityName=", this.b);
        sbT.append(", type=");
        sbT.append(this.c);
        sbT.append(", from=");
        sbT.append((int) this.d);
        sbT.append(", length=");
        sbT.append((int) this.e);
        sbT.append(", attributes=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}

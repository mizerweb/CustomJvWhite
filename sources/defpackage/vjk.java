package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vjk {
    public final String a;
    public final String b;
    public final Map c;

    public vjk(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjk)) {
            return false;
        }
        vjk vjkVar = (vjk) obj;
        return this.a.equals(vjkVar.a) && this.b.equals(vjkVar.b) && this.c.equals(vjkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MigrationDtoVer1(uuid=" + ((Object) ("MetricsEventUuid(value=" + this.a + ')')) + ", eventName=" + this.b + ", eventData=" + this.c + ')';
    }
}

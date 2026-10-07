package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xki extends e48 {
    public final String b;
    public final String c;

    public xki(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xki.class != obj.getClass()) {
            return false;
        }
        xki xkiVar = (xki) obj;
        return this.a.equals(xkiVar.a) && Objects.equals(this.b, xkiVar.b) && this.c.equals(xkiVar.c);
    }

    public final int hashCode() {
        int iD = zo5.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}

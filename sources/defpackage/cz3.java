package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cz3 extends e48 {
    public final String b;
    public final String c;
    public final String d;

    public cz3(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cz3.class != obj.getClass()) {
            return false;
        }
        cz3 cz3Var = (cz3) obj;
        return this.c.equals(cz3Var.c) && this.b.equals(cz3Var.b) && Objects.equals(this.d, cz3Var.d);
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}

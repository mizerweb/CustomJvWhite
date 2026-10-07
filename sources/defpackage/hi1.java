package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class hi1 {
    public final String a;
    public final int b;
    public final int c;

    public hi1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hi1.class != obj.getClass()) {
            return false;
        }
        hi1 hi1Var = (hi1) obj;
        return this.a.equals(hi1Var.a) && this.b == hi1Var.b && this.c == hi1Var.c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.c);
        return Objects.hash(this.a, qt4.b(this.b), numValueOf);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        int i = this.b;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "ANONYM";
        } else {
            str = "VK";
        }
        sb.append(str);
        sb.append(", deviceIndex=");
        return qt4.p(sb, this.c, '}');
    }
}

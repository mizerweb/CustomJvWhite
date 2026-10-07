package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hi5 {
    public final String a;
    public final String b;
    public final String c;

    public hi5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hi5.class == obj.getClass()) {
            hi5 hi5Var = (hi5) obj;
            if (Objects.equals(this.a, hi5Var.a) && Objects.equals(this.b, hi5Var.b) && Objects.equals(this.c, hi5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}

package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lek {
    public String a;
    public String b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lek.class == obj.getClass()) {
            lek lekVar = (lek) obj;
            if (this.c == lekVar.c && Objects.equals(this.a, lekVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}

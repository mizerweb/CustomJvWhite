package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ws0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ws0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws0)) {
            return false;
        }
        ws0 ws0Var = (ws0) obj;
        return this.c == ws0Var.c && this.d == ws0Var.d && Objects.equals(this.a, ws0Var.a) && Objects.equals(this.b, ws0Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}

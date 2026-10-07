package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class kx7 {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public kx7(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        lvb.b0(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx7)) {
            return false;
        }
        kx7 kx7Var = (kx7) obj;
        return this.b == kx7Var.b && Double.compare(this.c, kx7Var.c) == 0 && Objects.equals(this.a, kx7Var.a) && Objects.equals(this.d, kx7Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public kx7(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }
}

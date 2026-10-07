package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nul {
    public final String a;
    public final String b;
    public final boolean c;

    public nul(String str, String str2, boolean z) {
        yab.p(str);
        this.a = str;
        yab.p(str2);
        this.b = str2;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nul)) {
            return false;
        }
        nul nulVar = (nul) obj;
        return f55.h(this.a, nulVar.a) && f55.h(this.b, nulVar.b) && f55.h(null, null) && this.c == nulVar.c && f55.h(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c), null});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        yab.s(null);
        throw null;
    }
}

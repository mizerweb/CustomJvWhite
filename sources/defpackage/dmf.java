package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dmf implements Serializable {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public dmf(long j, String str, String str2, String str3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "Session{=", ", current=", this.e);
        sbU.append("}");
        return sbU.toString();
    }
}

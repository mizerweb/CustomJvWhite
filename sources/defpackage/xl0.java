package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class xl0 implements Serializable {
    public final long a;
    public final String b;
    public final String c;

    public xl0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        return qt4.q(qt4.t(this.a, "Background{id=", ", url=", this.b), ", color=", this.c, "}");
    }
}

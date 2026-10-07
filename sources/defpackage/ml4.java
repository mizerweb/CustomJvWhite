package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ml4 implements Serializable {
    public final String a;
    public final String b;

    public ml4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return nbh.w("ContactNameWrapper{name=", this.a, ", lastName=", this.b, "}");
    }
}

package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class jr7 implements Serializable {
    public static final jr7 b = new jr7(false);
    public final boolean a;

    public jr7(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jr7) && this.a == ((jr7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("GroupOptions(isPremium=", ")", this.a);
    }
}

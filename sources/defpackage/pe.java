package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pe {
    public static final List b = xw3.P0(new pe(0), new pe(1), new pe(2), new pe(3), new pe(4), new pe(5));
    public final int a;

    public /* synthetic */ pe(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pe) {
            return this.a == ((pe) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("AfMode(value=", this.a, ')');
    }
}

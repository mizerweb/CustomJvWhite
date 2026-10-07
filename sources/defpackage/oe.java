package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oe {
    public static final List b = xw3.P0(new oe(0), new oe(1), new oe(2), new oe(3), new oe(4), new oe(5), new oe(6));
    public final int a;

    public /* synthetic */ oe(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oe) {
            return this.a == ((oe) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("AeMode(value=", this.a, ')');
    }
}

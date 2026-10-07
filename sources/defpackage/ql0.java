package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ql0 {
    public static final List b = xw3.P0(new ql0(0), new ql0(1), new ql0(6), new ql0(5), new ql0(2), new ql0(3), new ql0(8), new ql0(7));
    public final int a;

    public /* synthetic */ ql0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ql0) {
            return this.a == ((ql0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("AwbMode(value=", this.a, ')');
    }
}

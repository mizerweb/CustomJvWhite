package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m27 implements n27 {
    public final ArrayList a;
    public final boolean b;

    public m27(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m27)) {
            return false;
        }
        m27 m27Var = (m27) obj;
        return this.a.equals(m27Var.a) && this.b == m27Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPicker(includes=" + this.a + ", filtersEnabled=" + this.b + ")";
    }
}

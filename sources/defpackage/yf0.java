package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class yf0 implements zf0 {
    public final Set a;
    public final ArrayList b;

    public yf0(Set set, ArrayList arrayList) {
        this.a = set;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf0)) {
            return false;
        }
        yf0 yf0Var = (yf0) obj;
        return cqk.d(this.a, yf0Var.a) && this.b.equals(yf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessagesVisible(messageServerIds=" + this.a + ", settings=" + this.b + ")";
    }
}

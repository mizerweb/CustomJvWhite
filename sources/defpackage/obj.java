package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class obj extends h21 {
    public final ArrayList b;

    public obj(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obj) && this.b.equals(((obj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Sent(values=" + this.b + ')';
    }
}

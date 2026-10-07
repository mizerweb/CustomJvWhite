package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dja implements Serializable {
    public final ija a;
    public final String b;

    public dja(ija ijaVar, String str) {
        this.a = ijaVar;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ija b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dja)) {
            return false;
        }
        dja djaVar = (dja) obj;
        return this.a == djaVar.a && cqk.d(this.b, djaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.b;
    }
}

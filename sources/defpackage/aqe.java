package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aqe implements dqe {
    public final String a;

    public aqe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqe) && cqk.d(this.a, ((aqe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv1.k("custom_", this.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c7d implements d7d {
    public final boolean a;

    public c7d(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7d) && this.a == ((c7d) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("RadioButton(isChecked=", ")", this.a);
    }
}

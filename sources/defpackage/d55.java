package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d55 extends rql {
    public final boolean a;

    public d55(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d55) && this.a == ((d55) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Switch(isToggled=", ")", this.a);
    }
}

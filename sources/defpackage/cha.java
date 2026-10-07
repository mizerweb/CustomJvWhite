package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cha implements dha {
    public final boolean a;

    public cha(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cha) && this.a == ((cha) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("StoriesReact(isActive=", ")", this.a);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iha implements nha {
    public final dha a;

    public iha(dha dhaVar) {
        this.a = dhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iha) && this.a.equals(((iha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Alternate(iconType=" + this.a + ")";
    }
}

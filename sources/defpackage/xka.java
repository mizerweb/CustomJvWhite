package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xka extends ala {
    public final eha a;

    public xka(eha ehaVar) {
        this.a = ehaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xka) && this.a == ((xka) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewInputState(expandableState=" + this.a + ")";
    }
}

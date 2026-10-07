package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zka extends ala {
    public final yka a;

    public zka(yka ykaVar) {
        this.a = ykaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zka) && this.a == ((zka) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToggleEmoji(state=" + this.a + ")";
    }
}

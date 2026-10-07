package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i90 extends j90 {
    public final tnh a;

    public i90(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final ynh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i90) && this.a.equals(((i90) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return x05.g("ShowTooltipEvent(textSource=", this.a, ")");
    }
}

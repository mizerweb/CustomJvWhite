package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class grg implements irg {
    public final tnh a;
    public final vud b;

    public grg(tnh tnhVar, vud vudVar) {
        this.a = tnhVar;
        this.b = vudVar;
    }

    public final ynh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof grg) {
            grg grgVar = (grg) obj;
            return this.a.equals(grgVar.a) && this.b == grgVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowHideStoriesSnackbar(title=" + this.a + ", onDismiss=" + this.b + ")";
    }
}

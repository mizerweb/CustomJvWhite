package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p3g {
    public final tnh a;

    public p3g(tnh tnhVar) {
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p3g) && this.a.equals(((p3g) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.icon_warning) + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + R.drawable.icon_warning + ")";
    }
}

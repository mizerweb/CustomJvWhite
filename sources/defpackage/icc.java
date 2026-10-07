package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class icc implements lcc {
    public final boolean a;
    public final ol0 b;

    public icc(boolean z, ol0 ol0Var) {
        this.a = z;
        this.b = ol0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icc) && this.a == ((icc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Integer.hashCode(R.drawable.icon_edit) * 31);
    }
}

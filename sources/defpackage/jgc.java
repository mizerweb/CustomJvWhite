package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jgc extends mk0 {
    public final tnh b;

    public jgc(tnh tnhVar) {
        super(10);
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgc) && this.b.equals(((jgc) obj).b);
    }

    public final int hashCode() {
        return zo5.c(R.drawable.icon_link_brake, Integer.hashCode(this.b.c) * 31, 31);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + R.drawable.icon_link_brake + ", description=null)";
    }
}

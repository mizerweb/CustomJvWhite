package defpackage;

import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class aej implements cej {
    public final tnh a;
    public final ynh b;
    public final List c;

    public aej(tnh tnhVar, ynh ynhVar, List list) {
        this.a = tnhVar;
        this.b = ynhVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aej)) {
            return false;
        }
        aej aejVar = (aej) obj;
        return this.a.equals(aejVar.a) && this.b.equals(aejVar.b) && this.c.equals(aejVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bc1.h(zo5.c(this.a.c, Integer.hashCode(R.drawable.icon_done_rectangle) * 31, 31), 31, this.b);
    }

    public final String toString() {
        return "RequestBiometryAccess(icon=" + R.drawable.icon_done_rectangle + ", title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ")";
    }
}

package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hrd implements krd {
    public final ynh a;
    public final ynh b;
    public final List c;
    public final Bundle d;

    public hrd(ynh ynhVar, ynh ynhVar2, List list, Bundle bundle) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrd)) {
            return false;
        }
        hrd hrdVar = (hrd) obj;
        return this.a.equals(hrdVar.a) && cqk.d(this.b, hrdVar.b) && this.c.equals(hrdVar.c) && this.d.equals(hrdVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        return this.d.hashCode() + qv1.c((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}

package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jud extends qud {
    public final ynh a;
    public final ynh b;
    public final List c;
    public final Bundle d;

    public jud(ynh ynhVar, ynh ynhVar2, List list, Bundle bundle) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jud)) {
            return false;
        }
        jud judVar = (jud) obj;
        return cqk.d(this.a, judVar.a) && cqk.d(this.b, judVar.b) && cqk.d(this.c, judVar.c) && cqk.d(this.d, judVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        int iC = qv1.c((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31, 31, this.c);
        Bundle bundle = this.d;
        return iC + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}

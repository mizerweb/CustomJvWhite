package defpackage;

import android.os.Bundle;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class k2g implements vpa {
    public final float a;
    public final float b;
    public final Bundle c;
    public final xnh d;
    public final Collection e;

    public k2g(float f, float f2, xnh xnhVar, Bundle bundle, Collection collection) {
        this.a = f;
        this.b = f2;
        this.c = bundle;
        this.d = xnhVar;
        this.e = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2g)) {
            return false;
        }
        k2g k2gVar = (k2g) obj;
        return Float.compare(this.a, k2gVar.a) == 0 && Float.compare(this.b, k2gVar.b) == 0 && this.c.equals(k2gVar.c) && this.d.equals(k2gVar.d) && this.e.equals(k2gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + nbh.m(Float.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = bc1.n("ShowLinkContextMenu(x=", this.a, ", y=", this.b, ", payload=");
        sbN.append(this.c);
        sbN.append(", headerTitle=");
        sbN.append(this.d);
        sbN.append(", actions=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}

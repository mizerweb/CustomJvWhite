package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iqi extends oqi {
    public final boolean a;
    public final tnh b;
    public final vnh c;
    public final List d;

    public iqi(boolean z, tnh tnhVar, vnh vnhVar, List list) {
        this.a = z;
        this.b = tnhVar;
        this.c = vnhVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqi)) {
            return false;
        }
        iqi iqiVar = (iqi) obj;
        return this.a == iqiVar.a && this.b.equals(iqiVar.b) && this.c.equals(iqiVar.c) && this.d.equals(iqiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b.c, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ShowLinkWarning(blocked=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}

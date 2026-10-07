package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xui {
    public final String a;
    public final fvi b;

    public xui(wze wzeVar) {
        this.a = (String) wzeVar.b;
        this.b = (fvi) wzeVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xui.class != obj.getClass()) {
            return false;
        }
        xui xuiVar = (xui) obj;
        if (Objects.equals(this.a, xuiVar.a)) {
            return Objects.equals(this.b, xuiVar.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        fvi fviVar = this.b;
        return iHashCode + (fviVar != null ? fviVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}

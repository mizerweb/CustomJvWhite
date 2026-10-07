package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ui0 {
    public final wf5 a;
    public final List b;
    public final int c;
    public final int d;
    public final fx5 e;

    public ui0(wf5 wf5Var, List list, int i, int i2, fx5 fx5Var) {
        this.a = wf5Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = fx5Var;
    }

    public static g85 a(wf5 wf5Var) {
        g85 g85Var = new g85();
        if (wf5Var == null) {
            ore.n("Null surface");
            return null;
        }
        g85Var.a = wf5Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            ore.n("Null sharedSurfaces");
            return null;
        }
        g85Var.b = list;
        g85Var.c = -1;
        g85Var.d = -1;
        g85Var.e = fx5.d;
        return g85Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ui0)) {
            return false;
        }
        ui0 ui0Var = (ui0) obj;
        return this.a.equals(ui0Var.a) && this.b.equals(ui0Var.b) && this.c == ui0Var.c && this.d == ui0Var.d && this.e.equals(ui0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}

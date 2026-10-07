package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sw9 {
    public final int a;
    public final boolean b;
    public final ynh c;
    public final List d;

    public sw9(int i, boolean z, ynh ynhVar, List list) {
        this.a = i;
        this.b = z;
        this.c = ynhVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw9)) {
            return false;
        }
        sw9 sw9Var = (sw9) obj;
        return this.a == sw9Var.a && this.b == sw9Var.b && this.c.equals(sw9Var.c) && cqk.d(this.d, sw9Var.d);
    }

    public final int hashCode() {
        int iH = bc1.h(nbh.n(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        List list = this.d;
        return iH + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "VideoControlsState(muteIcon=" + this.a + ", isMute=" + this.b + ", qualityShort=" + this.c + ", allowedQualities=" + this.d + ")";
    }
}

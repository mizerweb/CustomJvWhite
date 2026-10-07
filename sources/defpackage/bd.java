package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bd {
    public static final bd c = new bd(ynh.b, r66.a);
    public final ynh a;
    public final List b;

    public bd(ynh ynhVar, List list) {
        this.a = ynhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.a.equals(bdVar.a) && this.b.equals(bdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdminWaitingRoomState(subtitle=" + this.a + ", list=" + this.b + ")";
    }
}

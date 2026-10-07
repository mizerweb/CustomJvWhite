package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class geb {
    public final String a;
    public final List b;

    public geb(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof geb)) {
            return false;
        }
        geb gebVar = (geb) obj;
        return this.a.equals(gebVar.a) && this.b.equals(gebVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeuroAvatarsPresetInfo(name=" + this.a + ", avatars=" + this.b + ")";
    }
}

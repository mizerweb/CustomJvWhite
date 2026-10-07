package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class egd extends kih implements xe9 {
    public final List c;

    public egd(List list) {
        this.c = list;
    }

    @Override // defpackage.xe9
    public final String a(boolean z, boolean z2) {
        return "PRESET_AVATARS.Response(presets=" + f55.s(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egd) && this.c.equals(((egd) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return a(false, false);
    }
}

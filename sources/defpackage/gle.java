package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gle implements pve {
    public final boolean a;

    public gle(boolean z) {
        this.a = z;
    }

    @Override // defpackage.pve
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gle.class == obj.getClass() && this.a == ((gle) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return c0a.p(new StringBuilder("RequestAsr{isEnabled="), this.a, '}');
    }
}

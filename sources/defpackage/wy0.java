package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class wy0 implements Serializable {
    public final boolean a;

    public wy0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy0) && this.a == ((wy0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("BitrateDumpGatheringConfig(isEnabled=", ")", this.a);
    }
}

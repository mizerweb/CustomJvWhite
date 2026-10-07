package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zei implements yve {
    public final Map a;

    public zei(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zei.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zei) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "UpdateDisplayLayoutCommandV2Response{participantsToErrorMap=" + this.a + '}';
    }
}

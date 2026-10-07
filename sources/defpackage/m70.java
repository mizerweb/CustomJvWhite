package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m70 implements vve {
    public ArrayList a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m70.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((m70) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "AudioActivityNotification{participantIds=" + this.a + '}';
    }
}

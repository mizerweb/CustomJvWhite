package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class leg implements vve {
    public yt1 a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || leg.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((leg) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "SpeakerChangedNotification{speaker=" + this.a + '}';
    }
}

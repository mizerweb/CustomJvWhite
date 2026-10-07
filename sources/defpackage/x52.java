package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class x52 {
    public final v4j a;
    public final yt1 b;
    public final u1b c;

    public x52(xtj xtjVar) {
        this.a = (v4j) xtjVar.c;
        this.b = (yt1) xtjVar.b;
        this.c = (u1b) xtjVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x52.class == obj.getClass()) {
            x52 x52Var = (x52) obj;
            if (this.a == x52Var.a && this.b.equals(x52Var.b) && Objects.equals(this.c, x52Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "CallVideoTrackParticipantKey{" + this.b + ", type=" + this.a + ", mid=" + this.c + "}";
    }
}

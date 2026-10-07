package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class snd implements tnd {
    public final Long a;
    public final ynh b;

    public snd(Long l, ynh ynhVar) {
        this.a = l;
        this.b = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snd)) {
            return false;
        }
        snd sndVar = (snd) obj;
        return cqk.d(this.a, sndVar.a) && this.b.equals(sndVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}

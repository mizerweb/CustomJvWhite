package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pdg extends sdg {
    public final long c;

    public pdg(long j) {
        super(j, 2);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdg) && this.c == ((pdg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "DialogBotId(botId=", ")");
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t93 {
    public final rt2 a;
    public final fda b;
    public final fda c;
    public final fda d;
    public final npa e;
    public final kbc f;

    public t93(rt2 rt2Var, fda fdaVar, fda fdaVar2, fda fdaVar3, npa npaVar, kbc kbcVar) {
        f9j f9jVar = f9j.None;
        this.a = rt2Var;
        this.b = fdaVar;
        this.c = fdaVar2;
        this.d = fdaVar3;
        this.e = npaVar;
        this.f = kbcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t93) {
            t93 t93Var = (t93) obj;
            if (!cqk.d(this.a, t93Var.a) || this.b != t93Var.b || this.c != t93Var.c || this.d != t93Var.d) {
                return false;
            }
            f9j f9jVar = f9j.None;
            if (cqk.d(this.e, t93Var.e) && cqk.d(this.f, t93Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((f9j.Seen.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingFirstMessage=" + this.b + ", incomingSecondMessage=" + this.c + ", outgoingMessage=" + this.d + ", messageViewStatus=" + f9j.Seen + ", messageTextLayoutRepository=" + this.e + ", theme=" + this.f + ")";
    }
}

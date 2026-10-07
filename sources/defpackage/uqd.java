package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uqd extends frd {
    public final int a;
    public final ctf b;
    public final boolean c;
    public final int d;

    public uqd(int i, ctf ctfVar, boolean z, int i2) {
        this.a = i;
        this.b = ctfVar;
        this.c = z;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqd)) {
            return false;
        }
        uqd uqdVar = (uqd) obj;
        return this.a == uqdVar.a && this.b.equals(uqdVar.b) && this.c == uqdVar.c && this.d == uqdVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nbh.n((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.d;
    }

    public final String toString() {
        return "InviteActionItem(actionId=" + this.a + ", model=" + this.b + ", isEnabled=" + this.c + ", itemViewType=" + jll.b(this.d) + ")";
    }
}

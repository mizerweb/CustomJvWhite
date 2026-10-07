package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yae extends kih {
    public String c;
    public boolean d;

    public yae(fka fkaVar) {
        super(fkaVar);
        this.d = true;
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("tls")) {
            this.d = fkaVar.v0();
        } else if (str.equals("redirectHost")) {
            this.c = ch3.W(fkaVar);
        } else {
            fkaVar.x();
        }
    }

    public final String h() {
        int iIndexOf;
        if (ch3.r(this.c) || (iIndexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        return this.c.substring(0, iIndexOf);
    }

    public final String i() {
        int iIndexOf;
        if (ch3.r(this.c) || (iIndexOf = this.c.indexOf(":")) <= 0) {
            return null;
        }
        String str = this.c;
        return str.substring(iIndexOf + 1, str.length());
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "{redirectHost='" + this.c + "', tls=" + this.d + "}";
    }
}

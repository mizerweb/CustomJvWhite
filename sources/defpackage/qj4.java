package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qj4 extends kih {
    public final pj4 c;

    public qj4(pj4 pj4Var) {
        this.c = pj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj4) && cqk.d(this.c, ((qj4) obj).c);
    }

    public final int hashCode() {
        pj4 pj4Var = this.c;
        if (pj4Var == null) {
            return 0;
        }
        return pj4Var.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "CONTACT_INFO_BY_PHONE.Response(contact=" + String.valueOf(this.c) + ')';
    }
}

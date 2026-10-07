package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aic extends hih {
    public final m8b c;

    public aic(m8b m8bVar) {
        super(kfc.U3);
        this.c = m8bVar;
        if (m8bVar.j()) {
            this.a.put("organizationIds", m8bVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aic) && cqk.d(this.c, ((aic) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

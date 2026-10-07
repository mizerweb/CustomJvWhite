package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a57 extends hih {
    public final c9b c;

    public a57(c9b c9bVar) {
        super(kfc.H3);
        this.c = c9bVar;
        this.a.put("folderIds", c9bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a57) && cqk.d(this.c, ((a57) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r98 extends q1 implements gri {
    public static final r98 a = new r98();

    @Override // defpackage.gri
    public final int a() {
        return 1;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        int iA = ((q1) ((gri) obj)).a();
        qt4.c(iA);
        return iA == 1;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.gri
    public final String toJson() {
        return "null";
    }

    public final String toString() {
        return "null";
    }
}

package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w88 extends q1 implements gri {
    public final byte a;
    public final byte[] b;

    public w88(byte b, byte[] bArr) {
        this.a = b;
        this.b = bArr;
    }

    @Override // defpackage.gri
    public final int a() {
        return 9;
    }

    @Override // defpackage.gri
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        int iA = ((q1) griVar).a();
        if (iA == 0) {
            throw null;
        }
        if (iA != 9) {
            return false;
        }
        w88 w88VarQ = griVar.q();
        return this.a == w88VarQ.a && Arrays.equals(this.b, w88VarQ.b);
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b : this.b) {
            i = (i * 31) + b;
        }
        return i;
    }

    @Override // defpackage.q1, defpackage.gri
    public final w88 q() {
        return this;
    }

    @Override // defpackage.gri
    public final String toJson() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: y */
    public final w88 q() {
        return this;
    }
}

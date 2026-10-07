package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gka {
    public final pia a;
    public final String b;
    public final long c;
    public final oji d;
    public final fvi e;

    public gka(uj6 uj6Var) {
        this.a = (pia) uj6Var.c;
        this.b = (String) uj6Var.a;
        this.c = uj6Var.b;
        this.d = (oji) uj6Var.d;
        this.e = (fvi) uj6Var.e;
    }

    public final uj6 a() {
        uj6 uj6Var = new uj6();
        uj6Var.c = this.a;
        uj6Var.a = this.b;
        uj6Var.b = this.c;
        uj6Var.d = this.d;
        uj6Var.e = this.e;
        return uj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gka.class != obj.getClass()) {
            return false;
        }
        gka gkaVar = (gka) obj;
        if (this.c != gkaVar.c) {
            return false;
        }
        pia piaVar = gkaVar.a;
        pia piaVar2 = this.a;
        if (piaVar2 == null ? piaVar != null : !piaVar2.equals(piaVar)) {
            return false;
        }
        String str = gkaVar.b;
        String str2 = this.b;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.d == gkaVar.d && Objects.equals(this.e, gkaVar.e);
        }
        return false;
    }

    public final int hashCode() {
        pia piaVar = this.a;
        int iHashCode = (piaVar != null ? piaVar.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        oji ojiVar = this.d;
        int iHashCode3 = (i + (ojiVar != null ? ojiVar.hashCode() : 0)) * 31;
        fvi fviVar = this.e;
        return iHashCode3 + (fviVar != null ? fviVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageUpload{messageMediaUploadKey=");
        sb.append(this.a);
        sb.append(", path='");
        sb.append(gm0.c() ? this.b : "****");
        sb.append("', lastModified=");
        sb.append(this.c);
        sb.append(", uploadType=");
        sb.append(this.d);
        sb.append(", videoConvertOptions=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}

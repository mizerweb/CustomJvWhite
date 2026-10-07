package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b2i {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public b2i(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final p21 a() {
        p21 p21Var = new p21();
        p21Var.a = this.a;
        p21Var.c = this.b;
        p21Var.d = this.c;
        p21Var.b = this.d;
        return p21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2i)) {
            return false;
        }
        b2i b2iVar = (b2i) obj;
        return this.a == b2iVar.a && Objects.equals(this.b, b2iVar.b) && Objects.equals(this.c, b2iVar.c) && this.d == b2iVar.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return qt4.p(sb, this.d, '}');
    }
}

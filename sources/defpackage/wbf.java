package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wbf {
    public final zbf a;
    public final zbf b;

    public wbf(zbf zbfVar, zbf zbfVar2) {
        this.a = zbfVar;
        this.b = zbfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wbf.class == obj.getClass()) {
            wbf wbfVar = (wbf) obj;
            if (this.a.equals(wbfVar.a) && this.b.equals(wbfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        zbf zbfVar = this.a;
        sb.append(zbfVar);
        zbf zbfVar2 = this.b;
        if (zbfVar.equals(zbfVar2)) {
            str = "";
        } else {
            str = ", " + zbfVar2;
        }
        return zo5.w(sb, str, "]");
    }
}

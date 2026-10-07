package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class chh {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public chh(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chh)) {
            return false;
        }
        chh chhVar = (chh) obj;
        if (cqk.d(this.a, chhVar.a) && cqk.d(this.b, chhVar.b) && cqk.d(this.c, chhVar.c) && this.d.equals(chhVar.d)) {
            return this.e.equals(chhVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + qv1.c(zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return s5h.w0(s5h.y0("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + qvl.e(ww3.L1(this.d)) + "\n            |   referenceColumnNames = {" + qvl.d(ww3.L1(this.e)) + "\n            |}\n        "));
    }
}

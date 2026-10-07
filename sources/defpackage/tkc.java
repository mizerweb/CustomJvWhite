package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final uxa e;

    public tkc(String str, String str2, String str3, String str4, uxa uxaVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uxaVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (tkc.class.equals(obj != null ? obj.getClass() : null)) {
                tkc tkcVar = (tkc) obj;
                if (this.a.equals(tkcVar.a) && this.b.equals(tkcVar.b) && this.c.equals(tkcVar.c)) {
                    String str = tkcVar.d;
                    String str2 = this.d;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && this.e.equals(tkcVar.e)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iD = zo5.d(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        cdk cdkVar = str != null ? new cdk(str) : null;
        return this.e.hashCode() + ((iD + (cdkVar != null ? cdkVar.a.hashCode() : 0)) * 31);
    }
}

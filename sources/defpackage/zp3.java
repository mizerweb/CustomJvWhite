package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zp3 {
    public final hve a;

    public zp3(hve hveVar) {
        this.a = hveVar;
    }

    public final void a() {
        this.a.R(r66.a, null);
    }

    public final String b() {
        lve lveVarA = this.a.a.a();
        if (lveVarA != null) {
            return lveVarA.b;
        }
        return null;
    }

    public final void c() {
        hve hveVar = this.a;
        hveVar.e = 3;
        hveVar.R(r66.a, null);
    }

    public final void d(String str, af7 af7Var) {
        if (cqk.d(b(), str)) {
            return;
        }
        hve hveVar = this.a;
        hveVar.S(false);
        lve lveVarE = oc9.e((br4) af7Var.invoke(), null, null);
        lveVarE.e(str);
        hveVar.T(lveVarE);
    }
}

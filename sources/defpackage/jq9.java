package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jq9 implements oj7 {
    public static final jq9 a;
    private static final fif descriptor;

    static {
        jq9 jq9Var = new jq9();
        a = jq9Var;
        t4d t4dVar = new t4d("one.me.sdk.prefs.models.media.MediaAutoSaveSettings", jq9Var, 1);
        t4dVar.k("records", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        List list = ((qq9) obj).a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = qq9.b;
        if (x74VarA.B() || !cqk.d(list, r66.a)) {
            x74VarA.i(fifVar, 0, (aw8) ny8VarArr[0].getValue(), list);
        }
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        return new aw8[]{qq9.b[0].getValue()};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = qq9.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else {
                if (iV != 0) {
                    qr7.e(iV);
                    return null;
                }
                list = (List) v74VarA.x(fifVar, 0, (aw8) ny8VarArr[0].getValue(), list);
                i = 1;
            }
        }
        v74VarA.j(fifVar);
        return new qq9(i, list);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}

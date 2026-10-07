package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vz8 implements hh9 {
    public final oc8 a;
    public final ny8 b;
    public final mjg c;
    public final r8e d;
    public final dq4 e;
    public final l9b f;

    public vz8(oc8 oc8Var, ny8 ny8Var, xhh xhhVar) {
        this.a = oc8Var;
        this.b = ny8Var;
        mjg mjgVarA = p90.a(new p9i(new vi9(10)));
        this.c = mjgVarA;
        this.d = new r8e(mjgVarA);
        this.e = cqk.a(((n0c) xhhVar).a());
        this.f = new l9b();
        oc8Var.k = this;
    }

    public static final void a(vz8 vz8Var, long j) {
        boolean z;
        w50 w50Var;
        mjg mjgVar = vz8Var.c;
        List listB = vz8Var.a.b(j);
        int i = 1;
        if (listB == null) {
            z = false;
        } else {
            int i2 = 0;
            z = false;
            while (i2 < listB.size()) {
                nib nibVar = (nib) ((Map.Entry) listB.get(i2)).getValue();
                i2++;
                nib nibVar2 = i2 < listB.size() ? (nib) ((Map.Entry) listB.get(i2)).getValue() : null;
                if (nibVar2 != null) {
                    w50 w50Var2 = nibVar.b;
                    w50 w50Var3 = nibVar2.b;
                    if (w50Var2 == null) {
                        if (w50Var3 != null) {
                            z = true;
                        }
                    } else if (!w50Var2.equals(w50Var3)) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            w50Var = w50.UNKNOWN;
        } else {
            w50Var = (listB == null || listB.isEmpty()) ? null : ((nib) ((Map.Entry) listB.get(0)).getValue()).b;
        }
        switch (w50Var == null ? -1 : tz8.$EnumSwitchMapping$0[w50Var.ordinal()]) {
            case 1:
                i = 5;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 6;
                break;
        }
        CharSequence charSequenceH = ((e13) vz8Var.b.getValue()).h(j);
        if (charSequenceH == null) {
            charSequenceH = "";
        }
        zf3 zf3Var = new zf3(j, i, charSequenceH);
        p9i p9iVar = (p9i) mjgVar.getValue();
        vi9 vi9Var = new vi9(p9iVar.a.i());
        vi9Var.g(p9iVar.a);
        vi9Var.f(j, zf3Var);
        mjgVar.j(null, new p9i(vi9Var));
    }

    @Override // defpackage.hh9
    public final void c() {
        this.a.k = null;
    }
}

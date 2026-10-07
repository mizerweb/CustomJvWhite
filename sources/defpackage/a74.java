package defpackage;

import androidx.fragment.app.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a74 implements z09 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a74(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ltb ltbVar = (ltb) obj2;
                b bVar = (b) obj;
                if (m09Var == m09.ON_CREATE) {
                    ltbVar.e = b74.a.a(bVar);
                    ltbVar.e(ltbVar.g);
                }
                break;
            default:
                u09 u09Var = (u09) obj2;
                vo8 vo8Var = (vo8) obj;
                if (g19Var.f().d == n09.a) {
                    vo8Var.b(null);
                    u09Var.a();
                    break;
                } else {
                    int iCompareTo = g19Var.f().d.compareTo(n09.d);
                    on5 on5Var = u09Var.b;
                    if (iCompareTo < 0) {
                        on5Var.a = true;
                        break;
                    } else if (on5Var.a) {
                        if (!on5Var.b) {
                            on5Var.a = false;
                            on5Var.a();
                        } else {
                            ore.k("Cannot resume a finished dispatcher");
                        }
                        break;
                    }
                }
                break;
        }
    }
}

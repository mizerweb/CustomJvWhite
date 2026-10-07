package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qz8 implements z09 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public qz8(c19 c19Var) {
        this.b = c19Var;
        xr3 xr3Var = xr3.c;
        Class<?> cls = c19Var.getClass();
        vr3 vr3Var = (vr3) xr3Var.a.get(cls);
        this.c = vr3Var == null ? xr3Var.a(cls, null) : vr3Var;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (m09Var == m09.ON_START) {
                    ((i19) obj).f(this);
                    ((b1f) obj2).d();
                }
                break;
            default:
                HashMap map = ((vr3) obj2).a;
                vr3.a((List) map.get(m09Var), g19Var, m09Var, obj);
                vr3.a((List) map.get(m09.ON_ANY), g19Var, m09Var, obj);
                break;
        }
    }

    public qz8(i19 i19Var, b1f b1fVar) {
        this.b = i19Var;
        this.c = b1fVar;
    }
}

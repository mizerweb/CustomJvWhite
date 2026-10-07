package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tqg implements oj7 {
    public static final tqg a;
    private static final fif descriptor;

    static {
        tqg tqgVar = new tqg();
        a = tqgVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.StoriesConfig", tqgVar, 8);
        t4dVar.k("trim-limit", true);
        t4dVar.k("pick-duration", true);
        t4dVar.k("photo-duration", true);
        t4dVar.k("polling-previews", true);
        t4dVar.k("polling-chats", true);
        t4dVar.k("stats-refresh", true);
        t4dVar.k("content-refresh", true);
        t4dVar.k("max-stories", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vqg vqgVar = (vqg) obj;
        int i = vqgVar.h;
        int i2 = vqgVar.g;
        int i3 = vqgVar.f;
        Integer num = vqgVar.e;
        Integer num2 = vqgVar.d;
        int i4 = vqgVar.c;
        int i5 = vqgVar.b;
        int i6 = vqgVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        if (x74VarA.B() || i6 != 180) {
            x74VarA.y(0, i6, fifVar);
        }
        if (x74VarA.B() || i5 != 900) {
            x74VarA.y(1, i5, fifVar);
        }
        if (x74VarA.B() || i4 != 8) {
            x74VarA.y(2, i4, fifVar);
        }
        if (x74VarA.B() || num2 != null) {
            x74VarA.o(fifVar, 3, ij8.a, num2);
        }
        if (x74VarA.B() || num != null) {
            x74VarA.o(fifVar, 4, ij8.a, num);
        }
        if (x74VarA.B() || i3 != 300) {
            x74VarA.y(5, i3, fifVar);
        }
        if (x74VarA.B() || i2 != 300) {
            x74VarA.y(6, i2, fifVar);
        }
        if (x74VarA.B() || i != 30) {
            x74VarA.y(7, i, fifVar);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ij8 ij8Var = ij8.a;
        return new aw8[]{ij8Var, ij8Var, ij8Var, lvb.o0(ij8Var), lvb.o0(ij8Var), ij8Var, ij8Var, ij8Var};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        int iL4 = 0;
        int iL5 = 0;
        int iL6 = 0;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iL = v74VarA.l(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    iL2 = v74VarA.l(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    iL3 = v74VarA.l(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) v74VarA.n(fifVar, 3, ij8.a, num);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) v74VarA.n(fifVar, 4, ij8.a, num2);
                    i |= 16;
                    break;
                case 5:
                    iL4 = v74VarA.l(fifVar, 5);
                    i |= 32;
                    continue;
                case 6:
                    iL5 = v74VarA.l(fifVar, 6);
                    i |= 64;
                    continue;
                case 7:
                    iL6 = v74VarA.l(fifVar, 7);
                    i |= np0.m;
                    continue;
                default:
                    qr7.e(iV);
                    return obj;
            }
            obj = null;
        }
        v74VarA.j(fifVar);
        return new vqg(i, iL, iL2, iL3, num, num2, iL4, iL5, iL6);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class the implements oj7 {
    public static final the a;
    private static final fif descriptor;

    static {
        the theVar = new the();
        a = theVar;
        t4d t4dVar = new t4d("one.me.sdk.ReleaseCdConfig", theVar, 9);
        t4dVar.k("title", false);
        t4dVar.k("primaryButton", false);
        t4dVar.k("channelId", false);
        t4dVar.k("secondaryChannelId", true);
        t4dVar.k("primaryButtons", true);
        t4dVar.k("description", true);
        t4dVar.k("descriptions", true);
        t4dVar.k("hChannelId", true);
        t4dVar.k("hSecondaryChannelId", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        vhe vheVar = (vhe) obj;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = vhe.j;
        String str = vheVar.a;
        Long l = vheVar.i;
        Long l2 = vheVar.h;
        Map map = vheVar.g;
        String str2 = vheVar.f;
        Map map2 = vheVar.e;
        Long l3 = vheVar.d;
        x74VarA.n(fifVar, 0, str);
        x74VarA.n(fifVar, 1, vheVar.b);
        x74VarA.e(fifVar, 2, vheVar.c);
        if (x74VarA.B() || l3 != null) {
            x74VarA.o(fifVar, 3, ti9.a, l3);
        }
        if (x74VarA.B() || map2 != null) {
            x74VarA.o(fifVar, 4, (aw8) ny8VarArr[4].getValue(), map2);
        }
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 5, n5h.a, str2);
        }
        if (x74VarA.B() || map != null) {
            x74VarA.o(fifVar, 6, (aw8) ny8VarArr[6].getValue(), map);
        }
        if (x74VarA.B() || l2 != null) {
            x74VarA.o(fifVar, 7, ti9.a, l2);
        }
        if (x74VarA.B() || l != null) {
            x74VarA.o(fifVar, 8, ti9.a, l);
        }
        x74VarA.c();
    }

    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = vhe.j;
        n5h n5hVar = n5h.a;
        ti9 ti9Var = ti9.a;
        return new aw8[]{n5hVar, n5hVar, ti9Var, lvb.o0(ti9Var), lvb.o0((aw8) ny8VarArr[4].getValue()), lvb.o0(n5hVar), lvb.o0((aw8) ny8VarArr[6].getValue()), lvb.o0(ti9Var), lvb.o0(ti9Var)};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        ny8[] ny8VarArr;
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr2 = vhe.j;
        long jQ = 0;
        Long l = null;
        Long l2 = null;
        boolean z = true;
        String str = null;
        Map map = null;
        int i = 0;
        String strH = null;
        String strH2 = null;
        Long l3 = null;
        Map map2 = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            switch (iV) {
                case -1:
                    ny8VarArr = ny8VarArr2;
                    z = false;
                    break;
                case 0:
                    ny8VarArr = ny8VarArr2;
                    strH = v74VarA.h(fifVar, 0);
                    i |= 1;
                    break;
                case 1:
                    ny8VarArr = ny8VarArr2;
                    strH2 = v74VarA.h(fifVar, 1);
                    i |= 2;
                    break;
                case 2:
                    ny8VarArr = ny8VarArr2;
                    jQ = v74VarA.q(fifVar, 2);
                    i |= 4;
                    break;
                case 3:
                    ny8VarArr = ny8VarArr2;
                    l3 = (Long) v74VarA.n(fifVar, 3, ti9.a, l3);
                    i |= 8;
                    break;
                case 4:
                    ny8VarArr = ny8VarArr2;
                    map2 = (Map) v74VarA.n(fifVar, 4, (aw8) ny8VarArr[4].getValue(), map2);
                    i |= 16;
                    break;
                case 5:
                    ny8VarArr = ny8VarArr2;
                    str = (String) v74VarA.n(fifVar, 5, n5h.a, str);
                    i |= 32;
                    break;
                case 6:
                    ny8VarArr = ny8VarArr2;
                    map = (Map) v74VarA.n(fifVar, 6, (aw8) ny8VarArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    ny8VarArr = ny8VarArr2;
                    l2 = (Long) v74VarA.n(fifVar, 7, ti9.a, l2);
                    i |= np0.m;
                    break;
                case 8:
                    ny8VarArr = ny8VarArr2;
                    l = (Long) v74VarA.n(fifVar, 8, ti9.a, l);
                    i |= np0.n;
                    break;
                default:
                    qr7.e(iV);
                    return null;
            }
            ny8VarArr2 = ny8VarArr;
        }
        v74VarA.j(fifVar);
        return new vhe(i, strH, strH2, jQ, l3, map2, str, map, l2, l);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}

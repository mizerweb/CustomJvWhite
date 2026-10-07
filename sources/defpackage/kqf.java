package defpackage;

import java.util.List;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kqf implements oj7 {
    public static final kqf a;
    private static final fif descriptor;

    static {
        kqf kqfVar = new kqf();
        a = kqfVar;
        t4d t4dVar = new t4d("ru.ok.tamtam.models.settings.SettingsBannerSection", kqfVar, 5);
        t4dVar.k("id", true);
        t4dVar.k(CallAnalyticsApiRequest.KEY_ITEMS, false);
        t4dVar.k("logo", true);
        t4dVar.k("title", true);
        t4dVar.k("align", true);
        descriptor = t4dVar;
    }

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        oqf oqfVar = (oqf) obj;
        int i = oqfVar.a;
        fif fifVar = descriptor;
        x74 x74VarA = u76Var.a(fifVar);
        ny8[] ny8VarArr = oqf.f;
        if (x74VarA.B() || i != 0) {
            x74VarA.y(0, i, fifVar);
        }
        aw8 aw8Var = (aw8) ny8VarArr[1].getValue();
        List list = oqfVar.b;
        mqf mqfVar = oqfVar.e;
        String str = oqfVar.d;
        String str2 = oqfVar.c;
        x74VarA.i(fifVar, 1, aw8Var, list);
        if (x74VarA.B() || str2 != null) {
            x74VarA.o(fifVar, 2, n5h.a, str2);
        }
        if (x74VarA.B() || str != null) {
            x74VarA.o(fifVar, 3, n5h.a, str);
        }
        if (x74VarA.B() || mqfVar != mqf.LEFT) {
            x74VarA.i(fifVar, 4, mqf.b, mqfVar);
        }
        x74VarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj7
    public final aw8[] b() {
        ny8[] ny8VarArr = oqf.f;
        n5h n5hVar = n5h.a;
        return new aw8[]{ij8.a, ny8VarArr[1].getValue(), lvb.o0(n5hVar), lvb.o0(n5hVar), mqf.b};
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        fif fifVar = descriptor;
        v74 v74VarA = r55Var.a(fifVar);
        ny8[] ny8VarArr = oqf.f;
        boolean z = true;
        int i = 0;
        int iL = 0;
        List list = null;
        String str = null;
        String str2 = null;
        mqf mqfVar = null;
        while (z) {
            int iV = v74VarA.v(fifVar);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                iL = v74VarA.l(fifVar, 0);
                i |= 1;
            } else if (iV == 1) {
                list = (List) v74VarA.x(fifVar, 1, (aw8) ny8VarArr[1].getValue(), list);
                i |= 2;
            } else if (iV == 2) {
                str = (String) v74VarA.n(fifVar, 2, n5h.a, str);
                i |= 4;
            } else if (iV == 3) {
                str2 = (String) v74VarA.n(fifVar, 3, n5h.a, str2);
                i |= 8;
            } else {
                if (iV != 4) {
                    qr7.e(iV);
                    return null;
                }
                mqfVar = (mqf) v74VarA.x(fifVar, 4, mqf.b, mqfVar);
                i |= 16;
            }
        }
        v74VarA.j(fifVar);
        return new oqf(i, iL, list, str, str2, mqfVar);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return descriptor;
    }
}

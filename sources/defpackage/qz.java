package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz implements oa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.oa4
    public final void a(Context context) {
        Object value;
        vj4 vj4Var;
        ArrayList arrayList;
        ynh xnhVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b00 b00Var = (b00) obj;
                if (((f5d) ((wo6) b00Var.K.getValue())).b() == 1) {
                    List list = ((wh3) b00Var.M.getValue()).a;
                    if (!list.isEmpty()) {
                        pw pwVar = new pw(0);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            pwVar.add(Long.valueOf(((w73) it.next()).a));
                        }
                        String str = (String) b00Var.A.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, c0a.k(pwVar.c, "onConfigurationChange: updating ", " chats"), null);
                            }
                        }
                        b00Var.E.e(rx8.j0(pwVar), ui9.a);
                        break;
                    }
                }
                break;
            case 1:
                pk4 pk4Var = (pk4) obj;
                mjg mjgVar = pk4Var.m;
                do {
                    value = mjgVar.getValue();
                    vj4Var = (vj4) value;
                    List list2 = vj4Var.a;
                    if (list2 != null) {
                        List<ek4> list3 = list2;
                        arrayList = new ArrayList(yw3.W0(list3, 10));
                        for (ek4 ek4Var : list3) {
                            ynh ynhVar = ek4Var.e;
                            boolean z = ek4Var.t;
                            CharSequence charSequenceE = ynhVar != null ? ynhVar.e() : null;
                            if (z) {
                                xnhVar = new tnh(jcd.b((jcd) pk4Var.k.getValue(), null, 1));
                            } else if (charSequenceE == null || charSequenceE.length() == 0) {
                                xnhVar = ek4Var.e;
                            } else {
                                yfd yfdVar = (yfd) pk4Var.f.getValue();
                                qfd qfdVarB = yfdVar.B(ek4Var.a);
                                xnhVar = new xnh(yfdVar.A(qfdVarB.a, qfdVarB.b));
                            }
                            arrayList.add(ek4.i(ek4Var, xnhVar, z ? false : ek4Var.h, 2097007));
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!mjgVar.h(value, vj4.a(vj4Var, arrayList, 6)));
                break;
            case 2:
                ((npa) obj).f().i(-1);
                break;
            case 3:
                ((evb) obj).j();
                break;
            default:
                cnh cnhVar = (cnh) obj;
                DisplayMetrics displayMetrics = cnhVar.a.getResources().getDisplayMetrics();
                if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) >= gm0.K(200.0f * yl5.d().getDisplayMetrics().density)) {
                    cnhVar.f.a();
                }
                cnhVar.b().evictAll();
                ((bnh) cnhVar.j.getValue()).evictAll();
                break;
        }
    }
}

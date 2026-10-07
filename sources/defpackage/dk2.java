package defpackage;

import android.view.View;
import java.util.Iterator;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dk2 implements tf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dk2(l9b l9bVar, k9b k9bVar) {
        this.a = 3;
        this.b = l9bVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        es4 es4VarB;
        tp2 tp2Var;
        Integer numH;
        Integer numL;
        Object next;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((lh9) obj4).invoke((Throwable) obj);
                return sbi.a;
            case 1:
                fs4 fs4Var = (fs4) obj4;
                ixj ixjVar = (ixj) obj2;
                if (fs4Var.f) {
                    es4 es4VarB2 = fs4Var.b();
                    tp2 tp2Var2 = es4VarB2.c;
                    int iIntValue = (tp2Var2 == null || (numL = n7j.l(tp2Var2)) == null) ? 0 : numL.intValue();
                    tp2 tp2Var3 = es4VarB2.d;
                    int iIntValue2 = (tp2Var3 == null || (numH = n7j.h(tp2Var3)) == null) ? 0 : numH.intValue();
                    yr4 yr4Var = es4VarB2.j;
                    if (iIntValue != yr4Var.b || iIntValue2 != es4VarB2.k.b) {
                        tp2 tp2Var4 = es4VarB2.c;
                        es4VarB2.j = yr4.a(yr4Var, tp2Var4 != null ? tp2Var4.getMeasuredHeight() : 0, iIntValue, false, 4);
                        yr4 yr4Var2 = es4VarB2.k;
                        tp2 tp2Var5 = es4VarB2.d;
                        es4VarB2.k = yr4.a(yr4Var2, tp2Var5 != null ? tp2Var5.getMeasuredHeight() : 0, iIntValue2, false, 4);
                        for (zr4 zr4Var : es4VarB2.a) {
                            zr4Var.G(es4VarB2.j);
                            zr4Var.A(es4VarB2.k);
                        }
                        if (!fs4Var.b().g && (tp2Var = (es4VarB = fs4Var.b()).d) != null) {
                            tp2Var.setTranslationY(((Number) es4.d(false, es4VarB.k, 80).a).floatValue());
                            tp2 tp2Var6 = es4VarB.c;
                            if (tp2Var6 != null) {
                                tp2Var6.setTranslationY(((Number) es4.d(false, es4VarB.j, 48).a).floatValue());
                            }
                        }
                        fs4Var.g = true;
                        fs4Var.a();
                    }
                }
                return ixjVar;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                s5e s5eVar = (s5e) obj2;
                View view = (View) obj3;
                b7e b7eVar = ((MessagesListWidget) obj4).P1;
                if (b7eVar != null) {
                    je9 je9Var = je9.d;
                    Iterator it = b7eVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            y6e y6eVar = (y6e) next;
                            if (y6eVar.a != jLongValue || !cqk.d(y6eVar.c, s5eVar)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    y6e y6eVar2 = (y6e) next;
                    if (y6eVar2 == null) {
                        String str = b7eVar.d;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Can't play reaction effect because don't have state, reaction:" + ((Object) s5eVar) + ", l:" + jLongValue, null);
                        }
                    } else {
                        lfe lfeVarL = b7eVar.a.L(y6eVar2.a);
                        if (b7eVar.e(lfeVarL != null ? lfeVarL.l() : -1)) {
                            String str2 = b7eVar.d;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "Make reaction effect pending, reaction:" + ((Object) s5eVar) + ", msgId:" + jLongValue, null);
                            }
                            b7eVar.f.add(Long.valueOf(y6eVar2.a));
                        } else {
                            b7eVar.f.remove(Long.valueOf(y6eVar2.a));
                            b7eVar.e.remove(y6eVar2);
                            View view2 = lfeVarL.a;
                            bdc.a(view2, new yvh(view2, b7eVar, view, y6eVar2, s5eVar, jLongValue));
                        }
                    }
                }
                return sbi.a;
            case 3:
                l9b l9bVar = (l9b) obj4;
                l9b.j.set(l9bVar, null);
                l9bVar.g(null);
                return sbi.a;
            default:
                ProfileScreen profileScreen = (ProfileScreen) obj4;
                ixj ixjVar2 = (ixj) obj2;
                ku8 ku8Var = ProfileScreen.B;
                if (profileScreen.getView() != null) {
                    rq rqVar = (rq) profileScreen.i.m(profileScreen, ProfileScreen.C[0]);
                    rqVar.setPadding(rqVar.getPaddingLeft(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), rqVar.getPaddingRight(), rqVar.getPaddingBottom());
                }
                return ixjVar2;
        }
    }

    public /* synthetic */ dk2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

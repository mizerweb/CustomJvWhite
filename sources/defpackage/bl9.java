package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.main.MainScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class bl9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MainScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl9(lq4 lq4Var, MainScreen mainScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mainScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MainScreen mainScreen = this.g;
        switch (i) {
            case 0:
                bl9 bl9Var = new bl9(lq4Var, mainScreen, 0);
                bl9Var.f = obj;
                return bl9Var;
            case 1:
                bl9 bl9Var2 = new bl9(lq4Var, mainScreen, 1);
                bl9Var2.f = obj;
                return bl9Var2;
            case 2:
                bl9 bl9Var3 = new bl9(lq4Var, mainScreen, 2);
                bl9Var3.f = obj;
                return bl9Var3;
            case 3:
                bl9 bl9Var4 = new bl9(lq4Var, mainScreen, 3);
                bl9Var4.f = obj;
                return bl9Var4;
            case 4:
                bl9 bl9Var5 = new bl9(lq4Var, mainScreen, 4);
                bl9Var5.f = obj;
                return bl9Var5;
            case 5:
                bl9 bl9Var6 = new bl9(lq4Var, mainScreen, 5);
                bl9Var6.f = obj;
                return bl9Var6;
            case 6:
                bl9 bl9Var7 = new bl9(lq4Var, mainScreen, 6);
                bl9Var7.f = obj;
                return bl9Var7;
            default:
                bl9 bl9Var8 = new bl9(lq4Var, mainScreen, 7);
                bl9Var8.f = obj;
                return bl9Var8;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((bl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01e0  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        hve childRouter;
        boolean z;
        ul5 ul5Var;
        ul5 ul5Var2;
        int i = 2;
        int i2 = 3;
        int i3 = -1;
        int i4 = 1;
        int i5 = 0;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                rxb rxbVar = (rxb) obj2;
                String str = rxbVar.d;
                pk9.c.getClass();
                if (!str.equals(v65.a(pk9.g.a))) {
                    MainScreen.r1(this.g, false);
                }
                MainScreen.p1(this.g).g(rxbVar);
                MainScreen mainScreen = this.g;
                String str2 = mainScreen.t;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "MainScreenTab.attach(), tag=".concat(rxbVar.d), null);
                    }
                }
                LinkedHashMap linkedHashMap = mainScreen.j;
                String str3 = rxbVar.d;
                Object obj3 = linkedHashMap.get(str3);
                if (obj3 == null) {
                    tp2 tp2VarA = oc9.a(mainScreen.getContext());
                    tp2VarA.setId(rxbVar.c);
                    ylc ylcVar = new ylc(rxbVar, tp2VarA);
                    linkedHashMap.put(str3, ylcVar);
                    obj3 = ylcVar;
                }
                ViewGroup viewGroup2 = (ViewGroup) ((ylc) obj3).b;
                ((FrameLayout) mainScreen.k.m(mainScreen, MainScreen.v[0])).addView(viewGroup2, 0, new FrameLayout.LayoutParams(-1, -1));
                String str4 = rxbVar.d;
                if (str4.length() <= 0) {
                    str4 = null;
                }
                hve childRouter2 = mainScreen.getChildRouter(viewGroup2, str4);
                childRouter2.e = 1;
                if (!childRouter2.o()) {
                    lve lveVar = new lve(mainScreen.s1(rxbVar), null, null, null, false, -1);
                    lveVar.e(str4);
                    childRouter2.T(lveVar);
                }
                br4 br4VarI = rx8.I(childRouter2);
                if (br4VarI != null) {
                    View view = br4VarI.getView();
                    if (view == null || !br4VarI.isAttached()) {
                        br4VarI.addLifecycleListener(new lr4(2, mainScreen));
                    } else {
                        n7j.e(view, new uk9(mainScreen, i2));
                    }
                }
                childRouter2.K();
                kl9 kl9VarY1 = this.g.y1();
                Bundle bundle = kl9VarY1.j;
                kl9VarY1.j = null;
                if (bundle != null) {
                    String str5 = this.g.t;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str5, "update args after attaching tabItem: ".concat(rxbVar.d), null);
                        }
                    }
                    this.g.updateArgs(bundle);
                }
                this.g.i.b();
                break;
            case 1:
                Object obj4 = this.f;
                ch3.d0(obj);
                rxb rxbVar2 = (rxb) obj4;
                MainScreen mainScreen2 = this.g;
                ylc ylcVar2 = (ylc) mainScreen2.j.get(rxbVar2.d);
                if (ylcVar2 != null && (viewGroup = (ViewGroup) ylcVar2.b) != null && (childRouter = mainScreen2.getChildRouter(viewGroup, rxbVar2.d, false)) != null) {
                    String str6 = rxbVar2.d;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.d;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, str6, "Recreate screen ".concat(rxbVar2.d), null);
                        }
                    }
                    lve lveVar2 = new lve(mainScreen2.s1(rxbVar2), null, null, null, false, -1);
                    lveVar2.e(rxbVar2.d);
                    childRouter.N(lveVar2);
                }
                break;
            case 2:
                Object obj5 = this.f;
                ch3.d0(obj);
                MainScreen.p1(this.g).i(((Boolean) obj5).booleanValue());
                break;
            case 3:
                MainScreen mainScreen3 = this.g;
                Object obj6 = this.f;
                ch3.d0(obj);
                hm3 hm3Var = (hm3) obj6;
                if (hm3Var.a && (ul5Var = mainScreen3.p) != null && ul5Var.h() && (ul5Var2 = mainScreen3.p) != null) {
                    ul5Var2.b(false);
                }
                if (hm3Var.a) {
                    a8g a8gVar = MainScreen.u;
                    String str7 = ((rxb) mainScreen3.y1().i.a.getValue()).d;
                    pk9.c.getClass();
                    if (str7.equals(v65.a(pk9.g.a))) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    a8g a8gVar2 = MainScreen.u;
                    kl9 kl9VarY2 = mainScreen3.y1();
                    List list = hm3Var.b;
                    mjg mjgVar = kl9VarY2.q;
                    mjgVar.getClass();
                    mjgVar.j(null, list);
                }
                MainScreen.r1(mainScreen3, z);
                break;
            case 4:
                Object obj7 = this.f;
                ch3.d0(obj);
                jm3 jm3Var = (jm3) obj7;
                MainScreen mainScreen4 = this.g;
                a8g a8gVar3 = MainScreen.u;
                g21.b((g21) mainScreen4.n.getValue(), MainScreen.o1(mainScreen4), jm3Var.a(), jm3Var.b(), gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(18.0f * yl5.d().getDisplayMetrics().density));
                break;
            case 5:
                List listL1 = r66.a;
                Object obj8 = this.f;
                ch3.d0(obj);
                List list2 = (List) obj8;
                boolean zIsEmpty = list2.isEmpty();
                MainScreen mainScreen5 = this.g;
                if (zIsEmpty) {
                    txb txbVarO1 = MainScreen.o1(mainScreen5);
                    txbVarO1.c = listL1;
                    txbVarO1.c();
                    ArrayList arrayList = txbVarO1.e;
                    if (arrayList.isEmpty()) {
                        txbVarO1.removeAllViews();
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((h11) it.next()).setVisibility(8);
                        }
                    }
                    txbVarO1.f();
                } else {
                    txb txbVarO2 = MainScreen.o1(mainScreen5);
                    al9 al9Var = new al9(mainScreen5, i5);
                    al9 al9Var2 = new al9(mainScreen5, i4);
                    txbVarO2.c = list2;
                    ArrayList arrayList2 = txbVarO2.e;
                    if (arrayList2.size() < 4) {
                        int size = 4 - arrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            h11 h11Var = new h11(txbVarO2.getContext());
                            h11Var.setSelected(false);
                            h11Var.setVisibility(8);
                            arrayList2.add(h11Var);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, i3);
                            layoutParams.weight = 1.0f;
                            txbVarO2.addView(h11Var, layoutParams);
                            i6++;
                            i3 = -1;
                        }
                        txbVarO2.f();
                    }
                    txbVarO2.c();
                    List list3 = txbVarO2.c;
                    boolean z2 = list3.size() > 4;
                    List listN1 = z2 ? ww3.N1(list3, 3) : list3;
                    if (z2) {
                        listL1 = ww3.l1(list3, 3);
                    }
                    int size2 = arrayList2.size();
                    while (i5 < size2) {
                        h11 h11Var2 = (h11) arrayList2.get(i5);
                        mxb mxbVar = (mxb) ww3.u1(i5, listN1);
                        if (mxbVar != null) {
                            txbVarO2.b(h11Var2, mxbVar, new aeb(al9Var, i, mxbVar), al9Var2);
                        } else if (listL1.isEmpty() || i5 != 3) {
                            h11Var2.setVisibility(8);
                        } else {
                            txbVarO2.b(h11Var2, new mxb(new rxb(null, new pxb(R.drawable.icon_dots_vertical), R.id.oneme_bottom_bar_overflow_button, "bottom_bar_overflow", R.id.oneme_bottom_bar_overflow_button), null, null, 30), new aa1(txbVarO2, listL1, al9Var, 1), al9Var2);
                        }
                        i5++;
                    }
                    txbVarO2.f();
                }
                break;
            case 6:
                Object obj9 = this.f;
                ch3.d0(obj);
                rxb rxbVar3 = (rxb) obj9;
                MainScreen mainScreen6 = this.g;
                a8g a8gVar4 = MainScreen.u;
                hve hveVarV1 = mainScreen6.v1();
                br4 br4VarG = hveVarV1 != null ? hveVarV1.g(rxbVar3.d) : null;
                p6f p6fVar = br4VarG instanceof p6f ? (p6f) br4VarG : null;
                if (p6fVar != null) {
                    p6fVar.U0();
                }
                break;
            default:
                Object obj10 = this.f;
                ch3.d0(obj);
                MainScreen mainScreen7 = this.g;
                a8g a8gVar5 = MainScreen.u;
                mainScreen7.t1((rxb) obj10);
                break;
        }
        return sbi.a;
    }
}

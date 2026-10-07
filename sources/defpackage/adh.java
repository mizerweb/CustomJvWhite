package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class adh extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adh(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                adh adhVar = new adh((ldh) this.g, (lq4) obj3, 0);
                adhVar.f = (Throwable) obj2;
                adhVar.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                adh adhVar2 = new adh(3, (lq4) obj3, 1);
                adhVar2.g = (yx6) obj;
                adhVar2.f = (Throwable) obj2;
                adhVar2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                adh adhVar3 = new adh((AccountInitializer) this.g, (lq4) obj3, 2);
                adhVar3.f = (Throwable) obj2;
                adhVar3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                adh adhVar4 = new adh((zt4) this.g, (lq4) obj3, 3);
                adhVar4.f = (Throwable) obj2;
                adhVar4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                adh adhVar5 = new adh((n30) this.g, (lq4) obj3, 4);
                adhVar5.f = (Throwable) obj2;
                adhVar5.invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((Number) obj2).intValue();
                adh adhVar6 = new adh((rl3) this.g, (lq4) obj3, 5);
                adhVar6.f = (wh3) obj;
                return adhVar6.invokeSuspend(sbiVar);
            case 6:
                adh adhVar7 = new adh(3, (lq4) obj3, 6);
                adhVar7.f = (wh3) obj;
                adhVar7.g = (List) obj2;
                return adhVar7.invokeSuspend(sbiVar);
            case 7:
                adh adhVar8 = new adh(3, (lq4) obj3, 7);
                adhVar8.f = (FrameLayout) obj;
                adhVar8.g = (kbc) obj2;
                adhVar8.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                adh adhVar9 = new adh(3, (lq4) obj3, 8);
                adhVar9.f = (rq) obj;
                adhVar9.g = (kbc) obj2;
                adhVar9.invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                adh adhVar10 = new adh((un4) this.g, (lq4) obj3, 9);
                adhVar10.f = (Throwable) obj2;
                adhVar10.invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                adh adhVar11 = new adh((um6) this.g, (lq4) obj3, 10);
                adhVar11.f = (Throwable) obj2;
                adhVar11.invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                adh adhVar12 = new adh(3, (lq4) obj3, 11);
                adhVar12.f = (d09) obj;
                adhVar12.g = (kbc) obj2;
                adhVar12.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                adh adhVar13 = new adh((Context) this.g, (lq4) obj3, 12);
                adhVar13.f = (r1c) obj;
                adhVar13.invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                adh adhVar14 = new adh(3, (lq4) obj3, 13);
                adhVar14.f = (List) obj;
                adhVar14.g = (List) obj2;
                return adhVar14.invokeSuspend(sbiVar);
            case 14:
                adh adhVar15 = new adh(3, (lq4) obj3, 14);
                adhVar15.f = (List) obj;
                adhVar15.g = (yg6) obj2;
                return adhVar15.invokeSuspend(sbiVar);
            default:
                adh adhVar16 = new adh((View) this.g, (lq4) obj3, 15);
                adhVar16.f = (ImageView) obj;
                adhVar16.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object objB;
        int i = this.e;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(((ldh) this.g).j, "failed favorites obs", new tch("failed favorites obs", th));
                return sbiVar;
            case 1:
                yx6 yx6Var = (yx6) this.g;
                Throwable th2 = (Throwable) this.f;
                ch3.d0(obj);
                hcj hcjVar = new hcj("error while parsing json", th2);
                gm0.V(yx6Var.getClass().getName(), hcjVar.getMessage(), hcjVar);
                return sbiVar;
            case 2:
                Throwable th3 = (Throwable) this.f;
                ch3.d0(obj);
                if (!(th3 instanceof CancellationException)) {
                    ((t1c) ((ed6) c0a.j((AccountInitializer) this.g, 205))).a(th3);
                }
                return sbiVar;
            case 3:
                Throwable th4 = (Throwable) this.f;
                ch3.d0(obj);
                ((zt4) this.g).r0(getContext(), th4);
                return sbiVar;
            case 4:
                Throwable th5 = (Throwable) this.f;
                ch3.d0(obj);
                n30 n30Var = (n30) this.g;
                gm0.Y(n30Var.e, "phonebook observing is finished. Error " + th5);
                i30 i30Var = n30Var.j;
                if (i30Var != null) {
                    n30Var.a.getContentResolver().unregisterContentObserver(i30Var);
                }
                n30Var.j = null;
                return sbiVar;
            case 5:
                wh3 wh3Var = (wh3) this.f;
                ch3.d0(obj);
                mjg mjgVar = ((rl3) this.g).x1;
                do {
                    value = mjgVar.getValue();
                    arrayList = new ArrayList();
                    for (Object obj2 : (Set) value) {
                        long jLongValue = ((Number) obj2).longValue();
                        List list = wh3Var.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((w73) it.next()).a == jLongValue) {
                                    arrayList.add(obj2);
                                }
                                break;
                            }
                        }
                    }
                } while (!mjgVar.h(value, ww3.X1(arrayList)));
                Set set = (Set) mjgVar.getValue();
                if (set.isEmpty()) {
                    return wh3Var;
                }
                List list2 = wh3Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!set.contains(Long.valueOf(((w73) obj3).a))) {
                        arrayList2.add(obj3);
                    }
                }
                return new wh3(arrayList2, wh3Var.b);
            case 6:
                wh3 wh3Var2 = (wh3) this.f;
                List list3 = (List) this.g;
                ch3.d0(obj);
                return new ylc(wh3Var2, list3);
            case 7:
                FrameLayout frameLayout = (FrameLayout) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                a8gVar.e(frameLayout.getContext()).getClass();
                pq3.f(frameLayout, kbcVar);
                return sbiVar;
            case 8:
                rq rqVar = (rq) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                rqVar.setBackgroundColor(kbcVar2.b().c);
                return sbiVar;
            case 9:
                Throwable th6 = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(((un4) this.g).i, "fail in combine", th6);
                return sbiVar;
            case 10:
                Throwable th7 = (Throwable) this.f;
                ch3.d0(obj);
                gm0.V(((um6) this.g).a, "failed favorites obs", th7);
                return sbiVar;
            case 11:
                d09 d09Var = (d09) this.f;
                kbc kbcVar3 = (kbc) this.g;
                ch3.d0(obj);
                d09Var.c.setImageTintList(ColorStateList.valueOf(kbcVar3.getText().b));
                return sbiVar;
            case 12:
                r1c r1cVar = (r1c) this.f;
                ch3.d0(obj);
                pq3 pq3VarE = a8gVar.e((Context) this.g);
                kbc currentTheme = r1cVar.getCurrentTheme();
                pq3VarE.getClass();
                pq3.f(r1cVar, currentTheme);
                return sbiVar;
            case 13:
                List list4 = (List) this.f;
                List list5 = (List) this.g;
                ch3.d0(obj);
                return ww3.G1(list5, list4);
            case 14:
                List list6 = (List) this.f;
                yg6 yg6Var = (yg6) this.g;
                ch3.d0(obj);
                if (yg6Var == null) {
                    objB = r66.a;
                } else {
                    int i2 = yg6Var.a;
                    objB = vw3.b(i2, (yg6Var.b - i2) + 1, list6);
                }
                return new ylc(objB, yg6Var);
            default:
                ImageView imageView = (ImageView) this.f;
                ch3.d0(obj);
                View view = (View) this.g;
                a8gVar.h(view);
                imageView.setColorFilter(-1);
                imageView.setBackgroundColor(a8gVar.h(view).h().a);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adh(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}

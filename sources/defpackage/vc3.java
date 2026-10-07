package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vc3 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc3(lx9 lx9Var, ny8 ny8Var, ny8 ny8Var2, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 3;
        this.g = lx9Var;
        this.i = ny8Var;
        this.h = ny8Var2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                vc3 vc3Var = new vc3((xd3) obj5, (ny8) obj4, (lq4) obj3, 0);
                vc3Var.f = (rt2) obj;
                vc3Var.g = (vg4) obj2;
                return vc3Var.invokeSuspend(sbiVar);
            case 1:
                vc3 vc3Var2 = new vc3((ImageView) obj5, (TextView) obj4, (lq4) obj3, 1);
                vc3Var2.f = (LinearLayout) obj;
                vc3Var2.g = (kbc) obj2;
                vc3Var2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                vc3 vc3Var3 = new vc3((EnhancedAnimatedVectorDrawable) this.g, (id8) obj5, (md8) obj4, (lq4) obj3, 2);
                vc3Var3.f = (kbc) obj2;
                vc3Var3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                vc3 vc3Var4 = new vc3((lx9) this.g, (ny8) obj4, (ny8) obj5, (lq4) obj3);
                vc3Var4.f = (kb9) obj;
                return vc3Var4.invokeSuspend(sbiVar);
            case 4:
                vc3 vc3Var5 = new vc3((r00) obj5, (String) obj4, (lq4) obj3, 4);
                vc3Var5.f = (List) obj;
                vc3Var5.g = (List) obj2;
                return vc3Var5.invokeSuspend(sbiVar);
            case 5:
                vc3 vc3Var6 = new vc3((i1d) obj5, (ny8) obj4, (lq4) obj3, 5);
                vc3Var6.f = (tmc) obj;
                vc3Var6.g = (dz4) obj2;
                vc3Var6.invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                vc3 vc3Var7 = new vc3((Context) obj5, (View) obj4, (lq4) obj3, 6);
                vc3Var7.f = (View) obj;
                vc3Var7.g = (kbc) obj2;
                vc3Var7.invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                vc3 vc3Var8 = new vc3((Drawable) this.g, (Drawable) obj5, (GradientDrawable) obj4, (lq4) obj3, 7);
                vc3Var8.f = (kbc) obj2;
                vc3Var8.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                vc3 vc3Var9 = new vc3((q7g) obj5, (azg) obj4, (lq4) obj3, 8);
                vc3Var9.f = (upc) obj;
                vc3Var9.g = (List) obj2;
                return vc3Var9.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c6  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        y0e y0eVar;
        Object next;
        Object value;
        Object value2;
        ynh tnhVar;
        int i;
        Object value3;
        Map map;
        Map map2;
        boolean z = false;
        sw9 sw9Var = null;
        switch (this.e) {
            case 0:
                ny8 ny8Var = (ny8) this.i;
                rt2 rt2Var = (rt2) this.f;
                vg4 vg4Var = (vg4) this.g;
                ch3.d0(obj);
                boolean zD = vg4Var != null ? vg4Var.D() : rt2Var.a0();
                boolean zC = ((jcd) ((xd3) this.h).u.getValue()).c(rt2Var, vg4Var);
                boolean zR = rt2Var.R();
                if (rt2Var.b.K.i(64)) {
                    return ie3.g;
                }
                if (zC) {
                    return ie3.b;
                }
                if (zD) {
                    return ie3.a;
                }
                if (rt2Var.q0()) {
                    return ie3.c;
                }
                if (rt2Var.g0()) {
                    return ie3.d;
                }
                if (rt2Var.p0()) {
                    return ie3.e;
                }
                if (rt2Var.t0()) {
                    return ie3.f;
                }
                if (rt2Var.d0() && rt2Var.A0() && !rt2Var.Q() && !zR && rt2Var.s0((et3) ny8Var.getValue())) {
                    return ie3.h;
                }
                if (rt2Var.d0() && rt2Var.A0() && !rt2Var.Q() && !zR && !rt2Var.s0((et3) ny8Var.getValue())) {
                    return ie3.i;
                }
                if (!rt2Var.d0() || rt2Var.A0()) {
                    return null;
                }
                return ie3.j;
            case 1:
                LinearLayout linearLayout = (LinearLayout) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                ((ImageView) this.h).setColorFilter(kbcVar.getIcon().h);
                ((TextView) this.i).setTextColor(kbcVar.getText().h);
                linearLayout.setBackground(col.e(kbcVar, null, ((bs0) kbcVar.u().c.g).c, 4));
                return sbi.a;
            case 2:
                kbc kbcVar2 = (kbc) this.f;
                ch3.d0(obj);
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = (EnhancedAnimatedVectorDrawable) this.g;
                id8 id8Var = (id8) this.h;
                Iterator it = id8Var.b.iterator();
                while (it.hasNext()) {
                    lvb.A0(enhancedAnimatedVectorDrawable, (String) it.next(), kbcVar2.getIcon().h);
                }
                List<String> list = id8Var.c;
                if (list != null) {
                    for (String str : list) {
                        int iI0 = lvb.I0(kbcVar2.h().a, 0.16f);
                        int i2 = kbcVar2.b().f;
                        int i3 = md8.d;
                        lvb.A0(enhancedAnimatedVectorDrawable, str, mx3.b(i2, ((iI0 >> 24) & 255) / 255.0f, lvb.I0(iI0, 1.0f)));
                    }
                }
                return sbi.a;
            case 3:
                lx9 lx9Var = (lx9) this.g;
                kb9 kb9Var = (kb9) this.f;
                ch3.d0(obj);
                if (kb9Var != null && kb9Var.l == jb9.d) {
                    fvi fviVarC = lx9.C(lx9Var, kb9Var.a);
                    List listA = ((h4c) ((c2a) ((ny8) this.i).getValue())).a(kb9Var.b.toString());
                    mui muiVarL = ((nni) ((ny8) this.h).getValue()).l();
                    if (fviVarC == null || (y0eVar = fviVarC.a) == null) {
                        if (listA != null) {
                            y0e y0eVar2 = muiVarL.a;
                            Iterator it2 = listA.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    y0e y0eVar3 = ((d1e) next).a;
                                    do {
                                        Object next2 = it2.next();
                                        y0e y0eVar4 = ((d1e) next2).a;
                                        if (y0eVar3.compareTo(y0eVar4) > 0) {
                                            next = next2;
                                            y0eVar3 = y0eVar4;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            d1e d1eVar = (d1e) next;
                            if (d1eVar != null) {
                                y0eVar2 = (y0e) oc9.s(d1eVar.a, y0eVar2);
                            }
                            y0eVar = y0eVar2;
                        } else {
                            y0eVar = null;
                        }
                    }
                    mjg mjgVar = lx9Var.J;
                    do {
                        value = mjgVar.getValue();
                        ((Number) value).floatValue();
                    } while (!mjgVar.h(value, new Float(fviVarC != null ? fviVarC.b : 0.0f)));
                    mjg mjgVar2 = lx9Var.X;
                    do {
                        value2 = mjgVar2.getValue();
                        ((Number) value2).floatValue();
                    } while (!mjgVar2.h(value2, new Float(fviVarC != null ? fviVarC.c : 1.0f)));
                    switch (y0eVar != null ? kx9.$EnumSwitchMapping$0[y0eVar.ordinal()] : -1) {
                        case -1:
                            tnhVar = new tnh(R.string.video_auto_quality);
                            if (fviVarC == null && fviVarC.e) {
                                i = R.drawable.icon_sound_crossed;
                            } else {
                                i = R.drawable.icon_sound;
                            }
                            if (fviVarC != null && fviVarC.e) {
                                z = true;
                            }
                            sw9Var = new sw9(i, z, tnhVar, listA);
                            break;
                        case 0:
                        default:
                            ore.o();
                            break;
                        case 1:
                        case 2:
                            tnhVar = new xnh(y0eVar.a);
                            if (fviVarC == null) {
                                i = R.drawable.icon_sound;
                            } else {
                                i = R.drawable.icon_sound;
                            }
                            if (fviVarC != null) {
                                z = true;
                            }
                            sw9Var = new sw9(i, z, tnhVar, listA);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            String str2 = y0eVar.a;
                            int length = str2.length() - 1;
                            if (length < 0) {
                                length = 0;
                            }
                            tnhVar = new xnh(r5h.u1(length, str2));
                            if (fviVarC == null) {
                                i = R.drawable.icon_sound;
                            } else {
                                i = R.drawable.icon_sound;
                            }
                            if (fviVarC != null) {
                                z = true;
                            }
                            sw9Var = new sw9(i, z, tnhVar, listA);
                            break;
                    }
                }
                return sw9Var;
            case 4:
                List list2 = (List) this.f;
                List list3 = (List) this.g;
                ch3.d0(obj);
                ww3.G1(list3, list2);
                r00 r00Var = (r00) this.h;
                String str3 = (String) this.i;
                return ww3.G1(r00.c(r00Var, list3, str3), r00.c(r00Var, list2, str3));
            case 5:
                tmc tmcVar = (tmc) this.f;
                dz4 dz4Var = (dz4) this.g;
                ch3.d0(obj);
                mjg mjgVar3 = ((i1d) this.h).d;
                ny8 ny8Var2 = (ny8) this.i;
                do {
                    value3 = mjgVar3.getValue();
                } while (!mjgVar3.h(value3, kpk.f(kpk.c(tmcVar, tmcVar.a.l(), dz4Var.i, dz4Var.f, (p32) ny8Var2.getValue(), dz4Var.q, null), false, dz4Var.i, dz4Var.f)));
                return sbi.a;
            case 6:
                View view = (View) this.f;
                kbc kbcVar3 = (kbc) this.g;
                ch3.d0(obj);
                sz0 sz0Var = new sz0((Context) this.h, kbcVar3.b().e, Float.intBitsToFloat((int) (ogd.o & 4294967295L)), true);
                View view2 = (View) this.i;
                sz0Var.i = new yp4(view2, 5);
                sz0Var.j = new yp4(view2, 6);
                view.setBackground(sz0Var);
                return sbi.a;
            case 7:
                kbc kbcVar4 = (kbc) this.f;
                ch3.d0(obj);
                Drawable drawable = (Drawable) this.g;
                kbcVar4.getIcon();
                drawable.setTint(-1);
                ((Drawable) this.h).setTint(-1);
                ((GradientDrawable) this.i).setTint(-1728053248);
                return sbi.a;
            default:
                upc upcVar = (upc) this.f;
                List list4 = (List) this.g;
                ch3.d0(obj);
                azg azgVar = (azg) this.i;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list4) {
                    if (cqk.d(((hyg) obj2).b, azgVar)) {
                        arrayList.add(obj2);
                    }
                }
                String str4 = ((q7g) this.h).d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        Integer num = (upcVar == null || (map2 = upcVar.b) == null) ? null : new Integer(map2.size());
                        a4cVar.c(je9Var, str4, "We have cached stories: " + num + " and drafts stories: " + arrayList.size(), null);
                    }
                }
                if (upcVar == null && arrayList.isEmpty()) {
                    return null;
                }
                if (upcVar == null || (map = upcVar.b) == null) {
                    map = s66.a;
                }
                int iP0 = wm9.P0(yw3.W0(arrayList, 10));
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(new Long(((hyg) obj3).a), obj3);
                }
                LinkedHashMap linkedHashMapT0 = wm9.T0(map, linkedHashMap);
                return upcVar != null ? upc.a(upcVar, linkedHashMapT0, 0L, false, 13) : new upc((azg) this.i, linkedHashMapT0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc3(Drawable drawable, Object obj, Object obj2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = drawable;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc3(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }
}

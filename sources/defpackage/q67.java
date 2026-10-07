package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes.dex */
public final class q67 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q67(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                q67 q67Var = new q67((x67) obj4, (lq4) obj3, 0);
                q67Var.f = (List) obj;
                q67Var.g = (y47) obj2;
                return q67Var.invokeSuspend(sbiVar);
            case 1:
                q67 q67Var2 = new q67((PinBarsWidget) obj4, (lq4) obj3, 1);
                q67Var2.f = (LinearLayout) obj;
                q67Var2.g = (kbc) obj2;
                q67Var2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                q67 q67Var3 = new q67((ftg) obj4, (lq4) obj3, 2);
                q67Var3.f = (List) obj;
                q67Var3.g = (g0h) obj2;
                return q67Var3.invokeSuspend(sbiVar);
            case 3:
                q67 q67Var4 = new q67((vzg) obj4, (lq4) obj3, 3);
                q67Var4.g = (Map) obj;
                q67Var4.f = (List) obj2;
                return q67Var4.invokeSuspend(sbiVar);
            default:
                q67 q67Var5 = new q67((jcc) obj4, (lq4) obj3, 4);
                q67Var5.f = (ImageView) obj;
                q67Var5.g = (kbc) obj2;
                q67Var5.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[LOOP:1: B:48:0x00ef->B:137:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Paint paint;
        Iterator it;
        long jLongValue;
        Iterator it2;
        switch (this.e) {
            case 0:
                List list = (List) this.f;
                y47 y47Var = (y47) this.g;
                ch3.d0(obj);
                List<r17> list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                for (r17 r17Var : list2) {
                    ou4 ou4Var = (ou4) y47Var.a.d(r17Var.a);
                    if (ou4Var == null) {
                        ou4Var = ou4.b;
                    }
                    arrayList.add(new q37(r17Var.a, r17Var.b, r17Var.o, ou4Var, r17Var.i));
                }
                return arrayList;
            case 1:
                LinearLayout linearLayout = (LinearLayout) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.h;
                ny8 ny8Var = pinBarsWidget.u;
                ny8 ny8Var2 = pinBarsWidget.t;
                if (ny8Var2.d()) {
                    InsetDrawable insetDrawable = (InsetDrawable) ny8Var2.getValue();
                    if (insetDrawable == null) {
                        insetDrawable = null;
                    }
                    Drawable drawable = insetDrawable != null ? insetDrawable.getDrawable() : null;
                    ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
                    if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                        paint.setColor(kbcVar.B().b);
                    }
                    if (!((Boolean) pinBarsWidget.r1().u().i()).booleanValue()) {
                        linearLayout.setBackgroundColor(kbcVar.b().d);
                    }
                }
                if (ny8Var.d()) {
                    ((ShapeDrawable) ny8Var.getValue()).getPaint().setColor(kbcVar.B().b);
                }
                return sbi.a;
            case 2:
                List list3 = (List) this.f;
                g0h g0hVar = (g0h) this.g;
                ch3.d0(obj);
                int i = ftg.k;
                boolean z = g0hVar instanceof e0h;
                e0h e0hVar = z ? (e0h) g0hVar : null;
                Float fValueOf = e0hVar != null ? Float.valueOf(e0hVar.a) : null;
                Iterator it3 = list3.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i2 = -1;
                    } else if (!((osg) it3.next()).a) {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return list3;
                }
                osg osgVar = (osg) list3.get(i2);
                msg msgVar = z ? msg.a : osgVar.g;
                Float f = osgVar.h;
                if (f != null ? !(fValueOf == null || f.floatValue() != fValueOf.floatValue()) : fValueOf == null) {
                    if (osgVar.g == msgVar) {
                        return list3;
                    }
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.set(i2, osg.i(osgVar, 0, msgVar, fValueOf, 63));
                return arrayList2;
            case 3:
                Map map = (Map) this.g;
                List list4 = (List) this.f;
                ch3.d0(obj);
                vzg vzgVar = (vzg) this.h;
                long jT = ((s7f) ((et3) vzgVar.e.getValue())).t();
                ozg ozgVarC = (ozg) map.get(Long.valueOf(jT));
                if (ozgVarC == null) {
                    ozgVarC = vzgVar.c(jT);
                }
                if (ozgVarC == null) {
                    String str = vzgVar.c;
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null) {
                        return map;
                    }
                    je9 je9Var = je9.f;
                    if (!a4cVar.b(je9Var)) {
                        return map;
                    }
                    a4cVar.c(je9Var, str, "We couldn't add self preview to previews", null);
                    return map;
                }
                Long l = (Long) ww3.s1(map.keySet());
                if (l != null && l.longValue() == jT && map.get(Long.valueOf(jT)) != null) {
                    List list5 = list4;
                    boolean z2 = list5 instanceof Collection;
                    if (z2 && list5.isEmpty()) {
                        if (map.isEmpty()) {
                            return map;
                        }
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            jLongValue = ((Number) ((Map.Entry) it.next()).getKey()).longValue();
                            if (z2) {
                            }
                            it2 = list5.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    continue;
                                } else if (((hyg) it2.next()).b.a() == jLongValue) {
                                }
                            }
                        }
                        return map;
                    }
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            if (map.isEmpty()) {
                                return map;
                            }
                            it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                jLongValue = ((Number) ((Map.Entry) it.next()).getKey()).longValue();
                                if (z2 || !list5.isEmpty()) {
                                    it2 = list5.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            continue;
                                        } else if (((hyg) it2.next()).b.a() == jLongValue) {
                                        }
                                    }
                                }
                            }
                            return map;
                        }
                        if (((hyg) it4.next()).b.a() == jT) {
                        }
                    }
                }
                String str2 = vzgVar.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.s("We need to rebuild previews. Has drafts = ", !list4.isEmpty()), null);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() + (!map.containsKey(Long.valueOf(jT))));
                linkedHashMap.put(Long.valueOf(jT), vzg.e(ozgVarC, jT, list4));
                for (Map.Entry entry : map.entrySet()) {
                    long jLongValue2 = ((Number) entry.getKey()).longValue();
                    ozg ozgVar = (ozg) entry.getValue();
                    if (jLongValue2 != jT) {
                        linkedHashMap.put(Long.valueOf(jLongValue2), vzg.e(ozgVar, jLongValue2, list4));
                    }
                }
                return linkedHashMap;
            default:
                ImageView imageView = (ImageView) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                imageView.setColorFilter(oc9.Z(((jcc) this.h).d, kbcVar2));
                return sbi.a;
        }
    }
}

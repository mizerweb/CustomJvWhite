package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xk2 {
    public Long a;
    public List b;
    public final gg1 c;
    public final mjg d;
    public final r8e e;
    public final mjg f;
    public final r8e g;

    public xk2() {
        r66 r66Var = r66.a;
        this.b = r66Var;
        gg1 gg1Var = new gg1();
        gg1Var.c = new Rect();
        gg1Var.d = r66Var;
        gg1Var.e = r66Var;
        this.c = gg1Var;
        mjg mjgVarA = p90.a(r66Var);
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.f = mjgVarA2;
        this.g = new r8e(mjgVarA2);
    }

    public final void a() {
        mjg mjgVar = this.f;
        Long l = (Long) mjgVar.getValue();
        if (l != null) {
            long jLongValue = l.longValue();
            List list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((vk2) it.next()).getId() == jLongValue) {
                        return;
                    }
                }
            }
            mjgVar.setValue(null);
        }
    }

    public final ArrayList b() {
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tk2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((tk2) it.next()).a);
        }
        return arrayList2;
    }

    public final ArrayList c() {
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof uk2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((uk2) it.next()).a);
        }
        return arrayList2;
    }

    public final void d(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lu5 lu5Var = (lu5) it.next();
            linkedHashMap.put(Long.valueOf(lu5Var.a), new sk2(lu5Var));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + this.b.size());
        for (vk2 vk2Var : this.b) {
            if (vk2Var instanceof sk2) {
                vk2 vk2Var2 = (vk2) linkedHashMap.remove(Long.valueOf(((sk2) vk2Var).a.a));
                if (vk2Var2 != null) {
                    arrayList.add(vk2Var2);
                }
            } else {
                arrayList.add(vk2Var);
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            arrayList.add((vk2) it2.next());
        }
        this.b = ww3.M1(arrayList, new lv5(15));
        a();
        List list2 = this.b;
        mjg mjgVar = this.d;
        mjgVar.getClass();
        mjgVar.j(null, list2);
    }

    public final void e() {
        r66 r66Var = r66.a;
        this.b = r66Var;
        gg1 gg1Var = this.c;
        gg1Var.d = r66Var;
        gg1Var.c = new Rect();
        gg1Var.a = false;
        gg1Var.e = r66Var;
        gg1Var.f = null;
        gg1Var.b = 0L;
        this.f.setValue(null);
    }

    public final void f(Long l) {
        this.f.setValue(l);
    }

    public final void g(cf7 cf7Var) {
        Iterable<umh> iterable = (Iterable) cf7Var.invoke(c());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (umh umhVar : iterable) {
            linkedHashMap.put(Long.valueOf(umhVar.a), new uk2(umhVar));
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + this.b.size());
        for (vk2 vk2Var : this.b) {
            if (vk2Var instanceof uk2) {
                vk2 vk2Var2 = (vk2) linkedHashMap.remove(Long.valueOf(((uk2) vk2Var).a.a));
                if (vk2Var2 != null) {
                    arrayList.add(vk2Var2);
                }
            } else {
                arrayList.add(vk2Var);
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.add((vk2) it.next());
        }
        this.b = ww3.M1(arrayList, new lv5(15));
        a();
        List list = this.b;
        mjg mjgVar = this.d;
        mjgVar.getClass();
        mjgVar.j(null, list);
    }
}

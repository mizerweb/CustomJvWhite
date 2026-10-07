package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fg9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                jg9 jg9Var = (jg9) obj4;
                rt2 rt2Var = (rt2) obj3;
                wfe wfeVar = (wfe) obj2;
                List list = (List) obj;
                if (jg9Var.f().b.a().s()) {
                    uoa uoaVarC = jg9Var.d().c();
                    long j = rt2Var.a;
                    ((ose) uoaVarC).A(j, Collections.singletonList(Long.valueOf(((sfa) wfeVar.a).a)));
                    ArrayList arrayListY = ((ose) jg9Var.d().c()).y(j, Collections.singletonList(Long.valueOf(((sfa) wfeVar.a).a)));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : arrayListY) {
                        sfa sfaVar = (sfa) obj5;
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                }
                            } while (((gda) it.next()).a != sfaVar.b);
                        }
                        arrayList.add(obj5);
                    }
                    ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Long.valueOf(((sfa) it2.next()).a));
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        ((t51) jg9Var.i.getValue()).c(new lfi(j, arrayList2));
                    }
                }
                uoa uoaVarC2 = jg9Var.d().c();
                ((toa) ((ose) uoaVarC2).h()).h(rt2Var.a, Collections.singletonList(Long.valueOf(((sfa) wfeVar.a).a)), wja.DELETED, false);
                return sbi.a;
            case 1:
                return new qza((ny8) obj4, (ny8) obj3, (ny8) obj2, (ha9) obj);
            default:
                w8g w8gVar = (w8g) obj4;
                ny8 ny8Var = w8gVar.i;
                wwd wwdVar = (wwd) obj3;
                ny8 ny8Var2 = (ny8) obj2;
                wwd wwdVar2 = (wwd) obj;
                ny8 ny8Var3 = w8gVar.f;
                ny8 ny8Var4 = w8gVar.g;
                boolean zBooleanValue = ((Boolean) ((e5d) ny8Var3.getValue()).x().i()).booleanValue();
                Application application = w8gVar.a;
                ed6 ed6Var = w8gVar.b;
                if (zBooleanValue) {
                    bec becVar = new bec(application, ed6Var, w8gVar.e, (gue) ny8Var.getValue(), (dti) wwdVar.get(), (wo6) ny8Var4.getValue(), (e5d) ny8Var3.getValue(), w8gVar.c, ny8Var2);
                    becVar.q0((c3j) wwdVar2.get());
                    return becVar;
                }
                f3j f3jVar = new f3j(application, ed6Var, w8gVar.c, w8gVar.d, w8gVar.e, (gue) ny8Var.getValue(), (dti) wwdVar.get(), (wo6) ny8Var4.getValue(), ny8Var2);
                f3jVar.q0((c3j) wwdVar2.get());
                return f3jVar;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class xg2 implements eqb {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xg2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [jj0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [r66] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.eqb
    public final void a(Object obj) {
        yg2 yg2Var;
        ?? r2;
        dh2 dh2Var;
        n11 n11Var;
        ?? arrayList;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                if (!((yg2) this.b).l.get() || (r2 = (yg2Var = (yg2) this.b).f) == 0 || (dh2Var = yg2Var.g) == null || (n11Var = yg2Var.i) == null) {
                    return;
                }
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ff2) it.next()).a());
                    }
                } else {
                    arrayList = r66.a;
                }
                try {
                    List list3 = ((yg2) this.b).k;
                    Iterable iterableT1 = ((AtomicBoolean) r2.j).get() ? r66.a : ww3.T1(r2.c(arrayList));
                    ArrayList arrayList2 = new ArrayList(yw3.W0(iterableT1, 10));
                    Iterator it2 = iterableT1.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(ejl.a((String) it2.next(), null, null));
                    }
                    Set setY = lof.Y(ww3.X1(list3), ww3.X1(arrayList2));
                    if (!setY.isEmpty() && n11Var.h(dh2Var.c(), setY)) {
                        tvj.g("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                        return;
                    }
                } catch (Exception e) {
                    tvj.i("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                }
                try {
                    r2.g(arrayList);
                    Set setD = r2.d();
                    ArrayList arrayList3 = new ArrayList(yw3.W0(setD, 10));
                    Iterator it3 = setD.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(ejl.a((String) it3.next(), null, null));
                    }
                    if (arrayList3.equals(((yg2) this.b).k)) {
                        return;
                    }
                    yg2 yg2Var2 = (yg2) this.b;
                    List listT1 = ww3.T1(yg2Var2.k);
                    if (arrayList3.equals(listT1)) {
                        return;
                    }
                    synchronized (yg2Var2.d) {
                        if (yg2Var2.e != null) {
                            tvj.a("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                            yg2Var2.e.cancel(false);
                            yg2Var2.e = null;
                        }
                        break;
                    }
                    List list4 = listT1;
                    Set setX1 = ww3.X1(list4);
                    Set setX2 = ww3.X1(arrayList3);
                    Set setY2 = lof.Y(setX2, setX1);
                    Set setY3 = lof.Y(setX1, setX2);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(yw3.W0(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((ff2) it4.next()).a());
                    }
                    try {
                        Iterator it5 = setY3.iterator();
                        while (it5.hasNext()) {
                            yg2Var2.c(((ff2) it5.next()).a());
                        }
                        dh2 dh2Var2 = yg2Var2.g;
                        if (dh2Var2 != null) {
                            tvj.a("CameraPresencePrvdr", "Updating CameraRepository...");
                            dh2Var2.a(arrayList5);
                            arrayList4.add(dh2Var2);
                            tvj.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
                        }
                        if (!yg2Var2.m.isEmpty()) {
                            tvj.a("CameraPresencePrvdr", "Updating " + yg2Var2.m.size() + " dependent listeners...");
                            for (xj8 xj8Var : yg2Var2.m) {
                                xj8Var.a(arrayList5);
                                arrayList4.add(xj8Var);
                            }
                        }
                        yg2Var2.k = arrayList3;
                        Iterator it6 = setY2.iterator();
                        while (it6.hasNext()) {
                            yg2Var2.a(((ff2) it6.next()).a());
                        }
                        yg2Var2.b(setY2, setY3);
                        return;
                    } catch (Exception e2) {
                        tvj.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
                        ArrayList arrayList6 = new ArrayList(yw3.W0(list4, 10));
                        Iterator it7 = list4.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((ff2) it7.next()).a());
                        }
                        Iterator it8 = new upe(arrayList4).iterator();
                        while (true) {
                            tpe tpeVar = (tpe) it8;
                            if (!tpeVar.b.hasPrevious()) {
                                Iterator it9 = setY3.iterator();
                                while (it9.hasNext()) {
                                    yg2Var2.a(((ff2) it9.next()).a());
                                }
                                Iterator it10 = setY2.iterator();
                                while (it10.hasNext()) {
                                    yg2Var2.c(((ff2) it10.next()).a());
                                }
                                return;
                            }
                            xj8 xj8Var2 = (xj8) tpeVar.b.previous();
                            try {
                                xj8Var2.a(arrayList6);
                            } catch (Exception e3) {
                                tvj.d("CameraPresencePrvdr", "Failed to rollback listener: " + xj8Var2, e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    tvj.i("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
                    return;
                }
                break;
            case 1:
                ((ug4) this.b).accept(obj);
                return;
            case 2:
                ((dee) this.b).b.D((Boolean) obj);
                return;
            default:
                xi0 xi0Var = (xi0) obj;
                bui buiVar = (bui) this.b;
                if (xi0Var == null) {
                    ore.p("StreamInfo can't be null");
                    return;
                }
                int i = xi0Var.a;
                if (buiVar.A == 3) {
                    return;
                }
                tvj.a("VideoCapture", "Stream info update: old: " + buiVar.w + " new: " + xi0Var);
                xi0 xi0Var2 = buiVar.w;
                buiVar.w = xi0Var;
                yi0 yi0Var = buiVar.j;
                yi0Var.getClass();
                int i2 = xi0Var2.a;
                Set set = xi0.e;
                if ((!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i)) && i2 != i) || (buiVar.E && xi0Var2.c != null && xi0Var.c == null)) {
                    buiVar.S();
                    return;
                }
                int i3 = xi0Var2.a;
                if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                    buiVar.L(buiVar.x, xi0Var, yi0Var);
                    Object[] objArr = {buiVar.x.c()};
                    ArrayList arrayList7 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList7.add(obj2);
                    buiVar.H(Collections.unmodifiableList(arrayList7));
                    buiVar.s();
                    return;
                }
                if (xi0Var2.b != xi0Var.b) {
                    buiVar.L(buiVar.x, xi0Var, yi0Var);
                    Object[] objArr2 = {buiVar.x.c()};
                    ArrayList arrayList8 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList8.add(obj3);
                    buiVar.H(Collections.unmodifiableList(arrayList8));
                    Iterator it11 = buiVar.b.iterator();
                    while (it11.hasNext()) {
                        ((bli) it11.next()).l(buiVar);
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.eqb
    public final void onError(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yg2 yg2Var = (yg2) obj;
                if (yg2Var.l.get()) {
                    tvj.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                    x70 x70Var = yg2Var.h;
                    if (x70Var != null) {
                        x70Var.f();
                    }
                    break;
                }
                break;
            case 1:
                tvj.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                break;
            case 2:
                v30 v30Var = ((dee) obj).b;
                v30Var.getClass();
                v30Var.D(new wi0(th));
                break;
            default:
                tvj.i("VideoCapture", "Receive onError from StreamState observer", th);
                break;
        }
    }
}

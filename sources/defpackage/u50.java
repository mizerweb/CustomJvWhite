package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.startup.StartupException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import one.me.chats.list.ChatsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class u50 implements s00, cbh, p7c {
    public static volatile u50 d;
    public static final Object e = new Object();
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ u50(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static u50 g(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        u50 u50Var = new u50();
                        u50Var.c = context.getApplicationContext();
                        u50Var.b = new HashSet();
                        u50Var.a = new HashMap();
                        d = u50Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // defpackage.p7c
    public void E0(CharSequence charSequence) {
        p7c p7cVar = ((kcc) ((lcc) this.c)).b;
        if (p7cVar != null) {
            p7cVar.E0(charSequence);
        }
    }

    @Override // defpackage.p7c
    public void X() {
        int iIntValue;
        int iIntValue2;
        rcc rccVar = ((ncc) this.b).a;
        rccVar.z = false;
        int iOrdinal = rccVar.getForm().ordinal();
        if (iOrdinal == 0) {
            ylc actionsHorizontalPadding = rccVar.getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal == 1) {
            ylc actionsHorizontalPadding2 = rccVar.getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        } else if (iOrdinal == 2) {
            ylc actionsHorizontalPadding3 = rccVar.getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            iIntValue = 0;
        }
        int iOrdinal2 = rccVar.getForm().ordinal();
        if (iOrdinal2 == 0) {
            ylc actionsHorizontalPadding4 = rccVar.getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal2 == 1) {
            ylc actionsHorizontalPadding5 = rccVar.getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal2 == 2) {
            ylc actionsHorizontalPadding6 = rccVar.getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        } else {
            if (iOrdinal2 != 3) {
                ore.o();
                return;
            }
            iIntValue2 = 0;
        }
        rccVar.setPadding(iIntValue, rccVar.getPaddingTop(), iIntValue2, rccVar.getPaddingBottom());
        View view = rccVar.q;
        if (view instanceof t7c) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            view.setLayoutParams(marginLayoutParams);
            View view2 = rccVar.q;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = rccVar.p;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = rccVar.r;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        View view5 = rccVar.r;
        if (view5 instanceof t7c) {
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            view5.setLayoutParams(marginLayoutParams2);
            View view6 = rccVar.p;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            View view7 = rccVar.q;
            if (view7 != null) {
                view7.setVisibility(0);
            }
        }
        rccVar.g.setVisibility(0);
        rccVar.q();
        ny8 ny8Var = rccVar.k;
        if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).setVisibility(0);
        }
        ny8 ny8Var2 = rccVar.l;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setVisibility(0);
        }
        ViewGroup viewGroup = rccVar.o;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        p7c p7cVar = ((kcc) ((lcc) this.c)).b;
        if (p7cVar != null) {
            p7cVar.X();
        }
    }

    public void a(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (gg8.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    @Override // defpackage.cbh
    public dbh b(bbh bbhVar) {
        return ((cbh) this.c).b(new bbh((Context) bbhVar.c, (String) bbhVar.d, new mu4((n31) bbhVar.e, (a1c) this.a, (sre) this.b), bbhVar.a, true));
    }

    public Object c(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.a;
        if (cqk.y()) {
            try {
                cqk.f(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                gg8 gg8Var = (gg8) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = gg8Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            c(cls2, hashSet);
                        }
                    }
                }
                objB = gg8Var.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Set set, nq4 nq4Var) {
        zy zyVar;
        List list;
        if (nq4Var instanceof zy) {
            zyVar = (zy) nq4Var;
            int i = zyVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zyVar.f = i - Integer.MIN_VALUE;
            } else {
                zyVar = new zy(this, nq4Var);
            }
        } else {
            zyVar = new zy(this, nq4Var);
        }
        Object objW0 = zyVar.d;
        Object obj = hu4.a;
        int i2 = zyVar.f;
        if (i2 == 0) {
            ch3.d0(objW0);
            uy2 uy2Var = (uy2) ((ny8) this.a).getValue();
            ni3 ni3VarE = e();
            zyVar.f = 1;
            qw2 qw2Var = (qw2) uy2Var.c.getValue();
            qw2Var.getClass();
            if (set == null || set.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                qw2Var.t();
                ConcurrentHashMap concurrentHashMap = qw2Var.i;
                Objects.requireNonNull(concurrentHashMap);
                if (set.isEmpty()) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            rt2 rt2Var = (rt2) concurrentHashMap.get((Long) it.next());
                            if (rt2Var != null) {
                                arrayList.add(rt2Var);
                            }
                        } catch (Throwable th) {
                            qr7.o(th);
                            return null;
                        }
                    }
                    list = arrayList;
                }
            }
            objW0 = yhf.w0(uy2Var.a(new sw(1, list), ni3VarE));
            if (objW0 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objW0);
                return objW0;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objW0);
        List list2 = (List) objW0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            rt2 rt2Var2 = (rt2) obj2;
            if (rt2Var2.G0() && rt2Var2.C0() && (!rt2Var2.y0() || rt2Var2.b.k != 0)) {
                arrayList2.add(obj2);
            }
        }
        if (((ki3) this.b).e().a()) {
            String strH = h();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, strH, qt4.l("getChats: before f:", list2.size(), arrayList2.size(), ", after:"), null);
                }
            }
        }
        a83 a83Var = (a83) ((ifh) this.c).getValue();
        zyVar.f = 2;
        Object objB = a83Var.b(arrayList2, false, zyVar);
        return objB == obj ? obj : objB;
    }

    public ni3 e() {
        r17 r17VarE = ((ki3) this.b).e();
        LinkedHashSet linkedHashSet = r17VarE.j;
        return r17VarE.a() ? new li3(linkedHashSet) : new mi3(r17VarE.a, r17VarE.e, r17VarE.d, r17VarE.p, r17VarE.q, r17VarE.g, new zc6(linkedHashSet));
    }

    @Override // defpackage.p7c
    public void f() {
        if (((t7c) this.a).j) {
            ((ncc) this.b).a.k();
        }
        p7c p7cVar = ((kcc) ((lcc) this.c)).b;
        if (p7cVar != null) {
            p7cVar.f();
        }
    }

    public String h() {
        return qv1.k("AsyncChatsDataSource#", ((ki3) this.b).e().a);
    }

    public ix2 i() {
        return (ix2) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s00
    public Object j(Collection collection, nq4 nq4Var) {
        az azVar;
        if (nq4Var instanceof az) {
            azVar = (az) nq4Var;
            int i = azVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                azVar.g = i - Integer.MIN_VALUE;
            } else {
                azVar = new az(this, nq4Var);
            }
        } else {
            azVar = new az(this, nq4Var);
        }
        Object obj = azVar.e;
        Object obj2 = hu4.a;
        int i2 = azVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            ki3 ki3Var = (ki3) this.b;
            azVar.d = collection;
            azVar.g = 1;
            sy4 sy4Var = (sy4) ki3Var.b;
            String str = (String) ki3Var.a;
            sy4Var.getClass();
            if (e9i.N(new jz(sy4Var.j(str), 13), azVar) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Collection collection2 = azVar.d;
            ch3.d0(obj);
            return obj;
        }
        collection = azVar.d;
        ch3.d0(obj);
        String strH = h();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strH, "getHistoryItems(ids: " + collection + ")", null);
            }
        }
        Set setX1 = ww3.X1(collection);
        azVar.d = null;
        azVar.g = 2;
        Object objD = d(setX1, azVar);
        return objD == obj2 ? obj2 : objD;
    }

    public void k(TextPaint textPaint) {
        noh nohVarG = q9i.i.g();
        Context context = ((ChatsListWidget) this.a).getContext();
        k96 k96Var = (k96) this.b;
        noh.d(nohVarG, context, textPaint, k96Var.getResources().getDisplayMetrics(), null, 8);
        textPaint.setColor(pq3.j.h(k96Var).getText().e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r1 == r4) goto L34;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(long r19, int r21, long r22, defpackage.nq4 r24) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u50.m(long, int, long, nq4):java.lang.Object");
    }

    @Override // defpackage.p7c
    public void n() {
        if (((t7c) this.a).j) {
            ((ncc) this.b).a.k();
        }
        p7c p7cVar = ((kcc) ((lcc) this.c)).b;
        if (p7cVar != null) {
            p7cVar.n();
        }
    }

    @Override // defpackage.p7c
    public void o() {
        p7c p7cVar = ((kcc) ((lcc) this.c)).b;
        if (p7cVar != null) {
            p7cVar.o();
        }
    }

    @Override // defpackage.s00
    public Object q(long j, int i, long j2, nq4 nq4Var) {
        return r66.a;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class n67 implements a89 {
    public final boolean a;
    public final ny8 b;
    public pz4 d;
    public aac e;
    public List g;
    public cf7 h;
    public qf7 i;
    public cf7 j;
    public boolean k;
    public boolean l;
    public List m;
    public final ArrayList n;
    public List o;
    public final d20 p;
    public String q;
    public final String c = n67.class.getName();
    public final b9b f = new b9b();

    public n67(boolean z, ExecutorService executorService, ny8 ny8Var) {
        this.a = z;
        this.b = ny8Var;
        r66 r66Var = r66.a;
        this.g = r66Var;
        this.n = new ArrayList();
        this.o = r66Var;
        this.p = new d20(this, new ki3(null, executorService, new m67(0)));
    }

    public static ynh c(q37 q37Var) {
        int i = q37Var.d.a;
        CharSequence charSequence = q37Var.b;
        return i > 0 ? new rnh(R.plurals.chat_list_accessibility_folders_tab_with_unread, i, a.n1(new Object[]{charSequence, Integer.valueOf(i)})) : new vnh(R.string.chat_list_accessibility_folders_tab_without_unread, a.n1(new Object[]{charSequence}));
    }

    public final qz4 a(aac aacVar, y8j y8jVar, cf7 cf7Var, qf7 qf7Var, cf7 cf7Var2) {
        this.e = aacVar;
        this.h = cf7Var;
        this.i = qf7Var;
        this.j = cf7Var2;
        pz4 pz4Var = new pz4(1, this);
        aacVar.a(pz4Var);
        this.d = pz4Var;
        return new qz4(aacVar, y8jVar, new k67(this, aacVar, 0), new k67(this, aacVar, 1));
    }

    @Override // defpackage.a89
    public final void b(int i, int i2) {
        int i3;
        int i4;
        je9 je9Var = je9.d;
        aac aacVar = this.e;
        if (aacVar == null) {
            return;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qt4.l("onInserted: pos=", i, i2, " count="), null);
        }
        h("onInserted before");
        Iterator it = this.p.f.iterator();
        int i5 = i;
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            owb owbVar = (owb) it.next();
            Iterator it2 = this.o.iterator();
            int i6 = 0;
            while (true) {
                i4 = -1;
                if (!it2.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (cqk.d(owbVar.a, ((owb) it2.next()).a)) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 < 0) {
                Iterator it3 = this.n.iterator();
                while (it3.hasNext()) {
                    if (cqk.d(owbVar.a, ((owb) it3.next()).a)) {
                        i4 = i3;
                        break;
                    }
                    i3++;
                }
                if (i4 < 0) {
                    String str2 = this.c;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "onInserted: " + i5 + " " + owbVar, null);
                    }
                    this.n.add(i5, owbVar);
                    i5++;
                }
            }
        }
        h("onInserted after");
        while (i3 < i2) {
            ugh ughVarI = aacVar.i();
            int i7 = i + i3;
            if (e(ughVarI, i7)) {
                aacVar.b(ughVarI, i7, aacVar.b.isEmpty());
            }
            i3++;
        }
        k();
    }

    @Override // defpackage.a89
    public final void d(int i, int i2) {
        aac aacVar = this.e;
        if (aacVar == null) {
            return;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qt4.l("onRemoved: pos=", i, i2, " count="), null);
            }
        }
        h("onRemoved");
        for (int i3 = 0; i3 < i2; i3++) {
            aacVar.l(i);
            this.n.remove(i);
        }
        h("onRemoved");
        k();
    }

    public final boolean e(ugh ughVar, int i) {
        View view = ughVar.b;
        z9c z9cVar = view instanceof z9c ? (z9c) view : null;
        owb owbVar = (owb) ww3.u1(i, this.n);
        final int i2 = 0;
        if (owbVar == null) {
            return false;
        }
        final int i3 = 1;
        if (z9cVar != null) {
            z9cVar.setTabItem(owbVar);
            z9cVar.setOnEndIconClickListener(new cf7(this) { // from class: l67
                public final /* synthetic */ n67 b;

                {
                    this.b = this;
                }

                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    int i4 = i2;
                    sbi sbiVar = sbi.a;
                    n67 n67Var = this.b;
                    owb owbVar2 = (owb) obj;
                    switch (i4) {
                        case 0:
                            cf7 cf7Var = n67Var.j;
                            if (cf7Var != null) {
                                cf7Var.invoke(owbVar2.a);
                            }
                            break;
                        default:
                            cf7 cf7Var2 = n67Var.j;
                            if (cf7Var2 != null) {
                                cf7Var2.invoke(owbVar2.a);
                            }
                            break;
                    }
                    return sbiVar;
                }
            });
            return true;
        }
        aac aacVar = this.e;
        if (aacVar == null) {
            ore.p("Required value was null.");
            return false;
        }
        z9c z9cVar2 = new z9c(aacVar.getContext());
        z9cVar2.setIndicatorVisible(this.a);
        z9cVar2.setTabItem(owbVar);
        z9cVar2.setOnEndIconClickListener(new cf7(this) { // from class: l67
            public final /* synthetic */ n67 b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i4 = i3;
                sbi sbiVar = sbi.a;
                n67 n67Var = this.b;
                owb owbVar2 = (owb) obj;
                switch (i4) {
                    case 0:
                        cf7 cf7Var = n67Var.j;
                        if (cf7Var != null) {
                            cf7Var.invoke(owbVar2.a);
                        }
                        break;
                    default:
                        cf7 cf7Var2 = n67Var.j;
                        if (cf7Var2 != null) {
                            cf7Var2.invoke(owbVar2.a);
                        }
                        break;
                }
                return sbiVar;
            }
        });
        ughVar.d.setId(View.generateViewId());
        ughVar.b(z9cVar2);
        ughVar.d.setOnLongClickListener(new rg3(this, z9cVar2, owbVar, 3));
        int iK = gm0.K(13.0f * yl5.d().getDisplayMetrics().density);
        wgh wghVar = ughVar.d;
        wghVar.setPadding(iK, wghVar.getPaddingTop(), iK, wghVar.getPaddingBottom());
        return true;
    }

    @Override // defpackage.a89
    public final void f(int i, int i2, Object obj) {
        aac aacVar = this.e;
        if (aacVar == null) {
            return;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                Object objU1 = ww3.u1(i, this.p.f);
                StringBuilder sbP = qv1.p("onChanged: pos=", i, " count=", i2, " payload=");
                sbP.append(obj);
                sbP.append(" model=");
                sbP.append(objU1);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            ugh ughVarH = aacVar.h(i);
            if (ughVarH != null) {
                owb owbVar = (owb) ww3.u1(i, this.n);
                if (owbVar == null) {
                    owbVar = (owb) this.p.f.get(i);
                }
                View view = ughVarH.b;
                z9c z9cVar = view instanceof z9c ? (z9c) view : null;
                if (z9cVar != null) {
                    z9cVar.setTabItem(owbVar);
                }
                if (((Boolean) this.b.getValue()).booleanValue()) {
                    this.n.set(i, owbVar);
                }
            }
            i++;
        }
        k();
    }

    @Override // defpackage.a89
    public final void g(int i, int i2) {
        aac aacVar = this.e;
        if (aacVar == null) {
            return;
        }
        owb owbVar = (owb) this.n.remove(i);
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbP = qv1.p("onMoved: from=", i, " to=", i2, " model=");
                sbP.append(owbVar);
                a4cVar.c(je9Var, str, sbP.toString(), null);
            }
        }
        h("onMoved");
        this.n.add(i2, owbVar);
        h("onMoved");
        aacVar.l(i);
        ugh ughVarI = aacVar.i();
        if (e(ughVarI, i2)) {
            aacVar.b(ughVarI, i2, aacVar.b.isEmpty());
        }
        k();
    }

    public final void h(String str) {
        je9 je9Var = je9.d;
        if (this.n.isEmpty()) {
            String str2 = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, str.concat(": RenderTabs are empty!"), null);
                return;
            }
            return;
        }
        for (owb owbVar : this.n) {
            String str3 = this.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, str + ": " + owbVar, null);
            }
        }
    }

    public final boolean i(q37 q37Var) {
        return (!this.k || cqk.d(q37Var.a, "all.chat.folder") || q37Var.e.contains(s37.NO_DELETE)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d20] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Runnable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a4c] */
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
    public final void j(List list) throws Throwable {
        boolean zI;
        sb8 lwbVar;
        ?? Mutate;
        aac aacVar;
        Context context;
        Drawable drawableO;
        boolean zO0;
        aac aacVar2;
        Context context2;
        Drawable drawableO2;
        nwb nwbVar = nwb.l;
        this.g = list;
        if (this.l) {
            return;
        }
        Throwable th = null;
        if (list.isEmpty()) {
            this.p.b(null, null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        boolean z = true;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                Throwable th2 = th;
                xw3.V0();
                throw th2;
            }
            q37 q37Var = (q37) obj;
            String str = this.q;
            boolean zD = (str == null && i == 0) ? true : cqk.d(str, q37Var.a);
            if (zD) {
                z = false;
            }
            b9b b9bVar = this.f;
            String str2 = q37Var.a;
            Object objD = b9bVar.d(str2);
            if (objD == null) {
                objD = new owb(q37Var.a, q37Var.b, zD ? 1 : 2, !i(q37Var) ? new lwb(q37Var.d.a) : nwbVar, null, (!i(q37Var) || (aacVar2 = this.e) == null || (context2 = aacVar2.getContext()) == null || (drawableO2 = wk8.o(context2, R.drawable.icon_cross_round_fill_mini_color)) == null) ? th : drawableO2.mutate(), c(q37Var));
                b9bVar.o(str2, objD);
            } else {
                th = th;
            }
            owb owbVarA = (owb) objD;
            int i3 = zD ? 1 : 2;
            sb8 sb8Var = owbVarA.d;
            if (owbVarA.c == i3 && (sb8Var instanceof lwb) && ((lwb) sb8Var).l == q37Var.d.a) {
                CharSequence charSequence = owbVarA.b;
                CharSequence charSequence2 = q37Var.b;
                if (!z5h.E0(charSequence, charSequence2)) {
                    zO0 = false;
                } else if ((charSequence instanceof Spanned) && (charSequence2 instanceof Spanned)) {
                    Spanned spanned = (Spanned) charSequence;
                    Spanned spanned2 = (Spanned) charSequence2;
                    zO0 = a.O0(spanned.getSpans(0, spanned.length(), Object.class), spanned2.getSpans(0, spanned2.length(), Object.class));
                } else {
                    zO0 = true;
                }
                if (!zO0) {
                    zI = i(q37Var);
                    CharSequence charSequence3 = q37Var.b;
                    if (zI) {
                        lwbVar = new lwb(q37Var.d.a);
                    } else {
                        lwbVar = nwbVar;
                    }
                    if (i(q37Var)) {
                        Mutate = th;
                    } else {
                        Mutate = th;
                    }
                    owbVarA = owb.a(owbVarA, charSequence3, i3, lwbVar, Mutate, c(q37Var), 17);
                } else if ((owbVarA.f != null) != i(q37Var)) {
                    zI = i(q37Var);
                    CharSequence charSequence4 = q37Var.b;
                    if (zI) {
                        lwbVar = nwbVar;
                    } else {
                        lwbVar = new lwb(q37Var.d.a);
                    }
                    if (i(q37Var)) {
                        Mutate = th;
                    } else {
                        Mutate = th;
                    }
                    owbVarA = owb.a(owbVarA, charSequence4, i3, lwbVar, Mutate, c(q37Var), 17);
                }
            } else {
                zI = i(q37Var);
                CharSequence charSequence5 = q37Var.b;
                if (zI) {
                    lwbVar = new lwb(q37Var.d.a);
                } else {
                    lwbVar = nwbVar;
                }
                if (i(q37Var) || (aacVar = this.e) == null || (context = aacVar.getContext()) == null || (drawableO = wk8.o(context, R.drawable.icon_cross_round_fill_mini_color)) == null) {
                    Mutate = th;
                } else {
                    Mutate = drawableO.mutate();
                }
                owbVarA = owb.a(owbVarA, charSequence5, i3, lwbVar, Mutate, c(q37Var), 17);
            }
            this.f.o(q37Var.a, owbVarA);
            ArrayList arrayList2 = this.n;
            Iterator it = arrayList2.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (cqk.d(((owb) it.next()).a, owbVarA.a)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 > -1) {
                arrayList2.set(i4, owbVarA);
            }
            arrayList.add(owbVarA);
            i = i2;
            th = th;
        }
        ?? r25 = th;
        if (z) {
            owb owbVarA2 = owb.a((owb) arrayList.get(0), null, 1, null, null, null, 123);
            this.q = owbVarA2.a;
            arrayList.set(0, owbVarA2);
        }
        if (this.e != null) {
            this.o = ww3.T1(this.p.f);
            this.p.b(arrayList, r25);
            return;
        }
        this.m = arrayList;
        String str3 = this.c;
        ?? r2 = gm0.f;
        if (r2 == 0) {
            return;
        }
        je9 je9Var = je9.d;
        if (r2.b(je9Var)) {
            List list2 = this.m;
            r2.c(je9Var, str3, qv1.j("Layout is null, added pending tabs size=", list2 != null ? Integer.valueOf(list2.size()) : r25), r25);
        }
    }

    public final void k() {
        aac aacVar = this.e;
        if (aacVar == null) {
            return;
        }
        int tabCount = aacVar.getTabCount();
        d20 d20Var = this.p;
        if (d20Var.f.isEmpty() || tabCount == 0) {
            return;
        }
        int i = tabCount - 1;
        Iterator it = d20Var.f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((owb) it.next()).c == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 <= i) {
            i = i2;
        }
        if (i < 0 || i == aacVar.getSelectedTabPosition()) {
            return;
        }
        aacVar.n(aacVar.h(i), true);
    }
}

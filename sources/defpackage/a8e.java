package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a8e extends a8j {
    public final i6e c;
    public final Context d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ifh j;
    public final wme l;
    public final pzf n;
    public final q8e o;
    public final mjg p;
    public sgg q;
    public final boolean k = true;
    public final m8b m = new m8b();

    public a8e(i6e i6eVar, Context context, ny8 ny8Var, final ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, final ny8 ny8Var5) {
        this.c = i6eVar;
        this.d = context;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var;
        final int i = 0;
        this.j = new ifh(new af7(this) { // from class: w7e
            public final /* synthetic */ a8e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                List listK;
                int i2 = i;
                ny8 ny8Var6 = ny8Var2;
                a8e a8eVar = this.b;
                switch (i2) {
                    case 0:
                        return new xed("reactions", a8eVar.b, ((w95) ny8Var6.getValue()).a.R0(1, "reactions"), new voc(a8eVar, null, 22));
                    default:
                        ax2 ax2VarI = a8eVar.I();
                        ny8 ny8Var7 = a8eVar.h;
                        if (ax2VarI == null) {
                            listK = ((xm) ny8Var7.getValue()).k();
                        } else {
                            List listK2 = ((xm) ny8Var7.getValue()).k();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listK2) {
                                jl jlVar = (jl) obj;
                                boolean z = ax2VarI.e;
                                List list = ax2VarI.f;
                                if (z) {
                                    if (list != null && list.contains(jlVar.b)) {
                                        arrayList.add(obj);
                                    }
                                } else if (list != null && !list.contains(jlVar.b)) {
                                    arrayList.add(obj);
                                }
                            }
                            listK = arrayList;
                        }
                        List<jl> list2 = listK;
                        ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                        for (jl jlVar2 : list2) {
                            s5e s5eVarC = ((lja) a8eVar.g.getValue()).c(jlVar2.b, gm0.K(a8eVar.c.a() * yl5.d().getDisplayMetrics().density), ((xm) ny8Var6.getValue()).h(jlVar2.a));
                            arrayList2.add(new g6e(jlVar2.a, s5eVarC, a8e.F(s5eVarC), false));
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.l = new wme(new af7(this) { // from class: w7e
            public final /* synthetic */ a8e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                List listK;
                int i3 = i2;
                ny8 ny8Var6 = ny8Var5;
                a8e a8eVar = this.b;
                switch (i3) {
                    case 0:
                        return new xed("reactions", a8eVar.b, ((w95) ny8Var6.getValue()).a.R0(1, "reactions"), new voc(a8eVar, null, 22));
                    default:
                        ax2 ax2VarI = a8eVar.I();
                        ny8 ny8Var7 = a8eVar.h;
                        if (ax2VarI == null) {
                            listK = ((xm) ny8Var7.getValue()).k();
                        } else {
                            List listK2 = ((xm) ny8Var7.getValue()).k();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : listK2) {
                                jl jlVar = (jl) obj;
                                boolean z = ax2VarI.e;
                                List list = ax2VarI.f;
                                if (z) {
                                    if (list != null && list.contains(jlVar.b)) {
                                        arrayList.add(obj);
                                    }
                                } else if (list != null && !list.contains(jlVar.b)) {
                                    arrayList.add(obj);
                                }
                            }
                            listK = arrayList;
                        }
                        List<jl> list2 = listK;
                        ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                        for (jl jlVar2 : list2) {
                            s5e s5eVarC = ((lja) a8eVar.g.getValue()).c(jlVar2.b, gm0.K(a8eVar.c.a() * yl5.d().getDisplayMetrics().density), ((xm) ny8Var6.getValue()).h(jlVar2.a));
                            arrayList2.add(new g6e(jlVar2.a, s5eVarC, a8e.F(s5eVarC), false));
                        }
                        return arrayList2;
                }
            }
        });
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.n = pzfVarB;
        this.o = new q8e(pzfVarB);
        this.p = p90.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(a8e a8eVar, x7e x7eVar, nq4 nq4Var) {
        z7e z7eVar;
        x7e x7eVar2;
        s5e s5eVar;
        if (nq4Var instanceof z7e) {
            z7eVar = (z7e) nq4Var;
            int i = z7eVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                z7eVar.h = i - Integer.MIN_VALUE;
            } else {
                z7eVar = new z7e(a8eVar, nq4Var);
            }
        } else {
            z7eVar = new z7e(a8eVar, nq4Var);
        }
        Object obj = z7eVar.f;
        int i2 = z7eVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            kja kjaVar = x7eVar.d;
            s5e s5eVar2 = x7eVar.a;
            z5e z5eVar = kjaVar != null ? kjaVar.c : null;
            if (kjaVar == null || z5eVar == null || !cqk.d(z5eVar.b, s5eVar2)) {
                z7eVar.d = x7eVar;
                z7eVar.e = s5eVar2;
                z7eVar.h = 2;
                if (a8eVar.Q(x7eVar, s5eVar2) != hu4Var) {
                    x7eVar2 = x7eVar;
                    s5eVar = s5eVar2;
                }
            } else {
                z7eVar.d = null;
                z7eVar.e = null;
                z7eVar.h = 1;
                if (a8eVar.D(x7eVar, z5eVar, z7eVar) != hu4Var) {
                    return sbiVar;
                }
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        s5eVar = z7eVar.e;
        x7eVar2 = z7eVar.d;
        ch3.d0(obj);
        String strI = ((xm) a8eVar.h.getValue()).i(s5eVar.a.toString());
        if (strI != null) {
            pzf pzfVar = a8eVar.n;
            q6e q6eVar = new q6e(x7eVar2.b, x7eVar2.a, strI);
            z7eVar.d = null;
            z7eVar.e = null;
            z7eVar.h = 3;
            if (pzfVar.emit(q6eVar, z7eVar) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public static Drawable F(s5e s5eVar) {
        Object[] spans;
        geg gegVar;
        CharSequence charSequence = s5eVar.a;
        int length = charSequence.length();
        try {
            Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            spans = spanned != null ? spanned.getSpans(0, length, geg.class) : null;
        } catch (Throwable unused) {
        }
        geg[] gegVarArr = (geg[]) spans;
        if (gegVarArr == null || (gegVar = (geg) a.b1(gegVarArr)) == null) {
            return null;
        }
        return gegVar.b();
    }

    public static /* synthetic */ List L(a8e a8eVar, kja kjaVar, boolean z, int i) {
        boolean z2 = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = false;
        }
        return a8eVar.K(kjaVar, z2, z);
    }

    public final void C() {
        sgg sggVar = this.q;
        if (sggVar != null && sggVar.isActive()) {
            gm0.Y(M(), "cancelChatSubscribeNotifObserving already running");
        } else {
            gm0.n(M(), "cancelChatSubscribeNotifObserving");
            this.q = yab.i0((ite) this.i.getValue(), ((w95) this.e.getValue()).a, 0, new l0d(this, (lq4) null, 27), 2);
        }
    }

    public abstract Object D(x7e x7eVar, z5e z5eVar, z7e z7eVar);

    public final void E() {
        jz jzVar = new jz(this.p, 13);
        ghb ghbVar = ew5.b;
        e9i.j0(e9i.T(new fz6(new ra1(16, oc9.e0(jzVar, qe7.P(300L, lw5.MILLISECONDS))), new l0d(this, (lq4) null, 28), 3), ((w95) this.e.getValue()).a), this.b);
    }

    public boolean G() {
        return this.k;
    }

    public abstract boolean H();

    public abstract ax2 I();

    public abstract int J();

    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:78:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
    public final List K(kja kjaVar, boolean z, boolean z2) {
        List list;
        int i;
        boolean z3;
        int size;
        g6e g6eVar;
        s5e s5eVar;
        s5e s5eVar2;
        z5e z5eVar;
        s5e s5eVar3;
        z5e z5eVar2;
        boolean z4;
        Object next;
        if (J() == 0 || !G()) {
            return r66.a;
        }
        c79 c79VarW = yab.w();
        wme wmeVar = this.l;
        if (((List) wmeVar.getValue()).isEmpty()) {
            wmeVar.a();
        }
        Context context = this.d;
        int i2 = 0;
        f6e f6eVar = f6e.a;
        if (kjaVar != null) {
            List list2 = kjaVar.a;
            if (list2.size() < J()) {
                list = (List) wmeVar.getValue();
                if (!list.isEmpty()) {
                    i = yl5.e(context) ? 7 : 8;
                    if (z || list.size() <= i) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 && z2) {
                        c79VarW.add(f6eVar);
                    }
                    size = list.size();
                    while (i2 < size) {
                        g6eVar = (g6e) list.get(i2);
                        if (i2 != i - 1 && z3) {
                            if (!z2) {
                                c79VarW.add(f6eVar);
                                break;
                            }
                            break;
                        }
                        s5eVar = g6eVar.b;
                        if (kjaVar != null || (z5eVar2 = kjaVar.c) == null) {
                            s5eVar2 = null;
                        } else {
                            s5eVar2 = z5eVar2.b;
                        }
                        if (cqk.d(s5eVar, s5eVar2)) {
                            long j = g6eVar.a;
                            s5e s5eVar4 = g6eVar.b;
                            Drawable drawable = g6eVar.c;
                            z5eVar = kjaVar.c;
                            if (z5eVar != null) {
                                s5eVar3 = z5eVar.b;
                            } else {
                                s5eVar3 = null;
                            }
                            c79VarW.add(new g6e(j, s5eVar4, drawable, cqk.d(s5eVar4, s5eVar3)));
                        } else {
                            c79VarW.add(g6eVar);
                        }
                        i2++;
                    }
                } else {
                    gm0.Y(c79.class.getName(), "Default reactions is empty");
                }
            } else {
                i = yl5.e(context) ? 7 : 8;
                boolean z5 = z && list2.size() > i;
                if (z5 && z2) {
                    c79VarW.add(f6eVar);
                }
                z5e z5eVar3 = kjaVar.c;
                int size2 = list2.size();
                int i3 = 0;
                while (i2 < size2) {
                    jja jjaVar = (jja) list2.get(i2);
                    List list3 = (List) wmeVar.getValue();
                    if (list3.isEmpty()) {
                        gm0.Y(c79.class.getName(), "Default reactions is empty");
                    }
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = z5;
                            next = null;
                            break;
                        }
                        next = it.next();
                        z4 = z5;
                        if (cqk.d(((g6e) next).b, jjaVar.a.b)) {
                            break;
                        }
                        z5 = z4;
                    }
                    g6e g6eVar2 = (g6e) next;
                    if (i2 == i - 1 && z4) {
                        if (!z2) {
                            c79VarW.add(f6eVar);
                            break;
                        }
                        break;
                    }
                    if (g6eVar2 == null) {
                        s5e s5eVar5 = jjaVar.a.b;
                        c79VarW.add(new g6e(((long) i3) - Long.MIN_VALUE, s5eVar5, F(s5eVar5), s5eVar5.equals(z5eVar3 != null ? z5eVar3.b : null)));
                        i3++;
                    } else {
                        if (cqk.d(g6eVar2.b, z5eVar3 != null ? z5eVar3.b : null)) {
                            long j2 = g6eVar2.a;
                            s5e s5eVar6 = g6eVar2.b;
                            c79VarW.add(new g6e(j2, s5eVar6, g6eVar2.c, cqk.d(s5eVar6, z5eVar3 != null ? z5eVar3.b : null)));
                        } else {
                            c79VarW.add(g6eVar2);
                        }
                    }
                    i2++;
                    z5 = z4;
                }
            }
        } else {
            list = (List) wmeVar.getValue();
            if (!list.isEmpty()) {
                gm0.Y(c79.class.getName(), "Default reactions is empty");
            } else {
                if (yl5.e(context)) {
                }
                if (z) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z3) {
                    c79VarW.add(f6eVar);
                }
                size = list.size();
                while (i2 < size) {
                    g6eVar = (g6e) list.get(i2);
                    if (i2 != i - 1) {
                    }
                    s5eVar = g6eVar.b;
                    if (kjaVar != null) {
                        s5eVar2 = null;
                    } else {
                        s5eVar2 = null;
                    }
                    if (cqk.d(s5eVar, s5eVar2)) {
                        long j3 = g6eVar.a;
                        s5e s5eVar7 = g6eVar.b;
                        Drawable drawable2 = g6eVar.c;
                        z5eVar = kjaVar.c;
                        if (z5eVar != null) {
                            s5eVar3 = z5eVar.b;
                        } else {
                            s5eVar3 = null;
                        }
                        c79VarW.add(new g6e(j3, s5eVar7, drawable2, cqk.d(s5eVar7, s5eVar3)));
                    } else {
                        c79VarW.add(g6eVar);
                    }
                    i2++;
                }
            }
        }
        return yab.j(c79VarW);
    }

    public abstract String M();

    public abstract boolean N();

    public final boolean O(xfa xfaVar) {
        return N() && (xfaVar != null && xfaVar != xfa.ERROR && xfaVar != xfa.SENDING && xfaVar != xfa.UNKNOWN) && !H();
    }

    public abstract Object P(Set set, voc vocVar);

    public abstract sbi Q(x7e x7eVar, s5e s5eVar);

    public abstract Object R(ur8 ur8Var);

    public abstract Object S(l0d l0dVar);

    public final void T(x7e x7eVar) {
        if (G() && N()) {
            if (r5h.X0(x7eVar.a)) {
                gm0.Y("sdk:ReactionsViewModel", "updateSelfReaction: reaction is blank!");
                return;
            }
            if (this.m.d(x7eVar.c)) {
                return;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    s5e s5eVar = x7eVar.a;
                    a4cVar.c(je9Var, "sdk:ReactionsViewModel", "updateSelfReaction: " + ((Object) s5eVar) + " for " + x7eVar.b, null);
                }
            }
            mjg mjgVar = this.p;
            ec6 ec6Var = new ec6(x7eVar);
            mjgVar.getClass();
            mjgVar.j(null, ec6Var);
        }
    }

    @Override // defpackage.a8j
    public void y() {
        gm0.n("sdk:ReactionsViewModel", "onCleared");
        C();
    }
}

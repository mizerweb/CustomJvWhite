package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vzg {
    public final wmi a;
    public final aj5 b;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final mjg h;
    public final r8e i;
    public final r8e j;
    public final pzf k;
    public sgg l;
    public final String c = vzg.class.getName();
    public final AtomicReference g = new AtomicReference("0");

    public vzg(wmi wmiVar, aj5 aj5Var, erg ergVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        Object obj;
        this.a = wmiVar;
        this.b = aj5Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        lq4 lq4Var = null;
        int i = 3;
        r07 r07Var = new r07(aj5Var.g, ergVar.f, new q67(this, lq4Var, i), 0);
        long jT = ((s7f) ((et3) ny8Var3.getValue())).t();
        ozg ozgVarC = c(jT);
        if (ozgVarC == null) {
            obj = s66.a;
        } else {
            ylc[] ylcVarArr = {new ylc(Long.valueOf(jT), ozgVarC)};
            LinkedHashMap linkedHashMap = new LinkedHashMap(wm9.P0(1));
            wm9.U0(linkedHashMap, ylcVarArr);
            obj = linkedHashMap;
        }
        this.j = e9i.G0(r07Var, wmiVar, j0g.a, obj);
        pzf pzfVarB = e9i.b(0, 0, 7);
        this.k = pzfVarB;
        tre.m0(new fz6(pzfVarB, new bp(2, this, vzg.class, "handleEvent", "handleEvent(Lone/me/stories/core/loaders/StoryPreviewsLoader$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10), i), wmiVar);
        tre.m0(new fz6(new wz(new q8e(((ij4) ny8Var.getValue()).c), 4), new ai8(this, lq4Var, 27), i), wmiVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        if (defpackage.vd7.e(r15, r3) == r4) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.vzg r13, defpackage.rzg r14, defpackage.lq4 r15) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzg.a(vzg, rzg, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object b(vzg vzgVar, int i, nq4 nq4Var) {
        tzg tzgVar;
        String str;
        int i2 = i;
        vzgVar.getClass();
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.e;
        if (nq4Var instanceof tzg) {
            tzgVar = (tzg) nq4Var;
            int i3 = tzgVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tzgVar.h = i3 - Integer.MIN_VALUE;
            } else {
                tzgVar = new tzg(vzgVar, nq4Var);
            }
        } else {
            tzgVar = new tzg(vzgVar, nq4Var);
        }
        Object obj = tzgVar.f;
        hu4 hu4Var = hu4.a;
        int i4 = tzgVar.h;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                String str2 = (String) vzgVar.g.get();
                if (str2 == null) {
                    str2 = "0";
                }
                mjg mjgVar = vzgVar.h;
                Boolean bool = Boolean.TRUE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                String str3 = vzgVar.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str3, "loadPreviews: load story preview with cursor = " + str2 + ", count = " + i2, null);
                }
                aj5 aj5Var = vzgVar.b;
                boolean zEquals = str2.equals("0");
                tzgVar.e = str2;
                tzgVar.d = i2;
                tzgVar.h = 1;
                Object objK = aj5Var.k(str2, i2, zEquals, tzgVar);
                if (objK == hu4Var) {
                    return hu4Var;
                }
                str = str2;
                obj = objK;
            } else {
                if (i4 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = tzgVar.d;
                str = tzgVar.e;
                try {
                    ch3.d0(obj);
                } catch (Throwable th) {
                    mjg mjgVar2 = vzgVar.h;
                    Boolean bool2 = Boolean.FALSE;
                    mjgVar2.getClass();
                    mjgVar2.j(null, bool2);
                    throw th;
                }
            }
            vd7.q(tzgVar.getContext());
            vzgVar.g.set(((fzg) obj).b);
            String str4 = vzgVar.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str4, "load story preview with cursor = " + str + ", count = " + i2 + " was completed", null);
            }
        } catch (CancellationException e) {
            String str5 = vzgVar.c;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str5, "loadPreviews: load was cancelled. Cause = " + e.getMessage(), null);
            }
            throw e;
        } catch (Throwable th2) {
            String str6 = vzgVar.c;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str6, "loadPreviews: The loading was failed. Cursor = " + vzgVar.g + ", exception = " + th2.getMessage(), th2);
            }
        }
        mjg mjgVar3 = vzgVar.h;
        Boolean bool3 = Boolean.FALSE;
        mjgVar3.getClass();
        mjgVar3.j(null, bool3);
        return sbi.a;
    }

    public static ozg e(ozg ozgVar, long j, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hyg) next).b.a() != j);
        hyg hygVar = (hyg) next;
        if ((hygVar != null ? hygVar.k : 0) == 0) {
            return ozgVar.f != 2 ? ozg.a(ozgVar, (short) 0, (short) 0, 2, 31) : ozgVar;
        }
        int iD = qt4.D(hygVar.k);
        int i = 1;
        if (iD != 0 && iD != 1) {
            if (iD != 2) {
                ore.o();
                return null;
            }
            i = 3;
        }
        return ozg.a(ozgVar, (short) 0, (short) 0, i, 31);
    }

    public final ozg c(long j) {
        vg4 vg4Var = (vg4) ((no4) this.f.getValue()).j(j).a.getValue();
        if (vg4Var != null && !f55.q(vg4Var)) {
            return new ozg(vg4Var, new zyg(j), (short) 0, (short) 0, 0L, 2);
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "We couldn't extract self contact from cache", null);
            }
        }
        return null;
    }

    public final boolean d() {
        CharSequence charSequence = (CharSequence) this.g.get();
        return !(charSequence == null || charSequence.length() == 0);
    }
}

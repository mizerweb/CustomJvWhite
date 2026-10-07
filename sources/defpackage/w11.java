package defpackage;

import android.content.Context;
import com.vk.push.core.base.AidlException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class w11 extends a8j {
    public static final /* synthetic */ zv8[] B = {new z8b(w11.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, w11.class, "timerJob", "getTimerJob()Lkotlinx/coroutines/Job;"), new z8b(w11.class, "loadMoreViewsJob", "getLoadMoreViewsJob()Lkotlinx/coroutines/Job;"), new z8b(w11.class, "loadMoreReactionsJob", "getLoadMoreReactionsJob()Lkotlinx/coroutines/Job;")};
    public Long A;
    public final String c = w11.class.getName();
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final mjg i;
    public final mjg j;
    public final mjg k;
    public final mjg l;
    public final r8e m;
    public final ic6 n;
    public final ic6 o;
    public final mjg p;
    public final r8e q;
    public final mjg r;
    public final r8e s;
    public final mjg t;
    public final r8e u;
    public final p3c v;
    public final p3c w;
    public final p3c x;
    public final p3c y;
    public final p2h z;

    public w11(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.d = ny8Var6;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var;
        mjg mjgVarA = p90.a(new hwg(null, null));
        this.i = mjgVarA;
        mjg mjgVarA2 = p90.a(null);
        this.j = mjgVarA2;
        mjg mjgVarA3 = p90.a(Boolean.FALSE);
        this.k = mjgVarA3;
        mjg mjgVarA4 = p90.a(c21.a);
        this.l = mjgVarA4;
        this.m = new r8e(mjgVarA4);
        this.n = new ic6(null);
        this.o = new ic6(null);
        r66 r66Var = r66.a;
        mjg mjgVarA5 = p90.a(r66Var);
        this.p = mjgVarA5;
        this.q = new r8e(mjgVarA5);
        mjg mjgVarA6 = p90.a(new k7e(r66Var, 1, false));
        this.r = mjgVarA6;
        this.s = new r8e(mjgVarA6);
        mjg mjgVarA7 = p90.a(r66Var);
        this.t = mjgVarA7;
        this.u = new r8e(mjgVarA7);
        this.v = qyj.S();
        this.w = qyj.S();
        this.x = qyj.S();
        this.y = qyj.S();
        this.z = new p2h((aj5) ny8Var2.getValue());
        e9i.j0(e9i.C(mjgVarA, mjgVarA2, mjgVarA3, new r11(this, null)), this.b);
        e9i.j0(e9i.C(mjgVarA, mjgVarA5, mjgVarA6, new s11(this, null)), this.b);
    }

    public static final owb B(w11 w11Var, String str, int i, int i2) {
        return new owb(str, String.valueOf(i), 2, null, ((Context) w11Var.h.getValue()).getDrawable(i2), AidlException.SDK_IS_NOT_INITIALIZED);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object C(w11 w11Var, long j, nq4 nq4Var) {
        t11 t11Var;
        mjg mjgVar = w11Var.k;
        if (nq4Var instanceof t11) {
            t11Var = (t11) nq4Var;
            int i = t11Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t11Var.f = i - Integer.MIN_VALUE;
            } else {
                t11Var = new t11(w11Var, nq4Var);
            }
        } else {
            t11Var = new t11(w11Var, nq4Var);
        }
        Object objK = t11Var.d;
        int i2 = t11Var.f;
        sbi sbiVar = sbi.a;
        try {
            if (i2 == 0) {
                ch3.d0(objK);
                Boolean bool = Boolean.FALSE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                p2h p2hVar = w11Var.z;
                t11Var.f = 1;
                p2hVar.getClass();
                objK = cqk.k(new l2h(p2hVar, j, null), t11Var);
                hu4 hu4Var = hu4.a;
                if (objK == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objK);
            }
            j2h j2hVar = (j2h) objK;
            if (j2hVar != null) {
                q2h q2hVar = j2hVar.a;
                mjg mjgVar2 = w11Var.i;
                hwg hwgVar = new hwg(new Integer(q2hVar.a), new Integer(q2hVar.b));
                mjgVar2.getClass();
                mjgVar2.j(null, hwgVar);
                mjg mjgVar3 = w11Var.p;
                u8b u8bVar = j2hVar.b;
                ArrayList arrayList = new ArrayList(u8bVar.b);
                Object[] objArr = u8bVar.a;
                int i3 = u8bVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(D(w11Var, (l3h) objArr[i4]));
                }
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                mjgVar3.getClass();
                mjgVar3.j(null, listUnmodifiableList);
                u8b u8bVar2 = j2hVar.c;
                if (u8bVar2 != null) {
                    mjg mjgVar4 = w11Var.r;
                    ArrayList arrayList2 = new ArrayList(u8bVar2.b);
                    Object[] objArr2 = u8bVar2.a;
                    int i5 = u8bVar2.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        arrayList2.add(D(w11Var, (l3h) objArr2[i6]));
                    }
                    k7e k7eVar = new k7e(Collections.unmodifiableList(arrayList2), 2, true);
                    mjgVar4.getClass();
                    mjgVar4.j(null, k7eVar);
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(w11Var.c, "loadStats failed", th);
            Boolean bool2 = Boolean.TRUE;
            mjgVar.getClass();
            mjgVar.j(null, bool2);
            return sbiVar;
        }
    }

    public static final k3h D(w11 w11Var, l3h l3hVar) {
        w11Var.getClass();
        long jV = l3hVar.a.v();
        vg4 vg4Var = l3hVar.a;
        CharSequence charSequenceT = vg4Var.t((p4c) w11Var.f.getValue());
        if (charSequenceT == null) {
            charSequenceT = "";
        }
        String strX = vg4Var.x(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        String string = (strX != null ? strX : "").toString();
        k1h k1hVar = l3hVar.b;
        kfg kfgVarC = null;
        if (k1hVar != null && (k1hVar instanceof i1h)) {
            kfgVarC = ((f66) w11Var.d.getValue()).c(((i1h) k1hVar).a);
        }
        return new k3h(jV, charSequenceT, string, kfgVarC);
    }
}

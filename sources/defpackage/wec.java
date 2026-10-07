package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class wec {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final u1i d;
    public final String e = wec.class.getName();
    public final ny8 f;
    public int g;
    public final ifh h;

    public wec(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, u1i u1iVar) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = u1iVar;
        this.f = ny8Var4;
        this.h = new ifh(new wre(context, ny8Var5, ny8Var6, 27));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(wec wecVar, wzh wzhVar, zui zuiVar, nq4 nq4Var) {
        rec recVar;
        if (nq4Var instanceof rec) {
            recVar = (rec) nq4Var;
            int i = recVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                recVar.f = i - Integer.MIN_VALUE;
            } else {
                recVar = new rec(wecVar, nq4Var);
            }
        } else {
            recVar = new rec(wecVar, nq4Var);
        }
        Object obj = recVar.d;
        int i2 = recVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            u1i u1iVar = wecVar.d;
            int i3 = wzhVar.a;
            int i4 = wzhVar.b;
            int i5 = wzhVar.c;
            long j = wzhVar.d;
            long j2 = wzhVar.f;
            long j3 = wzhVar.e;
            String str = wzhVar.g;
            if (str == null) {
                str = "";
            }
            vzh vzhVar = new vzh(i3, i4, i5, j, j2, j3, str);
            recVar.f = 1;
            Object objE = u1iVar.e(zuiVar, vzhVar, recVar);
            hu4 hu4Var = hu4.a;
            return objE == hu4Var ? hu4Var : objE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.r(wecVar.e, "Failed to persist video conversion", th);
            return Boolean.FALSE;
        }
    }

    public static final void b(wec wecVar, iji ijiVar, uhi uhiVar) {
        if (ijiVar.equals(hji.a)) {
            uhi.a(uhiVar, 0L, 0.0f, null, 24);
            return;
        }
        if (ijiVar instanceof gji) {
            gji gjiVar = (gji) ijiVar;
            long j = gjiVar.b;
            Thread threadCurrentThread = Thread.currentThread();
            long j2 = gjiVar.b;
            uhi.a(uhiVar, j, j2 == 0 ? 0.0f : gjiVar.a / j2, threadCurrentThread, 12);
            return;
        }
        if ((ijiVar instanceof eji) || ijiVar.equals(dji.a) || (ijiVar instanceof fji)) {
            uhi.a(uhiVar, 0L, 0.0f, null, 22);
        } else {
            ore.o();
        }
    }
}

package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class im0 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public boolean f;
    public int g;
    public final /* synthetic */ boolean h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(nbc nbcVar, boolean z, nm0 nm0Var, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = nbcVar;
        this.f = z;
        this.k = nm0Var;
        this.h = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                return new im0((nbc) this.j, this.f, (nm0) obj2, this.h, lq4Var);
            default:
                im0 im0Var = new im0((xd3) obj2, this.h, lq4Var);
                im0Var.j = obj;
                return im0Var;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((im0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        hm0 hm0VarK;
        Object poeVar;
        xd3 xd3Var;
        int i = this.e;
        boolean z = this.h;
        Object obj2 = this.k;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        int i2 = 1;
        switch (i) {
            case 0:
                nm0 nm0Var = (nm0) obj2;
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hm0VarK = (hm0) this.i;
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                int i4 = hm0.b;
                hm0VarK = np4.k(((nbc) this.j).c, this.f);
                u99 u99Var = (u99) nm0Var.b.getValue();
                Context context = nm0Var.a;
                this.i = hm0VarK;
                this.g = 1;
                obj = u99.a(u99Var, context, hm0VarK, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ConcurrentHashMap concurrentHashMap = nm0Var.e;
                    final ol0 ol0Var = new ol0(i2, drawable);
                    concurrentHashMap.computeIfAbsent(hm0VarK, new Function() { // from class: lm0
                        @Override // java.util.function.Function
                        public final /* synthetic */ Object apply(Object obj3) {
                            return ol0Var.invoke(obj3);
                        }
                    });
                    if (z) {
                        pzf pzfVar = nm0Var.f;
                        this.i = null;
                        this.g = 2;
                        if (pzfVar.emit(sbiVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                }
                return sbiVar;
            default:
                gu4 gu4Var = (gu4) this.j;
                int i5 = this.g;
                try {
                    if (i5 == 0) {
                        ch3.d0(obj);
                        xd3 xd3Var2 = (xd3) obj2;
                        jz jzVar = new jz(xd3Var2.G1, 13);
                        this.j = gu4Var;
                        this.i = xd3Var2;
                        this.f = z;
                        this.g = 1;
                        Object objN = e9i.N(jzVar, this);
                        if (objN == hu4Var) {
                            return hu4Var;
                        }
                        obj = objN;
                        xd3Var = xd3Var2;
                    } else {
                        if (i5 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.f;
                        xd3Var = (xd3) this.i;
                        ch3.d0(obj);
                    }
                    ((e9) xd3Var.X.getValue()).b(((rt2) obj).A(), z);
                    poeVar = sbiVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    qv1.t(gu4Var, "setChatIsOpened fail", thA);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im0(xd3 xd3Var, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = xd3Var;
        this.h = z;
    }
}

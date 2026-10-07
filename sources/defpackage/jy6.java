package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class jy6 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ yx6 g;
    public /* synthetic */ Throwable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy6() {
        super(3, null);
        this.e = 0;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) obj;
        Throwable th = (Throwable) obj2;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                jy6 jy6Var = new jy6(3, lq4Var, 0);
                jy6Var.g = yx6Var;
                jy6Var.h = th;
                return jy6Var.invokeSuspend(sbiVar);
            case 1:
                jy6 jy6Var2 = new jy6(3, lq4Var, 1);
                jy6Var2.g = yx6Var;
                jy6Var2.h = th;
                return jy6Var2.invokeSuspend(sbiVar);
            case 2:
                jy6 jy6Var3 = new jy6(3, lq4Var, 2);
                jy6Var3.g = yx6Var;
                jy6Var3.h = th;
                return jy6Var3.invokeSuspend(sbiVar);
            case 3:
                jy6 jy6Var4 = new jy6(3, lq4Var, 3);
                jy6Var4.g = yx6Var;
                jy6Var4.h = th;
                return jy6Var4.invokeSuspend(sbiVar);
            default:
                jy6 jy6Var5 = new jy6(3, lq4Var, 4);
                jy6Var5.g = yx6Var;
                jy6Var5.h = th;
                return jy6Var5.invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        r66 r66Var = r66.a;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                yx6 yx6Var = this.g;
                Throwable th = this.h;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (!(th instanceof TimeoutCancellationException)) {
                    throw th;
                }
                roe roeVar = new roe(new poe(th));
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var.emit(roeVar, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                yx6 yx6Var2 = this.g;
                Throwable th2 = this.h;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                gm0.V(yx6Var2.getClass().getName(), "fail to download", th2);
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var2.emit(kyj.d, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
                yx6 yx6Var3 = this.g;
                Throwable th3 = this.h;
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                gm0.V(l8f.f, "search local chats exception", th3);
                j9f j9fVar = new j9f(0, sbiVar, null, r66Var);
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var3.emit(j9fVar, this) == hu4Var ? hu4Var : sbiVar;
            case 3:
                yx6 yx6Var4 = this.g;
                Throwable th4 = this.h;
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (!(th4 instanceof TimeoutException) && !(th4 instanceof TimeoutCancellationException)) {
                    gm0.V("w8f", "search server messages exception", th4);
                }
                j9f j9fVar2 = new j9f(0, null, null, r66Var);
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var4.emit(j9fVar2, this) == hu4Var ? hu4Var : sbiVar;
            default:
                yx6 yx6Var5 = this.g;
                Throwable th5 = this.h;
                int i6 = this.f;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (!(th5 instanceof TimeoutException) && !(th5 instanceof TimeoutCancellationException)) {
                    gm0.V("d9f", "public search exception", th5);
                }
                j9f j9fVar3 = new j9f(0, new Long(0L), null, r66Var);
                this.g = null;
                this.h = null;
                this.f = 1;
                return yx6Var5.emit(j9fVar3, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy6(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}

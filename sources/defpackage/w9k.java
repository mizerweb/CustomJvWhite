package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.utils.StringExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class w9k {
    public final xde a;
    public final PackagesRepository b;
    public final AnalyticsSender c;
    public final ifh d = new ifh(gg5.p);

    public w9k(xde xdeVar, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        this.a = xdeVar;
        this.b = packagesRepository;
        this.c = analyticsSender;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, nq4 nq4Var) {
        b9k b9kVar;
        Object objL;
        if (nq4Var instanceof b9k) {
            b9kVar = (b9k) nq4Var;
            int i = b9kVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9kVar.h = i - Integer.MIN_VALUE;
            } else {
                b9kVar = new b9k(this, nq4Var);
            }
        } else {
            b9kVar = new b9k(this, nq4Var);
        }
        Object obj = b9kVar.f;
        int i2 = b9kVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!this.b.getInitializedHostPackages().isEmpty()) {
                Logger.DefaultImpls.info$default((Logger) this.d.getValue(), "Push token " + StringExtensionsKt.hideSensitive(str) + " will not be deleted because host app has been installed", null, 2, null);
                return sbi.a;
            }
            b9kVar.d = this;
            b9kVar.e = str;
            b9kVar.h = 1;
            objL = this.a.l(str, b9kVar);
            hu4 hu4Var = hu4.a;
            if (objL == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = b9kVar.e;
            this = b9kVar.d;
            ch3.d0(obj);
            objL = ((roe) obj).a;
        }
        if (!(objL instanceof poe)) {
            Logger.DefaultImpls.info$default((Logger) this.d.getValue(), "Push token " + StringExtensionsKt.hideSensitive(str) + " has been deleted", null, 2, null);
            this.c.send(new m9k(str, 3));
        }
        return objL;
    }
}

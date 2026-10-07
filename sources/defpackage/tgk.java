package defpackage;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tgk {
    public final euc a;
    public final p25 b;
    public final p25 c;
    public final dq4 d;
    public final Logger e;
    public volatile yf5 f;
    public final l9b g;

    public tgk(euc eucVar, p25 p25Var, p25 p25Var2, Logger logger) {
        ao5 ao5Var = ao5.a;
        dq4 dq4VarA = cqk.a(lb5.c);
        this.a = eucVar;
        this.b = p25Var;
        this.c = p25Var2;
        this.d = dq4VarA;
        this.e = logger.createLogger("IPCClientsDataSource");
        this.g = new l9b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(tgk tgkVar, nq4 nq4Var) {
        dhk dhkVar;
        if (nq4Var instanceof dhk) {
            dhkVar = (dhk) nq4Var;
            int i = dhkVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dhkVar.g = i - Integer.MIN_VALUE;
            } else {
                dhkVar = new dhk(tgkVar, nq4Var);
            }
        } else {
            dhkVar = new dhk(tgkVar, nq4Var);
        }
        Object objInvoke = dhkVar.e;
        int i2 = dhkVar.g;
        if (i2 == 0) {
            ch3.d0(objInvoke);
            p25 p25Var = tgkVar.b;
            dhkVar.d = tgkVar;
            dhkVar.g = 1;
            objInvoke = p25Var.invoke(dhkVar);
            hu4 hu4Var = hu4.a;
            if (objInvoke == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tgkVar = dhkVar.d;
            ch3.d0(objInvoke);
        }
        AppInfo appInfo = (AppInfo) objInvoke;
        Logger.DefaultImpls.info$default(tgkVar.e, "Client works with host: " + appInfo.getPackageName(), null, 2, null);
        euc eucVar = tgkVar.a;
        qv qvVar = new qv(16, tgkVar);
        eucVar.getClass();
        List listSingletonList = Collections.singletonList(appInfo);
        Context context = (Context) eucVar.c;
        Logger logger = (Logger) eucVar.d;
        return new i4k(new m7k(context, listSingletonList, logger, new p7k(qvVar, 0)), new r7k((String) eucVar.b, context, listSingletonList, logger, new p7k(qvVar, 1)), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) throws Throwable {
        ogk ogkVar;
        j9b j9bVar;
        Throwable th;
        j9b j9bVar2;
        tgk tgkVar;
        if (nq4Var instanceof ogk) {
            ogkVar = (ogk) nq4Var;
            int i = ogkVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogkVar.h = i - Integer.MIN_VALUE;
            } else {
                ogkVar = new ogk(this, nq4Var);
            }
        } else {
            ogkVar = new ogk(this, nq4Var);
        }
        Object obj = ogkVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = ogkVar.h;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                j9bVar = this.g;
                ogkVar.d = this;
                ogkVar.e = j9bVar;
                ogkVar.h = 1;
                if (j9bVar.b(ogkVar) != hu4Var) {
                }
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = ogkVar.e;
                tgkVar = ogkVar.d;
                try {
                    ch3.d0(obj);
                    tgkVar.f = null;
                    sbi sbiVar = sbi.a;
                    j9bVar2.g(null);
                    return sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            j9b j9bVar3 = ogkVar.e;
            tgk tgkVar2 = ogkVar.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            this = tgkVar2;
            p25 p25Var = this.c;
            ogkVar.d = this;
            ogkVar.e = j9bVar;
            ogkVar.h = 2;
            if (p25Var.invoke(ogkVar) != hu4Var) {
                tgkVar = this;
                j9bVar2 = j9bVar;
                tgkVar.f = null;
                sbi sbiVar2 = sbi.a;
                j9bVar2.g(null);
                return sbiVar2;
            }
            return hu4Var;
        } catch (Throwable th3) {
            j9b j9bVar4 = j9bVar;
            th = th3;
            j9bVar2 = j9bVar4;
            j9bVar2.g(null);
            throw th;
        }
    }
}

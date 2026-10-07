package defpackage;

import android.net.ConnectivityManager;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.webapp.util.WebAppHttpClient$WebAppNoNetworkException;

/* JADX INFO: loaded from: classes3.dex */
public final class yjj {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public ConnectivityManager d;
    public final AtomicReference e = new AtomicReference(null);
    public final AtomicReference f = new AtomicReference(null);
    public final String g = yjj.class.getName();
    public final wjj h;

    public yjj(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.h = new wjj(this, ny8Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, nq4 nq4Var) throws IOException {
        xjj xjjVar;
        if (nq4Var instanceof xjj) {
            xjjVar = (xjj) nq4Var;
            int i = xjjVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xjjVar.g = i - Integer.MIN_VALUE;
            } else {
                xjjVar = new xjj(this, nq4Var);
            }
        } else {
            xjjVar = new xjj(this, nq4Var);
        }
        Object obj = xjjVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = xjjVar.g;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    dle dleVar = xjjVar.d;
                    ch3.d0(obj);
                    return obj;
                }
                if (i2 == 2) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            gm0.n(this.g, "Start requesting url=" + b(str));
            qsb qsbVar = (qsb) this.e.get();
            if (qsbVar == null || !((wd4) this.b.getValue()).h()) {
                gm0.Y(this.g, "cellular network is disabled");
                throw new WebAppHttpClient$WebAppNoNetworkException();
            }
            ag5 ag5Var = new ag5(3);
            ag5Var.h(str);
            dle dleVarA = ag5Var.a();
            y8e y8eVarB = qsbVar.b(dleVarA);
            xjjVar.d = dleVarA;
            xjjVar.g = 1;
            Object objA = zdl.a(y8eVarB, xjjVar);
            return objA == hu4Var ? hu4Var : objA;
        } catch (IOException e) {
            String str2 = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("Network request over cellular was failed due to: ", e.getLocalizedMessage()), null);
                }
            }
            String message = e.getMessage();
            if (message == null || !r5h.L0(message, "EPERM", false)) {
                throw e;
            }
            y8e y8eVarB2 = ((gih) this.a.getValue()).a().b(str);
            xjjVar.d = null;
            xjjVar.g = 2;
            Object objA2 = zdl.a(y8eVarB2, xjjVar);
            if (objA2 != hu4Var) {
                return objA2;
            }
        }
    }

    public final String b(String str) {
        ((wxb) this.c.getValue()).getClass();
        return gm0.c() ? str : r5h.u1(20, str);
    }
}

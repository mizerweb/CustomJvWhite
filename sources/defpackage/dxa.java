package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dxa implements Handler.Callback {
    public final cxa a = new cxa(this);
    public ur0 b;
    public u0a c;
    public ush d;
    public boolean e;
    public final /* synthetic */ exa f;

    public dxa(exa exaVar) {
        this.f = exaVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.e) {
            return true;
        }
        int i = message.what;
        if (i == 1) {
            ur0 ur0VarA = this.f.a.a((ry9) message.obj);
            this.b = ur0VarA;
            ur0VarA.n(this.a, null, z3d.c);
            this.f.c.i(2);
            return true;
        }
        if (i == 2) {
            try {
                u0a u0aVar = this.c;
                if (u0aVar == null) {
                    ur0 ur0Var = this.b;
                    ur0Var.getClass();
                    ur0Var.m();
                } else {
                    u0aVar.n();
                }
                this.f.c.j(2, 100);
                return true;
            } catch (IOException e) {
                gxa gxaVar = this.f.e.a;
                synchronized (gxaVar.c) {
                    mof mofVar = gxaVar.e;
                    mofVar.getClass();
                    mofVar.n(e);
                    this.f.a();
                    return true;
                }
            }
        }
        if (i == 3) {
            u0a u0aVar2 = this.c;
            u0aVar2.getClass();
            ea9 ea9Var = new ea9();
            ea9Var.a = 0L;
            u0aVar2.u(new fa9(ea9Var));
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (this.c != null) {
            ur0 ur0Var2 = this.b;
            ur0Var2.getClass();
            ur0Var2.q(this.c);
        }
        ur0 ur0Var3 = this.b;
        if (ur0Var3 != null) {
            ur0Var3.r(this.a);
        }
        this.f.c.g();
        fxa fxaVar = exa.g;
        synchronized (fxaVar) {
            try {
                int i2 = fxaVar.c - 1;
                fxaVar.c = i2;
                if (i2 == 0) {
                    HandlerThread handlerThread = fxaVar.b;
                    handlerThread.getClass();
                    handlerThread.quit();
                    fxaVar.b = null;
                    fxaVar.a.clear();
                } else {
                    fxaVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = true;
        return true;
    }
}

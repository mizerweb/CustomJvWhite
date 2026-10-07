package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class bk0 extends q0 implements Runnable {
    public t25 h;
    public t25 i;
    public boolean j;
    public final /* synthetic */ dk0 k;

    public bk0(dk0 dk0Var) {
        this.k = dk0Var;
        ak0 ak0Var = new ak0(0, this);
        b78 b78VarA = vd7.A();
        t25 t25VarB = b78VarA.b(dk0Var.b, dk0Var.a);
        this.h = t25VarB;
        q0 q0Var = (q0) t25VarB;
        q0Var.l(ak0Var, x72.a);
        if (!dk0Var.c || q0Var.f()) {
            return;
        }
        b78VarA.k.i.b().execute(this);
    }

    @Override // defpackage.q0, defpackage.t25
    public final boolean close() {
        synchronized (this) {
            if (!super.close()) {
                return false;
            }
            t25 t25Var = this.h;
            this.h = null;
            t25 t25Var2 = this.i;
            this.i = null;
            if (t25Var != null) {
                t25Var.close();
            }
            if (t25Var2 == null) {
                return true;
            }
            t25Var2.close();
            return true;
        }
    }

    @Override // defpackage.q0, defpackage.t25
    public final Object e() {
        t25 t25VarN = n();
        if (t25VarN != null) {
            return (au3) t25VarN.e();
        }
        return null;
    }

    @Override // defpackage.q0, defpackage.t25
    public final boolean f() {
        t25 t25VarN = n();
        return t25VarN != null && t25VarN.f();
    }

    public final t25 n() {
        t25 t25Var;
        t25 t25Var2;
        synchronized (this) {
            try {
                t25Var2 = (this.j || (t25Var = this.i) == null || !t25Var.f()) ? this.h : this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t25Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        synchronized (this) {
            if (this.j || d()) {
                return;
            }
            dk0 dk0Var = this.k;
            String str = dk0Var.a;
            qcd qcdVar = dk0Var.b.o;
            int iZ0 = r5h.Z0("&fn=", str, 6);
            boolean z = false;
            v78 v78VarA = null;
            if (iZ0 >= 0) {
                int i2 = iZ0 + 4;
                int size = vs0.n.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i = -1;
                        break;
                    }
                    String str2 = ((ts0) vs0.n.get(i3)).d;
                    if (str.length() == str2.length() + i2 && str.regionMatches(i2, str2, 0, str2.length())) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
                if (i >= 0) {
                    v71 v71VarB = qcdVar != null ? qcdVar.b() : null;
                    wfe wfeVar = new wfe();
                    ufe ufeVar = new ufe();
                    ufeVar.a = Integer.MAX_VALUE;
                    f78.g().d().a(new ck0(str, i2, v71VarB, i, ufeVar, wfeVar));
                    String str3 = (String) wfeVar.a;
                    if (str3 != null) {
                        bwb bwbVar = bwb.a;
                        Uri uriC = f55.c(str3);
                        if (uriC == null) {
                            uriC = Uri.EMPTY;
                        }
                        w78 w78VarH = ghb.h(uriC, bwbVar, -1, -1);
                        w78VarH.j = whd.c;
                        if (qcdVar != null) {
                            w78VarH.k = qcdVar;
                        }
                        v78VarA = w78VarH.a();
                    }
                }
            }
            v78 v78Var = v78VarA;
            if (v78Var == null) {
                return;
            }
            b78 b78VarA = vd7.A();
            String str4 = this.k.a;
            u78 u78Var = u78.BITMAP_MEMORY_CACHE;
            b78VarA.getClass();
            q0 q0VarA = b78VarA.a(v78Var, str4, u78Var, null, null);
            synchronized (this) {
                if (!this.j && !d()) {
                    this.i = q0VarA;
                    z = true;
                }
            }
            if (z) {
                q0VarA.l(new zj0(this, this.k), x72.a);
            } else {
                q0VarA.close();
            }
        }
    }
}

package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class vc7 implements ux0 {
    public int a;
    public au3 b;

    public vc7(int i, au3 au3Var) {
        this.b = au3Var;
        this.a = i;
    }

    public synchronized void a() {
        au3.E(this.b);
        this.b = null;
        this.a = -1;
    }

    @Override // defpackage.ux0
    public synchronized void clear() {
        a();
    }

    @Override // defpackage.ux0
    public synchronized au3 d() {
        return au3.A(this.b);
    }

    @Override // defpackage.ux0
    public synchronized void e(int i, au3 au3Var) {
        try {
            if (this.b != null) {
                Object objK = au3Var.K();
                au3 au3Var2 = this.b;
                if (objK.equals(au3Var2 != null ? (Bitmap) au3Var2.K() : null)) {
                    return;
                }
            }
            au3.E(this.b);
            this.b = au3Var.y();
            this.a = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ux0
    public void g(int i, au3 au3Var) {
    }

    @Override // defpackage.ux0
    public synchronized au3 i() {
        au3 au3VarA;
        try {
            au3VarA = au3.A(this.b);
            a();
        } catch (Throwable th) {
            a();
            throw th;
        }
        return au3VarA;
    }

    @Override // defpackage.ux0
    public synchronized boolean o(int i) {
        return i == this.a && au3.W(this.b);
    }

    @Override // defpackage.ux0
    public synchronized au3 x(int i) {
        return this.a == i ? au3.A(this.b) : null;
    }

    public vc7() {
        this.a = -1;
    }
}

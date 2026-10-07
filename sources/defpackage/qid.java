package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class qid implements g19 {
    public static final qid i = new qid();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final i19 f = new i19(this);
    public final hed g = new hed(2, this);
    public final w4 h = new w4(this);

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (!this.c) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.d(m09.ON_RESUME);
                this.c = false;
            }
        }
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.f;
    }
}

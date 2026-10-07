package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class p80 {
    public final pah a;
    public final Handler b;
    public kg6 c;
    public p70 d;
    public int f;
    public u80 h;
    public float g = 1.0f;
    public int e = 0;

    public p80(Context context, Looper looper, kg6 kg6Var) {
        this.a = rx8.S(new o80(context, 0));
        this.c = kg6Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        ((AudioManager) this.a.get()).abandonAudioFocusRequest(this.h.b());
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        kg6 kg6Var = this.c;
        if (kg6Var != null) {
            kg6Var.h.i(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        int i3 = 0;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i4 = this.e;
        if (z) {
            if (i4 != 2) {
                u80 u80Var = this.h;
                if (u80Var == null) {
                    t80 t80Var = u80Var == null ? new t80(i2) : u80Var.a();
                    p70 p70Var = this.d;
                    boolean z2 = p70Var != null && p70Var.a == 1;
                    p70Var.getClass();
                    t80Var.b(p70Var);
                    t80Var.d(z2);
                    t80Var.c(new n80(i3, this), this.b);
                    this.h = t80Var.a();
                }
                if (((AudioManager) this.a.get()).requestAudioFocus(this.h.b()) == 1) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i4 == 1) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
        }
        return 1;
    }
}

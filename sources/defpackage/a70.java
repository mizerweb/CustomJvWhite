package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a70 {
    public y0e a;
    public float b;
    public float c;
    public Object d;
    public boolean e;

    public a70(int i) {
        y0e y0eVar = y0e.P_2160;
        switch (i) {
            case 1:
                this.a = y0eVar;
                this.b = 0.0f;
                this.c = 1.0f;
                this.d = null;
                this.e = false;
                break;
            case 2:
                break;
            default:
                this.a = y0eVar;
                break;
        }
    }

    public b70 a() {
        return new b70(this);
    }

    public void b(float f) {
        this.c = f;
    }

    public void c(List list) {
        this.d = list;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public void e(y0e y0eVar) {
        this.a = y0eVar;
    }

    public void f(float f) {
        this.b = f;
    }
}

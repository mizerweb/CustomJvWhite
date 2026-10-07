package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class wb5 {
    public final HashMap a;
    public y65 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Boolean o;

    public wb5() {
        HashMap map = new HashMap();
        this.a = map;
        map.put(z3d.d.a, 144179200);
        this.c = 50000;
        this.d = 1000;
        this.e = 50000;
        this.f = 50000;
        this.g = 1000;
        this.h = 1000;
        this.i = 2000;
        this.j = 1000;
        this.k = -1;
        this.l = false;
        this.m = true;
    }

    public final yb5 a() {
        lvb.b0(!this.n);
        this.n = true;
        if (this.b == null) {
            this.b = new y65();
        }
        Boolean bool = this.o;
        if (bool != null && bool.booleanValue()) {
            this.d = this.c;
            this.f = this.e;
            this.h = this.g;
            this.j = this.i;
            this.m = this.l;
        }
        return new yb5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.a);
    }

    public final void b(int i, int i2, int i3, int i4) {
        lvb.b0(!this.n);
        yb5.m("bufferForPlaybackMs", i3, 0, "0");
        yb5.m("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
        yb5.m("minBufferMs", i, i3, "bufferForPlaybackMs");
        yb5.m("minBufferMs", i, i4, "bufferForPlaybackAfterRebufferMs");
        yb5.m("maxBufferMs", i2, i, "minBufferMs");
        this.c = i;
        this.e = i2;
        this.g = i3;
        this.i = i4;
        this.d = i;
        this.f = i2;
        this.h = i3;
        this.j = i4;
        if (this.o == null) {
            this.o = Boolean.TRUE;
        }
    }

    public final void c(boolean z) {
        lvb.b0(!this.n);
        this.l = z;
        this.m = z;
        if (this.o == null) {
            this.o = Boolean.TRUE;
        }
    }
}

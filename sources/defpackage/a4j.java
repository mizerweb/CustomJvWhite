package defpackage;

import android.media.metrics.LogSessionId;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a4j {
    public final iu3 a;
    public final b87 b;
    public final c98 c;
    public final List d;
    public final b2i e;
    public final g85 f;
    public final String g;
    public final int h;
    public final LogSessionId i;
    public bch j;
    public volatile i95 k;
    public volatile int l;
    public volatile boolean m;

    public a4j(iu3 iu3Var, b87 b87Var, c98 c98Var, c98 c98Var2, b2i b2iVar, g85 g85Var, LogSessionId logSessionId) {
        ex3 ex3Var = b87Var.D;
        lvb.R(ex3Var != null);
        this.a = iu3Var;
        this.b = b87Var;
        this.c = c98Var;
        this.d = c98Var2;
        this.e = b2iVar;
        this.f = g85Var;
        this.i = logSessionId;
        String str = b87Var.n;
        str.getClass();
        String str2 = b2iVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (uya.k(str)) {
            str = "video/hevc";
        }
        int i = b2iVar.d;
        if (i != 0 || !ex3.h(ex3Var) || !y86.f(str, ex3Var).isEmpty()) {
            str3 = str;
        } else if (y86.f("video/hevc", ex3Var).isEmpty()) {
            i = 2;
            str3 = str;
        }
        Pair pairCreate = Pair.create(str3, Integer.valueOf(i));
        this.g = (String) pairCreate.first;
        this.h = ((Integer) pairCreate.second).intValue();
    }

    public final bch a(int i, int i2) {
        ex3 ex3Var;
        if (this.m) {
            return null;
        }
        bch bchVar = this.j;
        if (bchVar != null) {
            return bchVar;
        }
        if (i < i2) {
            this.l = 90;
            i2 = i;
            i = i2;
        }
        if (this.b.z % 180 == this.l % 180) {
            this.l = this.b.z;
        }
        if (!this.c.contains(Integer.valueOf(this.l))) {
            int i3 = (this.l + 180) % 360;
            if (this.c.contains(Integer.valueOf(i3))) {
                this.l = i3;
            } else {
                this.l = ((Integer) this.c.get(0)).intValue();
                int i4 = i2;
                i2 = i;
                i = i4;
            }
        }
        a87 a87Var = new a87();
        a87Var.t = i;
        a87Var.u = i2;
        a87Var.y = 0;
        a87Var.x = this.b.y;
        a87Var.m = uya.n(this.g);
        b87 b87Var = this.b;
        if ((!ex3.h(b87Var.D) || this.h == 0) && !ex3.i.equals(b87Var.D)) {
            ex3Var = b87Var.D;
            ex3Var.getClass();
        } else {
            ex3Var = ex3.h;
        }
        a87Var.C = ex3Var;
        a87Var.j = this.b.k;
        b87 b87Var2 = new b87(a87Var);
        iu3 iu3Var = this.a;
        a87 a87VarA = b87Var2.a();
        a87VarA.m = uya.n(tye.h(b87Var2, this.d));
        this.k = iu3Var.p(new b87(a87VarA), this.i);
        b87 b87Var3 = this.k.c;
        g85 g85Var = this.f;
        b2i b2iVar = this.e;
        boolean z = this.l != 0;
        int i5 = this.h;
        p21 p21VarA = b2iVar.a();
        if (b2iVar.d != i5) {
            p21VarA.b = i5;
        }
        if (!Objects.equals(b87Var2.n, b87Var3.n)) {
            p21VarA.j(b87Var3.n);
        }
        if (z) {
            int i6 = b87Var2.u;
            int i7 = b87Var3.u;
            if (i6 != i7) {
                p21VarA.a = i7;
            }
        } else {
            int i8 = b87Var2.v;
            int i9 = b87Var3.v;
            if (i8 != i9) {
                p21VarA.a = i9;
            }
        }
        g85Var.M(p21VarA.c());
        Surface surface = this.k.e;
        surface.getClass();
        this.j = new bch(surface, b87Var3.u, b87Var3.v, this.l, true);
        if (this.m) {
            this.k.i();
        }
        return this.j;
    }

    public final void b() throws ExportException {
        if (this.k != null) {
            i95 i95Var = this.k;
            if (!i95Var.i.get()) {
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            LinkedHashMap linkedHashMap = g55.a;
            try {
                synchronized (g55.class) {
                    synchronized (g55.class) {
                    }
                    i95Var.d.signalEndOfInputStream();
                }
                i95Var.d.signalEndOfInputStream();
            } catch (RuntimeException e) {
                lvb.h0("DefaultCodec", "MediaCodec error", e);
                throw i95Var.b(e);
            }
        }
    }
}

package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bb0 {
    public final c98 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public cb0 d;
    public cb0 e;
    public boolean f;

    public bb0(c98 c98Var) {
        this.a = c98Var;
        cb0 cb0Var = cb0.e;
        this.d = cb0Var;
        this.e = cb0Var;
        this.f = false;
    }

    public final cb0 a(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (cb0Var.equals(cb0.e)) {
            throw new AudioProcessor$UnhandledAudioFormatException(cb0Var);
        }
        int i = 0;
        while (true) {
            c98 c98Var = this.a;
            if (i >= c98Var.size()) {
                this.e = cb0Var;
                return cb0Var;
            }
            fb0 fb0Var = (fb0) c98Var.get(i);
            cb0 cb0VarG = fb0Var.g(cb0Var);
            if (fb0Var.isActive()) {
                lvb.b0(!cb0VarG.equals(cb0.e));
                cb0Var = cb0VarG;
            }
            i++;
        }
    }

    public final void b() {
        c(db0.b);
    }

    public final void c(db0 db0Var) {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        long jI = db0Var.a;
        int i = 0;
        while (true) {
            c98 c98Var = this.a;
            if (i >= c98Var.size()) {
                break;
            }
            fb0 fb0Var = (fb0) c98Var.get(i);
            fb0Var.e(new db0(jI));
            if (fb0Var.isActive()) {
                jI = fb0Var.i(jI);
                lvb.b0(jI >= 0);
                arrayList.add(fb0Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= d(); i2++) {
            this.c[i2] = ((fb0) arrayList.get(i2)).d();
        }
    }

    public final int d() {
        return this.c.length - 1;
    }

    public final ByteBuffer e() {
        if (!g()) {
            return fb0.a;
        }
        ByteBuffer byteBuffer = this.c[d()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        h(fb0.a);
        return this.c[d()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb0)) {
            return false;
        }
        c98 c98Var = ((bb0) obj).a;
        c98 c98Var2 = this.a;
        if (c98Var2.size() != c98Var.size()) {
            return false;
        }
        for (int i = 0; i < c98Var2.size(); i++) {
            if (c98Var2.get(i) != c98Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f && ((fb0) this.b.get(d())).c() && !this.c[d()].hasRemaining();
    }

    public final boolean g() {
        return !this.b.isEmpty();
    }

    public final void h(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= d(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    fb0 fb0Var = (fb0) arrayList.get(i);
                    if (!fb0Var.c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : fb0.a;
                        long jRemaining = byteBuffer2.remaining();
                        fb0Var.f(byteBuffer2);
                        this.c[i] = fb0Var.d();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < d()) {
                        ((fb0) arrayList.get(i + 1)).h();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        if (!g() || this.f) {
            return;
        }
        this.f = true;
        ((fb0) this.b.get(0)).h();
    }

    public final void j(ByteBuffer byteBuffer) {
        if (!g() || this.f) {
            return;
        }
        h(byteBuffer);
    }

    public final void k() {
        int i = 0;
        while (true) {
            c98 c98Var = this.a;
            if (i >= c98Var.size()) {
                this.b.clear();
                this.c = new ByteBuffer[0];
                cb0 cb0Var = cb0.e;
                this.d = cb0Var;
                this.e = cb0Var;
                this.f = false;
                return;
            }
            fb0 fb0Var = (fb0) c98Var.get(i);
            fb0Var.e(db0.b);
            fb0Var.reset();
            i++;
        }
    }
}

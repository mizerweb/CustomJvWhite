package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a90 {
    public final ArrayList a = new ArrayList();
    public final w75 b;
    public final bb0 c;
    public cb0 d;
    public boolean e;
    public boolean f;
    public ByteBuffer g;
    public int h;

    public a90(so2 so2Var, ghe gheVar) {
        so2Var.getClass();
        this.b = new w75();
        this.d = cb0.e;
        this.g = fb0.a;
        this.c = new bb0(gheVar);
    }

    public final ByteBuffer a() throws ExportException {
        boolean z;
        ByteBuffer byteBuffer;
        ArrayList arrayList = this.a;
        w75 w75Var = this.b;
        long j = -9223372036854775807L;
        if (this.f) {
            z = true;
        } else {
            if (!this.e) {
                try {
                    w75Var.d(this.d);
                    this.e = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw ExportException.b(e, "Error while configuring mixer");
                }
            }
            this.f = true;
            for (int i = 0; i < arrayList.size(); i++) {
                z80 z80Var = (z80) arrayList.get(i);
                if (z80Var.b == -1) {
                    c90 c90Var = z80Var.a;
                    try {
                        c90Var.k();
                        long j2 = c90Var.e.get();
                        if (j2 == -9223372036854775807L) {
                            this.f = false;
                        } else if (j2 != Long.MIN_VALUE) {
                            z80Var.b = w75Var.a(c90Var.a, j2);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                        throw ExportException.b(e2, "Unhandled format while adding source " + z80Var.b);
                    }
                }
            }
            z = this.f;
        }
        if (!z) {
            return fb0.a;
        }
        if (!this.b.e()) {
            ArrayList arrayList2 = this.a;
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                z80 z80Var2 = (z80) arrayList2.get(i2);
                int i3 = z80Var2.b;
                w75 w75Var2 = this.b;
                w75Var2.c();
                SparseArray sparseArray = w75Var2.a;
                if (vqi.l(sparseArray, i3)) {
                    c90 c90Var2 = z80Var2.a;
                    if (!c90Var2.l() && c90Var2.d.isEmpty() && (c90Var2.l == j ? c90Var2.j || c90Var2.k : c90Var2.o && (c90Var2.j || c90Var2.k))) {
                        w75Var2.c();
                        long j3 = w75Var2.j;
                        SparseArray sparseArray2 = w75Var2.a;
                        lvb.Z("Source not found.", vqi.l(sparseArray2, i3));
                        w75Var2.j = Math.max(j3, ((v75) sparseArray2.get(i3)).a);
                        sparseArray.delete(i3);
                        z80Var2.b = -1;
                        this.h++;
                    } else {
                        try {
                            w75Var2.f(i3, c90Var2.k());
                        } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                            throw ExportException.b(e3, "AudioGraphInput (sourceId=" + i3 + ") reconfiguration");
                        }
                    }
                }
                i2++;
                j = -9223372036854775807L;
            }
        }
        if (!this.g.hasRemaining()) {
            w75 w75Var3 = this.b;
            w75Var3.c();
            if (w75Var3.e()) {
                byteBuffer = fb0.a;
            } else {
                long jMin = w75Var3.i;
                if (w75Var3.a.size() == 0) {
                    jMin = Math.min(jMin, w75Var3.j);
                }
                for (int i4 = 0; i4 < w75Var3.a.size(); i4++) {
                    jMin = Math.min(jMin, ((v75) w75Var3.a.valueAt(i4)).a);
                }
                if (jMin <= w75Var3.h) {
                    byteBuffer = fb0.a;
                } else {
                    u75 u75Var = w75Var3.e[0];
                    long jMin2 = Math.min(jMin, u75Var.b);
                    ByteBuffer byteBufferDuplicate = ((ByteBuffer) u75Var.c).duplicate();
                    byteBufferDuplicate.position(((int) (w75Var3.h - u75Var.a)) * w75Var3.c.d).limit(((int) (jMin2 - u75Var.a)) * w75Var3.c.d);
                    ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(ByteOrder.nativeOrder());
                    if (jMin2 == u75Var.b) {
                        u75[] u75VarArr = w75Var3.e;
                        u75 u75Var2 = u75VarArr[1];
                        u75VarArr[0] = u75Var2;
                        u75VarArr[1] = w75Var3.b(u75Var2.b);
                    }
                    w75Var3.h = jMin2;
                    w75Var3.g = Math.min(w75Var3.i, jMin2 + ((long) w75Var3.d));
                    byteBufferOrder.remaining();
                    LinkedHashMap linkedHashMap = g55.a;
                    synchronized (g55.class) {
                    }
                    byteBuffer = byteBufferOrder;
                }
            }
            this.g = byteBuffer;
        }
        if (!this.c.g()) {
            return this.g;
        }
        boolean zB = b();
        bb0 bb0Var = this.c;
        if (zB) {
            bb0Var.i();
        } else {
            bb0Var.j(this.g);
        }
        return this.c.e();
    }

    public final boolean b() {
        return !this.g.hasRemaining() && this.h >= this.a.size() && this.b.e();
    }

    public final c90 c(s26 s26Var, b87 b87Var) throws ExportException {
        lvb.R(b87Var.H != -1);
        try {
            c90 c90Var = new c90(this.d, s26Var, b87Var);
            if (Objects.equals(this.d, cb0.e)) {
                cb0 cb0Var = c90Var.a;
                this.d = cb0Var;
                this.c.a(cb0Var);
                this.c.c(new db0(0L));
            }
            this.a.add(new z80(c90Var));
            LinkedHashMap linkedHashMap = g55.a;
            synchronized (g55.class) {
            }
            return c90Var;
        } catch (AudioProcessor$UnhandledAudioFormatException e) {
            throw ExportException.b(e, "Error while registering input " + this.a.size());
        }
    }

    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                arrayList.clear();
                w75 w75Var = this.b;
                w75Var.a.clear();
                w75Var.b = 0;
                cb0 cb0Var = cb0.e;
                w75Var.c = cb0Var;
                w75Var.d = -1;
                w75Var.e = new u75[0];
                w75Var.f = -9223372036854775807L;
                w75Var.g = -1L;
                w75Var.h = 0L;
                w75Var.i = BuildConfig.MAX_TIME_TO_UPLOAD;
                w75Var.j = 0L;
                this.c.k();
                this.h = 0;
                this.g = fb0.a;
                this.d = cb0Var;
                return;
            }
            ((z80) arrayList.get(i)).a.h.k();
            i++;
        }
    }
}

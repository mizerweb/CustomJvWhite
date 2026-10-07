package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d4j extends tye {
    public final c4j e;
    public final a4j f;
    public final u55 g;
    public volatile long h;
    public long i;
    public boolean j;

    public d4j(Context context, b87 b87Var, b2i b2iVar, er3 er3Var, List list, rwi rwiVar, iu3 iu3Var, t9b t9bVar, vuf vufVar, g85 g85Var, p51 p51Var, long j, boolean z, c98 c98Var, int i, LogSessionId logSessionId) throws ExportException {
        ex3 ex3Var;
        super(b87Var, t9bVar);
        boolean z2 = i < 1;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        ex3 ex3Var2 = b87Var.D;
        ex3Var2.getClass();
        if (Objects.equals(b87Var.n, "image/jpeg_r") && ex3Var2.c == 2) {
            ex3Var = new ex3(6, 1, 7, null, -1, -1);
        } else {
            int i2 = ex3Var2.c;
            ex3Var = (i2 == 2 || i2 == 10) ? ex3.h : ex3Var2;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.C = ex3Var;
        a4j a4jVar = new a4j(iu3Var, new b87(a87VarA), c98Var, t9bVar.b.a(2), b2iVar, g85Var, logSessionId);
        this.f = a4jVar;
        this.g = new u55(0);
        if (a4jVar.h == 2 && ex3.h(ex3Var2)) {
            ex3Var = ex3.h;
        }
        try {
            c4j c4jVar = new c4j(this, context, z ? new m7b(rwiVar) : new m8g(rwiVar), ex3Var, p51Var, er3Var, list, vufVar, j, i, z2);
            this.e = c4jVar;
            c4jVar.a.k();
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001, null);
        }
    }

    @Override // defpackage.tye
    public final sp7 i(s26 s26Var, b87 b87Var, int i) throws ExportException {
        try {
            c4j c4jVar = this.e;
            hxi hxiVar = c4jVar.a;
            hxiVar.m(i);
            return new b4j(hxiVar, i, c4jVar.e);
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001, null);
        }
    }

    @Override // defpackage.tye
    public final u55 j() {
        u55 u55Var = this.g;
        a4j a4jVar = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        u55Var.d = a4jVar.k != null ? a4jVar.k.d() : null;
        if (this.g.d == null) {
            return null;
        }
        a4j a4jVar2 = this.f;
        if (a4jVar2.k != null) {
            i95 i95Var = a4jVar2.k;
            if (i95Var.g(false)) {
                bufferInfo = i95Var.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0 && this.e.a.h() == this.j && this.h != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.h;
        }
        u55 u55Var2 = this.g;
        long j = bufferInfo.presentationTimeUs;
        u55Var2.f = j;
        u55Var2.a = bufferInfo.flags;
        this.i = j;
        return u55Var2;
    }

    @Override // defpackage.tye
    public final b87 k() throws ExportException {
        a4j a4jVar = this.f;
        if (a4jVar.k == null) {
            return null;
        }
        i95 i95Var = a4jVar.k;
        i95Var.g(false);
        b87 b87Var = i95Var.j;
        if (b87Var == null || a4jVar.l == 0) {
            return b87Var;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.y = a4jVar.l;
        return new b87(a87VarA);
    }

    @Override // defpackage.tye
    public final boolean l() {
        boolean z;
        a4j a4jVar = this.f;
        if (a4jVar.k == null || !a4jVar.k.e()) {
            c4j c4jVar = this.e;
            if (c4jVar.d) {
                z = false;
            } else {
                boolean z2 = c4jVar.i.h != -9223372036854775807L;
                synchronized (c4jVar.b) {
                    z = c4jVar.g == 0 && z2;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.tye
    public final void n() {
        this.e.a.release();
        a4j a4jVar = this.f;
        if (a4jVar.k != null) {
            a4jVar.k.i();
        }
        a4jVar.m = true;
    }

    @Override // defpackage.tye
    public final void o() throws ExportException {
        if (this.i == 0) {
            this.j = true;
        }
        a4j a4jVar = this.f;
        if (a4jVar.k != null) {
            a4jVar.k.j();
        }
        c4j c4jVar = this.e;
        if (c4jVar.d) {
            return;
        }
        synchronized (c4jVar.b) {
            lvb.b0(c4jVar.g > 0);
            c4jVar.g--;
        }
        c4jVar.c();
    }
}

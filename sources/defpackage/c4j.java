package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c4j implements gxi {
    public final hxi a;
    public final Object b = new Object();
    public final vuf c;
    public final boolean d;
    public final long e;
    public final int f;
    public int g;
    public int h;
    public final /* synthetic */ d4j i;

    public c4j(d4j d4jVar, Context context, fxi fxiVar, ex3 ex3Var, p51 p51Var, er3 er3Var, List list, vuf vufVar, long j, int i, boolean z) {
        this.i = d4jVar;
        this.c = vufVar;
        this.d = z;
        this.e = j;
        this.f = i;
        hxi hxiVarA = fxiVar.a(context, ex3Var, p51Var, this, im5.a, j, z);
        this.a = hxiVarA;
        hxiVarA.d(list);
        hxiVarA.j(er3Var);
    }

    @Override // defpackage.gxi
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        this.c.accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001, null));
    }

    @Override // defpackage.gxi
    public final void b(long j) {
        this.i.h = j;
        try {
            this.i.f.b();
        } catch (ExportException e) {
            this.c.accept(e);
        }
    }

    public final void c() {
        boolean z;
        int i;
        synchronized (this.b) {
            try {
                int i2 = this.h;
                if (i2 <= 0 || (i = this.g) >= this.f) {
                    z = false;
                } else {
                    z = true;
                    this.g = i + 1;
                    this.h = i2 - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.f(-3L);
        }
    }

    @Override // defpackage.gxi
    public final void e(long j, boolean z) {
        if (this.d) {
            return;
        }
        synchronized (this.b) {
            this.h++;
        }
        c();
    }

    @Override // defpackage.gxi
    public final void h(int i, int i2) {
        bch bchVarA;
        try {
            bchVarA = this.i.f.a(i, i2);
        } catch (ExportException e) {
            this.c.accept(e);
            bchVarA = null;
        }
        this.a.i(bchVarA);
    }
}

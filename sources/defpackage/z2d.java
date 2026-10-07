package defpackage;

import android.content.Context;
import android.util.Range;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class z2d {
    public final Context a;
    public final uwi b;
    public m7b c;
    public boolean d;
    public qt3 e;
    public boolean f;
    public long g = BuildConfig.SILENCE_TIME_TO_UPLOAD;
    public final vwi h;

    public z2d(Context context, uwi uwiVar) {
        this.a = context.getApplicationContext();
        this.b = uwiVar;
        vwi vwiVar = new vwi();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        vwiVar.d = range;
        vwiVar.c = ((Double) range.getUpper()).doubleValue();
        vwiVar.a = -9223372036854775807L;
        vwiVar.b = -9223372036854775807L;
        this.h = vwiVar;
        this.e = qt3.a;
    }

    public final g3d a() {
        lvb.b0(!this.f);
        if (this.c == null) {
            this.c = new m7b();
        }
        g3d g3dVar = new g3d(this);
        this.f = true;
        return g3dVar;
    }

    public final void b(long j) {
        this.g = j;
    }

    public final void c(qt3 qt3Var) {
        this.e = qt3Var;
    }

    public final void d() {
        this.d = true;
    }
}

package androidx.media3.transformer;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import defpackage.ay;
import defpackage.cy;
import defpackage.dy;
import defpackage.ey;
import defpackage.hu3;
import defpackage.ie5;
import defpackage.j28;
import defpackage.jc5;
import defpackage.oe5;
import defpackage.pe5;
import defpackage.qt3;
import defpackage.ra5;
import defpackage.s26;
import defpackage.s99;
import defpackage.syh;
import defpackage.uyh;
import defpackage.ve5;
import defpackage.w4a;
import defpackage.wb5;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerAssetLoader$Factory implements cy {
    private final qt3 clock;
    private final Context context;
    private final hu3 decoderFactory;
    private final s99 loadControl;
    private final LogSessionId logSessionId;
    private final w4a mediaSourceFactory;
    private final syh trackSelectorFactory;

    public ExoPlayerAssetLoader$Factory(Context context, hu3 hu3Var, qt3 qt3Var, w4a w4aVar, syh syhVar, LogSessionId logSessionId, s99 s99Var) {
        this.context = context;
        this.decoderFactory = hu3Var;
        this.clock = qt3Var;
        this.mediaSourceFactory = w4aVar;
        this.trackSelectorFactory = syhVar;
        this.logSessionId = logSessionId;
        this.loadControl = s99Var;
    }

    public static /* synthetic */ uyh lambda$createAssetLoader$0(pe5 pe5Var, Context context) {
        ve5 ve5Var = new ve5(context);
        ve5Var.c(pe5Var);
        return ve5Var;
    }

    @Override // defpackage.cy
    public ey createAssetLoader(s26 s26Var, Looper looper, dy dyVar, ay ayVar) {
        w4a jc5Var;
        w4a w4aVar = this.mediaSourceFactory;
        if (w4aVar == null) {
            ra5 ra5Var = new ra5();
            s26Var.getClass();
            jc5Var = new jc5(this.context, ra5Var);
        } else {
            jc5Var = w4aVar;
        }
        syh ie5Var = this.trackSelectorFactory;
        if (ie5Var == null) {
            oe5 oe5Var = new oe5();
            oe5Var.G = true;
            oe5Var.N = false;
            ie5Var = new ie5(new pe5(oe5Var));
        }
        syh syhVar = ie5Var;
        s99 s99VarA = this.loadControl;
        if (s99VarA == null) {
            wb5 wb5Var = new wb5();
            wb5Var.b(50000, 50000, 100, 200);
            wb5Var.c(false);
            s99VarA = wb5Var.a();
        }
        return new j28(this.context, s26Var, jc5Var, this.decoderFactory, ayVar.a, looper, dyVar, this.clock, syhVar, this.logSessionId, s99VarA);
    }

    public ExoPlayerAssetLoader$Factory(Context context, hu3 hu3Var, qt3 qt3Var, s99 s99Var) {
        this(context, hu3Var, qt3Var, null, null, null, s99Var);
    }

    public ExoPlayerAssetLoader$Factory(Context context, hu3 hu3Var, qt3 qt3Var, w4a w4aVar) {
        this(context, hu3Var, qt3Var, w4aVar, null, null, null);
    }

    public ExoPlayerAssetLoader$Factory(Context context, hu3 hu3Var, qt3 qt3Var) {
        this(context, hu3Var, qt3Var, null, null, null, null);
    }
}

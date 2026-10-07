package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta8 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ ta8(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        int i2 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                String str = rb8.u;
                if (!(th instanceof CancellationException)) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    if (th == null) {
                        StringBuilder sbX = zo5.x(i2, jElapsedRealtime, "prefetch ", " completed, all time = ");
                        sbX.append("ms");
                        gm0.n(str, sbX.toString());
                    } else {
                        StringBuilder sbX2 = zo5.x(i2, jElapsedRealtime, "prefetch ", " completion error, all time = ");
                        sbX2.append("ms");
                        pb9 pb9Var = new pb9(sbX2.toString(), th);
                        gm0.V(str, pb9Var.getMessage(), pb9Var);
                    }
                }
                return sbi.a;
            default:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM stickers WHERE id > ? ORDER BY id LIMIT ?");
                try {
                    vxeVarO0.c(1, j);
                    vxeVarO0.c(2, i2);
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "sticker_id");
                    int iE3 = qyj.E(vxeVarO0, "width");
                    int iE4 = qyj.E(vxeVarO0, "height");
                    int iE5 = qyj.E(vxeVarO0, MLFeatureConfigProviderBase.URL_KEY);
                    int iE6 = qyj.E(vxeVarO0, "update_time");
                    int iE7 = qyj.E(vxeVarO0, "mp4_url");
                    int iE8 = qyj.E(vxeVarO0, "first_url");
                    int iE9 = qyj.E(vxeVarO0, "preview_url");
                    int iE10 = qyj.E(vxeVarO0, "tags");
                    int iE11 = qyj.E(vxeVarO0, "sticker_type");
                    int iE12 = qyj.E(vxeVarO0, "set_id");
                    int iE13 = qyj.E(vxeVarO0, "lottie_url");
                    int iE14 = qyj.E(vxeVarO0, MediaStreamTrack.AUDIO_TRACK_KIND);
                    int iE15 = qyj.E(vxeVarO0, "author_type");
                    int iE16 = qyj.E(vxeVarO0, "video_url");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j2 = vxeVarO0.getLong(iE);
                        long j3 = vxeVarO0.getLong(iE2);
                        int i3 = iE;
                        int i4 = iE2;
                        int i5 = (int) vxeVarO0.getLong(iE3);
                        int i6 = iE3;
                        int i7 = iE15;
                        int i8 = iE4;
                        int i9 = iE16;
                        arrayList.add(new olg(j2, j3, i5, (int) vxeVarO0.getLong(iE4), vxeVarO0.isNull(iE5) ? null : vxeVarO0.B0(iE5), vxeVarO0.getLong(iE6), vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7), vxeVarO0.isNull(iE8) ? null : vxeVarO0.B0(iE8), vxeVarO0.isNull(iE9) ? null : vxeVarO0.B0(iE9), r5h.m1(vxeVarO0.B0(iE10), new String[]{","}, 6), cqk.L((int) vxeVarO0.getLong(iE11)), vxeVarO0.getLong(iE12), vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13), ((int) vxeVarO0.getLong(iE14)) != 0, cqk.K((int) vxeVarO0.getLong(i7)), vxeVarO0.isNull(i9) ? null : vxeVarO0.B0(i9)));
                        iE4 = i8;
                        iE15 = i7;
                        iE16 = i9;
                        iE = i3;
                        iE2 = i4;
                        iE3 = i6;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
        }
    }

    public /* synthetic */ ta8(long j, int i, ymg ymgVar) {
        this.b = j;
        this.c = i;
    }
}

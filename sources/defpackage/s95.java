package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class s95 implements hu3 {
    public final Context a;
    public final o75 b;
    public final int c;
    public final qr7 d;

    public s95(a9m a9mVar) {
        this.a = (Context) a9mVar.c;
        this.b = (o75) a9mVar.d;
        this.c = a9mVar.b;
        this.d = (qr7) a9mVar.e;
    }

    public static ExportException c(b87 b87Var, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String string = b87Var.toString();
        String str2 = b87Var.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new lh6(string, (String) null, uya.m(str2), true));
    }

    public final i95 a(MediaFormat mediaFormat, b87 b87Var, Surface surface, boolean z, LogSessionId logSessionId) throws ExportException {
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        b87Var.n.getClass();
        try {
            Context context = this.a;
            ArrayList arrayList = new ArrayList(ut9.g(this.d, b87Var, false, false));
            Collections.sort(arrayList, new z70(4, new rt9(context, b87Var, 1)));
            if (arrayList.isEmpty()) {
                throw c(b87Var, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    nt9 nt9Var = (nt9) arrayList.get(i);
                    if (!nt9Var.h) {
                        arrayList2.add(nt9Var);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 && ((nt9) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (i2 >= 35 && logSessionId != null) {
                gzl.b(mediaFormat, logSessionId);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context2 = this.a;
            for (nt9 nt9Var2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", nt9Var2.c);
                try {
                    i95 i95Var = new i95(context2, b87Var, mediaFormat, nt9Var2.a, true, surface);
                    i95Var.c();
                    this.b.getClass();
                    return i95Var;
                } catch (ExportException e) {
                    arrayList3.add(e);
                }
            }
            throw ((ExportException) arrayList3.get(0));
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            lvb.l0("DefaultDecoderFactory", "Error querying decoders", e2);
            throw c(b87Var, "Querying codecs failed");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L28;
     */
    @Override // defpackage.hu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.i95 b(defpackage.b87 r11, android.view.Surface r12, boolean r13, android.media.metrics.LogSessionId r14) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s95.b(b87, android.view.Surface, boolean, android.media.metrics.LogSessionId):i95");
    }

    @Override // defpackage.hu3
    public final i95 d(b87 b87Var, LogSessionId logSessionId) {
        return a(trk.b(b87Var), b87Var, null, false, logSessionId);
    }
}

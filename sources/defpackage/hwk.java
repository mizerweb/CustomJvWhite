package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hwk {
    public static ghe a(p70 p70Var) {
        z88 z88VarL = c98.l();
        pci it = u70.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= vqi.t(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), p70Var.c())) {
                z88VarL.c(num);
            }
        }
        z88VarL.c(2);
        return z88VarL.h();
    }

    public static int b(int i, int i2, p70 p70Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iU = vqi.u(i3);
            if (iU != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iU).build(), p70Var.c())) {
                return i3;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[ORIG_RETURN, RETURN] */
    public static boolean c(jwa jwaVar) {
        int i;
        if (!(jwaVar instanceof t2b) && !(jwaVar instanceof r2b)) {
            if (jwaVar instanceof u2b) {
                u2b u2bVar = (u2b) jwaVar;
                if (u2bVar.a > 4294967295L || u2bVar.b > 4294967295L) {
                    if (jwaVar instanceof qp9) {
                        return false;
                    }
                    i = ((qp9) jwaVar).d;
                    if (i == 1 && i != 23) {
                        return false;
                    }
                }
            } else {
                if (jwaVar instanceof qp9) {
                    return false;
                }
                i = ((qp9) jwaVar).d;
                if (i == 1) {
                }
            }
        }
        return true;
    }
}

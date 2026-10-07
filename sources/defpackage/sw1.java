package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class sw1 {
    public static final long[] h = {500, 535, 458, 535, 825};
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e;
    public final ifh f;
    public ldg g;

    public sw1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        final int i = 0;
        this.e = new ifh(new af7(this) { // from class: rw1
            public final /* synthetic */ sw1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                sw1 sw1Var = this.b;
                switch (i2) {
                    case 0:
                        return (AudioManager) sw1Var.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    default:
                        return (Vibrator) sw1Var.a.getSystemService("vibrator");
                }
            }
        });
        final int i2 = 1;
        this.f = new ifh(new af7(this) { // from class: rw1
            public final /* synthetic */ sw1 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                sw1 sw1Var = this.b;
                switch (i3) {
                    case 0:
                        return (AudioManager) sw1Var.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    default:
                        return (Vibrator) sw1Var.a.getSystemService("vibrator");
                }
            }
        });
        ifh ifhVar = ldg.l;
        this.g = xql.b();
    }

    public final boolean a() {
        String str;
        boolean zA = ((c95) this.b.getValue()).a();
        boolean zE = ((gue) this.c.getValue()).e();
        int ringerMode = ((AudioManager) this.e.getValue()).getRingerMode();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (ringerMode == 0) {
                    str = "RINGER_MODE_SILENT";
                } else if (ringerMode != 1) {
                    str = ringerMode != 2 ? "unknown" : "RINGER_MODE_NORMAL";
                } else {
                    str = "RINGER_MODE_VIBRATE";
                }
                StringBuilder sbB = zo5.B("isRingtonePlayAvailable notificationsEnabled=", zA, " isAppOpened=", zE, " ringMode=");
                sbB.append(str);
                a4cVar.c(je9Var, "RingtoneManagerTag", sbB.toString(), null);
            }
        }
        return zA || zE;
    }

    public final void b(kdg kdgVar, boolean z, int i) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "RingtoneManagerTag", " start ringtone loop=" + z + " sound=" + kdgVar, null);
            }
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ((m7g) this.d.getValue()).i(kdgVar, i, z);
        } else {
            ore.k("Main (UI) thread expected");
        }
    }

    public final void c() {
        String str;
        ldg ldgVar = this.g;
        boolean zHasVibrator = ((Vibrator) this.f.getValue()).hasVibrator();
        boolean z = d3m.b(this.a) == 1;
        if (zHasVibrator && ldgVar.j && z) {
            ((Vibrator) this.f.getValue()).cancel();
            Vibrator vibrator = (Vibrator) this.f.getValue();
            VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(h, 0);
            if (Build.VERSION.SDK_INT >= 33) {
                vibrator.vibrate(vibrationEffectCreateWaveform, qh.j().setUsage(33).build());
                return;
            } else {
                vibrator.vibrate(vibrationEffectCreateWaveform, new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
                return;
            }
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            boolean z2 = ldgVar.j;
            int iB = d3m.b(this.a);
            StringBuilder sbB = zo5.B("can't start vibrate hasVibrator=", zHasVibrator, ", canVibrate=", z2, ", callVibrationEnabled=");
            if (iB == 1) {
                str = "ENABLED";
            } else if (iB != 2) {
                str = iB != 3 ? "null" : "UNKNOWN";
            } else {
                str = "DISABLED";
            }
            sbB.append(str);
            a4cVar.c(je9Var, "RingtoneManagerTag", sbB.toString(), null);
        }
    }

    public final void d() {
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "RingtoneManagerTag", " stop all", null);
        }
        e();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "RingtoneManagerTag", " stopVibrate", null);
        }
        ((Vibrator) this.f.getValue()).cancel();
    }

    public final void e() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "RingtoneManagerTag", " stop ringtone", null);
            }
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ((m7g) this.d.getValue()).j();
        } else {
            ore.k("Main (UI) thread expected");
        }
    }
}

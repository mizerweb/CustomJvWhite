package defpackage;

import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e41 b;

    public /* synthetic */ c41(e41 e41Var, int i) {
        this.a = i;
        this.b = e41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb0 zb0Var;
        int i = this.a;
        e41 e41Var = this.b;
        switch (i) {
            case 0:
                e41Var.k.set(false);
                ac0 ac0Var = e41Var.g;
                ac0Var.a();
                if (ac0Var.d.getAndSet(false)) {
                    ac0Var.a.stop();
                    if (ac0Var.a.getRecordingState() != 1) {
                        tvj.g("AudioStreamImpl", "Failed to stop AudioRecord with state: " + ac0Var.a.getRecordingState());
                    }
                    if (sk5.a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                        ac0Var.a.release();
                        ac0Var.a = ac0.b(ac0Var.f, ac0Var.b, null);
                    }
                }
                e41Var.c.clear();
                synchronized (e41Var.e) {
                    e41Var.f = null;
                    break;
                }
                return;
            case 1:
                try {
                    e41Var.g.d();
                    if (e41Var.k.getAndSet(true)) {
                        return;
                    }
                    e41Var.b();
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    qr7.o(e);
                    return;
                }
            case 2:
                e41Var.b();
                return;
            default:
                e41Var.k.set(false);
                ac0 ac0Var2 = e41Var.g;
                if (!ac0Var2.c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (zb0Var = ac0Var2.k) != null) {
                        io.n(ac0Var2.a, zb0Var);
                    }
                    ac0Var2.a.release();
                }
                e41Var.c.clear();
                synchronized (e41Var.e) {
                    e41Var.f = null;
                    break;
                }
                return;
        }
    }
}

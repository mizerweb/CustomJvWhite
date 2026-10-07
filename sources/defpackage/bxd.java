package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bxd {
    public final ifh a;
    public final ifh b;
    public final ifh c;
    public final ifh d;
    public volatile boolean e;
    public volatile PowerManager.WakeLock f;
    public volatile due g;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public bxd(ny8 ny8Var) {
        this.a = new ifh(new fu(ny8Var, 11));
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: ywd
            public final /* synthetic */ bxd b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                bxd bxdVar = this.b;
                switch (i2) {
                    case 0:
                        return ((SensorManager) bxdVar.a.getValue()).getDefaultSensor(8);
                    default:
                        return new zwd(0, bxdVar);
                }
            }
        });
        this.c = new ifh(new fu(ny8Var, 12));
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: ywd
            public final /* synthetic */ bxd b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                bxd bxdVar = this.b;
                switch (i3) {
                    case 0:
                        return ((SensorManager) bxdVar.a.getValue()).getDefaultSensor(8);
                    default:
                        return new zwd(0, bxdVar);
                }
            }
        });
    }

    public final void a() {
        Sensor sensor;
        if (this.f == null && (sensor = (Sensor) this.b.getValue()) != null) {
            try {
                this.f = ((PowerManager) this.c.getValue()).newWakeLock(32, "max:proximity_helper");
                ((SensorManager) this.a.getValue()).registerListener((SensorEventListener) this.d.getValue(), sensor, 3);
            } catch (Exception e) {
                gm0.X("ProximityHelperTag", e, e.getMessage(), new Object[0]);
            }
        }
    }

    public final void b() {
        if (this.f == null || ((Sensor) this.b.getValue()) == null) {
            return;
        }
        PowerManager.WakeLock wakeLock = this.f;
        try {
            ((SensorManager) this.a.getValue()).unregisterListener((SensorEventListener) this.d.getValue());
            if (wakeLock != null && wakeLock.isHeld()) {
                wakeLock.release(1);
            }
        } catch (Exception e) {
            gm0.X("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        } finally {
            this.f = null;
        }
    }

    public final void c() {
        try {
            PowerManager.WakeLock wakeLock = this.f;
            if (wakeLock != null) {
                wakeLock.acquire();
            }
            due dueVar = this.g;
            if (dueVar != null) {
                dueVar.C(false);
            }
        } catch (Exception e) {
            gm0.X("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.f;
        if (wakeLock == null) {
            return;
        }
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release(1);
                due dueVar = this.g;
                if (dueVar != null) {
                    dueVar.C(true);
                }
            }
        } catch (Exception e) {
            gm0.X("ProximityHelperTag", e, e.getMessage(), new Object[0]);
        }
    }
}

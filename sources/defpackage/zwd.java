package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zwd implements SensorEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zwd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.a) {
            case 0:
                if (((bxd) this.b).f != null) {
                    boolean z = ((double) sensorEvent.values[0]) < Math.min((double) sensorEvent.sensor.getMaximumRange(), 3.0d);
                    if (z != ((bxd) this.b).e) {
                        ((bxd) this.b).e = z;
                        boolean z2 = ((bxd) this.b).e;
                        CopyOnWriteArraySet copyOnWriteArraySet = ((bxd) this.b).h;
                        if (!z2) {
                            Iterator it = copyOnWriteArraySet.iterator();
                            while (it.hasNext()) {
                                ((axd) it.next()).b();
                            }
                        } else {
                            Iterator it2 = copyOnWriteArraySet.iterator();
                            while (it2.hasNext()) {
                                ((axd) it2.next()).a();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                vwf vwfVar = (vwf) this.b;
                if (jCurrentTimeMillis - vwfVar.f >= 1000) {
                    float[] fArr = sensorEvent.values;
                    if (fArr.length >= 3) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float f3 = fArr[2];
                        if ((f3 * f3) + (f2 * f2) + (f * f) > 865.53345f) {
                            vwfVar.f = jCurrentTimeMillis;
                            vuf vufVar = vwfVar.e;
                            if (vufVar != null) {
                                wwf wwfVar = (wwf) vufVar.b;
                                if (((Boolean) ((af7) wwfVar.c).invoke()).booleanValue()) {
                                    ((af7) wwfVar.d).invoke();
                                }
                            }
                        }
                        break;
                    } else {
                        String str = vwfVar.a;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, c0a.k(fArr.length, "Shake ignored: not enough sensor values. Expected 3 (x,y,z), got ", "."), null);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}

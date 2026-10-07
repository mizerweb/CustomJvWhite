package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class wwf {
    public final String a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public wwf(ny8 ny8Var, af7 af7Var, af7 af7Var2) {
        this.c = af7Var;
        this.d = af7Var2;
        this.a = wwf.class.getName();
        this.e = rx8.P(3, new eke(ny8Var, 4));
    }

    public bie a() {
        return new bie(this.a, (String) this.e, this.b, (Bundle) this.d, (HashSet) this.c);
    }

    public void b() {
        ((CidLogger) this.d).log("Condition", "Condition # " + this.a + " - 🔥 " + ((AtomicLong) this.e).incrementAndGet());
        synchronized (this) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Is already fired");
                }
                this.b = true;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj;
                    ((CidLogger) this.d).log("Condition", "Condition # " + this.a + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.e).incrementAndGet());
                    ((Runnable) pair.second).run();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        this.e = str;
    }

    public void d() {
        if (this.b) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Shaking is already being tracked, aborting tracking start", null);
                return;
            }
            return;
        }
        this.b = true;
        ((vwf) ((ny8) this.e).getValue()).e = new vuf(2, this);
        vwf vwfVar = (vwf) ((ny8) this.e).getValue();
        Sensor sensor = (Sensor) vwfVar.c.getValue();
        if (sensor == null) {
            return;
        }
        ((SensorManager) vwfVar.b.getValue()).registerListener((SensorEventListener) vwfVar.d.getValue(), sensor, 2);
    }

    public void e() {
        if (this.b) {
            this.b = false;
            vwf vwfVar = (vwf) ((ny8) this.e).getValue();
            ((SensorManager) vwfVar.b.getValue()).unregisterListener((SensorEventListener) vwfVar.d.getValue());
            vwfVar.f = 0L;
            ((vwf) ((ny8) this.e).getValue()).e = null;
            return;
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.e;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Shaking has already stopped being tracked, aborting tracking stop", null);
        }
    }

    public wwf(String str, CidLogger cidLogger) {
        this.b = false;
        this.c = new ArrayList();
        this.e = new AtomicLong();
        this.a = str;
        this.d = cidLogger;
    }

    public wwf() {
        this.c = new HashSet();
        this.d = new Bundle();
        this.b = true;
        this.a = "ru.ok.tamtam.extra.TEXT_REPLY";
    }
}

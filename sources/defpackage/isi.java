package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isi {
    public static final Map a = Collections.synchronizedMap(new WeakHashMap());

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = a;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new jsi());
            }
            jsi jsiVar = (jsi) map.get(velocityTracker);
            long[] jArr = jsiVar.b;
            long eventTime = motionEvent.getEventTime();
            if (jsiVar.d != 0 && eventTime - jArr[jsiVar.e] > 40) {
                jsiVar.d = 0;
                jsiVar.c = 0.0f;
            }
            int i = (jsiVar.e + 1) % 20;
            jsiVar.e = i;
            int i2 = jsiVar.d;
            if (i2 != 20) {
                jsiVar.d = i2 + 1;
            }
            jsiVar.a[i] = motionEvent.getAxisValue(26);
            jArr[jsiVar.e] = eventTime;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001e A[PHI: r5
  0x001e: PHI (r5v5 float) = (r5v0 float), (r5v0 float), (r5v0 float), (r5v2 float) binds: [B:5:0x001c, B:11:0x0042, B:15:0x004e, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public static void b(VelocityTracker velocityTracker) {
        long j;
        int i;
        float f;
        float f2;
        long[] jArr;
        float f3 = Float.MAX_VALUE;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        jsi jsiVar = (jsi) a.get(velocityTracker);
        if (jsiVar != null) {
            float[] fArr = jsiVar.a;
            long[] jArr2 = jsiVar.b;
            int i2 = jsiVar.d;
            float fSqrt = 0.0f;
            if (i2 < 2) {
                f = Float.MAX_VALUE;
            } else {
                int i3 = jsiVar.e;
                int i4 = ((i3 + 20) - (i2 - 1)) % 20;
                long j2 = jArr2[i3];
                while (true) {
                    j = jArr2[i4];
                    long j3 = j2 - j;
                    i = jsiVar.d;
                    if (j3 <= 100) {
                        break;
                    }
                    jsiVar.d = i - 1;
                    i4 = (i4 + 1) % 20;
                }
                if (i < 2) {
                    f = Float.MAX_VALUE;
                } else if (i == 2) {
                    int i5 = (i4 + 1) % 20;
                    long j4 = jArr2[i5];
                    if (j != j4) {
                        fSqrt = fArr[i5] / (j4 - j);
                    }
                    f = Float.MAX_VALUE;
                } else {
                    int i6 = 0;
                    int i7 = 0;
                    float fAbs = 0.0f;
                    while (true) {
                        if (i6 >= jsiVar.d - 1) {
                            break;
                        }
                        int i8 = i6 + i4;
                        long j5 = jArr2[i8 % 20];
                        int i9 = (i8 + 1) % 20;
                        if (jArr2[i9] == j5) {
                            f2 = f3;
                            jArr = jArr2;
                        } else {
                            i7++;
                            f2 = f3;
                            jArr = jArr2;
                            float fSqrt2 = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i9] / (jArr[i9] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i7 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                        i6++;
                        f3 = f2;
                        jArr2 = jArr;
                    }
                    f = f3;
                    fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            jsiVar.c = f5;
            if (f5 < (-Math.abs(f))) {
                jsiVar.c = -Math.abs(f);
            } else if (jsiVar.c > Math.abs(f)) {
                jsiVar.c = Math.abs(f);
            }
        }
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return v4.c(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        jsi jsiVar = (jsi) a.get(velocityTracker);
        if (jsiVar == null || i != 26) {
            return 0.0f;
        }
        return jsiVar.c;
    }
}

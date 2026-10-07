package defpackage;

import android.util.Range;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e86(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nib nibVar;
        int i = this.a;
        long j = this.c;
        long j2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                m86 m86Var = (m86) obj;
                String str = m86Var.a;
                int i2 = 1;
                switch (qt4.D(m86Var.F)) {
                    case 0:
                    case 3:
                    case 7:
                        break;
                    case 1:
                    case 2:
                        int i3 = m86Var.F;
                        m86Var.j(4);
                        Long l = (Long) m86Var.v.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == BuildConfig.MAX_TIME_TO_UPLOAD) {
                            c.e("There should be a \"start\" before \"stop\"");
                        } else {
                            if (j2 != -1) {
                                if (j2 < jLongValue) {
                                    tvj.g(str, "The expected stop time is less than the start time. Use current time as stop time.");
                                } else {
                                    j = j2;
                                }
                            }
                            if (j < jLongValue) {
                                c.e("The start time should be before the stop time.");
                            } else {
                                m86Var.v = Range.create(l, Long.valueOf(j));
                                tvj.a(str, "Stop on ".concat(vql.c(j)));
                                if (i3 == 3 && m86Var.y != null) {
                                    m86Var.k();
                                } else {
                                    m86Var.x = true;
                                    m86Var.z = zjl.d().schedule(new a86(m86Var, i2), 1000L, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                        break;
                    case 4:
                    case 5:
                        m86Var.j(1);
                        break;
                    case 6:
                    case 8:
                        ore.k("Encoder is released");
                        break;
                    default:
                        ore.k("Unknown state: ".concat(x05.r(m86Var.F)));
                        break;
                }
                break;
            default:
                oc8 oc8Var = (oc8) obj;
                StringBuilder sbS = qt4.s(j2, "startTimer: chatId = ", ", sender = ");
                sbS.append(j);
                gm0.n("oc8", sbS.toString());
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map mapA = oc8Var.a(j2);
                if (mapA != null && (nibVar = (nib) mapA.get(Long.valueOf(j))) != null) {
                    long j3 = nibVar.a;
                    StringBuilder sb = new StringBuilder("startTimer: now - userTime = ");
                    long j4 = jCurrentTimeMillis - j3;
                    sb.append(j4);
                    gm0.n("oc8", sb.toString());
                    if (j4 >= 6000) {
                        oc8Var.e(j2, j);
                    }
                    break;
                }
                break;
        }
    }
}

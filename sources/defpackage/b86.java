package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b86 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m86 b;
    public final /* synthetic */ long c;

    public /* synthetic */ b86(m86 m86Var, long j, int i) {
        this.a = i;
        this.b = m86Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m86 m86Var = this.b;
                long j = this.c;
                switch (qt4.D(m86Var.F)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        break;
                    case 1:
                        tvj.a(m86Var.a, "Pause on ".concat(vql.c(j)));
                        m86Var.o.addLast(Range.create(Long.valueOf(j), Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD)));
                        m86Var.j(3);
                        break;
                    case 4:
                        m86Var.j(6);
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
                m86 m86Var2 = this.b;
                long j2 = this.c;
                switch (qt4.D(m86Var2.F)) {
                    case 0:
                        m86Var2.y = null;
                        tvj.a(m86Var2.a, "Start on ".concat(vql.c(j2)));
                        try {
                            if (m86Var2.B) {
                                m86Var2.h();
                            }
                            m86Var2.v = Range.create(Long.valueOf(j2), Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD));
                            tvj.a(m86Var2.a, "mMediaCodec.start()");
                            m86Var2.e.start();
                            t76 t76Var = m86Var2.f;
                            if (t76Var instanceof i86) {
                                ((i86) t76Var).a(true);
                            }
                            m86Var2.j(2);
                        } catch (MediaCodec.CodecException e) {
                            m86Var2.b(1, e.getMessage(), e);
                        }
                        break;
                    case 1:
                    case 4:
                    case 7:
                        break;
                    case 2:
                        m86Var2.y = null;
                        Range range = (Range) m86Var2.o.removeLast();
                        qyj.l("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == BuildConfig.MAX_TIME_TO_UPLOAD);
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        m86Var2.o.addLast(Range.create(l, Long.valueOf(j2)));
                        tvj.a(m86Var2.a, "Resume on " + vql.c(j2) + "\nPaused duration = " + vql.c(j2 - jLongValue));
                        if ((m86Var2.c || sk5.a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!m86Var2.c || sk5.a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            m86Var2.i(false);
                            t76 t76Var2 = m86Var2.f;
                            if (t76Var2 instanceof i86) {
                                ((i86) t76Var2).a(true);
                            }
                        }
                        if (m86Var2.c) {
                            m86Var2.g();
                        }
                        m86Var2.j(2);
                        break;
                    case 3:
                    case 5:
                        m86Var2.j(5);
                        break;
                    case 6:
                    case 8:
                        ore.k("Encoder is released");
                        break;
                    default:
                        ore.k("Unknown state: ".concat(x05.r(m86Var2.F)));
                        break;
                }
                break;
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.media3.common.ParserException;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ax {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static to8 a() {
        try {
            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    return new to8(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            }
            return null;
        } catch (NumberFormatException unused2) {
        }
    }

    public static c8 b(Context context, Integer num, Integer num2, int i) {
        int iI0;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        c8 c8Var = new c8(context, 1);
        c8Var.setId(R.id.swipe_fade);
        c8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (num != null) {
            iI0 = num.intValue();
        } else if (num2 != null) {
            iI0 = oc9.Z(num2.intValue(), pq3.j.e(context).m());
        } else {
            iI0 = tre.I0(-16777216, 0.5f);
        }
        c8Var.setBackgroundColor(iI0);
        return c8Var;
    }

    public static int c(mo2 mo2Var) throws ParserException {
        int i = mo2Var.i(4);
        if (i == 15) {
            if (mo2Var.b() >= 24) {
                return mo2Var.i(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (i < 13) {
            return a[i];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static d d(mo2 mo2Var, boolean z) throws ParserException {
        int i = mo2Var.i(5);
        if (i == 31) {
            i = mo2Var.i(6) + 32;
        }
        int iC = c(mo2Var);
        int i2 = mo2Var.i(4);
        String strH = zo5.h(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            iC = c(mo2Var);
            int i3 = mo2Var.i(5);
            if (i3 == 31) {
                i3 = mo2Var.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = mo2Var.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i);
                }
            }
            if (mo2Var.h()) {
                lvb.G0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (mo2Var.h()) {
                mo2Var.t(14);
            }
            boolean zH = mo2Var.h();
            if (i2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i == 6 || i == 20) {
                mo2Var.t(3);
            }
            if (zH) {
                if (i == 22) {
                    mo2Var.t(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    mo2Var.t(3);
                }
                mo2Var.t(1);
            }
            switch (i) {
                case 17:
                case 19:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                    int i4 = mo2Var.i(2);
                    if (i4 == 2 || i4 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + i4);
                    }
                    break;
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new d(iC, i5, strH);
        }
        throw ParserException.a(null, null);
    }
}

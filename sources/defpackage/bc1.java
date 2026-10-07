package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bc1 {
    public static final String a(int i) {
        switch (i) {
            case 1:
                return "initial";
            case 2:
                return "started";
            case 3:
                return "ringing";
            case 4:
                return "wait_room";
            case 5:
                return "connecting";
            case 6:
                return "connected";
            case 7:
                return "disconnected";
            case 8:
                return "ended";
            default:
                throw null;
        }
    }

    public static final String b(int i) {
        if (i == 1) {
            return "IN";
        }
        if (i == 2) {
            return "OUT";
        }
        throw null;
    }

    public static final long c(int i) {
        if (i == 1) {
            return 1L;
        }
        if (i == 2) {
            return 2L;
        }
        throw null;
    }

    public static final String d(int i) {
        if (i == 1) {
            return "COPY_LINK";
        }
        if (i == 2) {
            return "INSIDE_SHARE";
        }
        if (i == 3) {
            return "OUTSIDE_SHARE";
        }
        throw null;
    }

    public static int e(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("PIP")) {
            return 1;
        }
        if (str.equals("FIRST")) {
            return 2;
        }
        if (str.equals("OTHER")) {
            return 3;
        }
        if (str.equals("GLOBAL_PIP")) {
            return 4;
        }
        ore.p("No enum constant one.me.calls.ui.deeplink.CallDeepLinkFactory.Place.".concat(str));
        return 0;
    }

    public static int f(float f) {
        return gm0.K(yl5.c() * f);
    }

    public static int g(float f, float f2, int i, int i2) {
        return (gm0.K(f * f2) * i) + i2;
    }

    public static int h(int i, int i2, ynh ynhVar) {
        return (ynhVar.hashCode() + i) * i2;
    }

    public static ViewStub i(Context context, int i) {
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(i);
        return viewStub;
    }

    public static LinearLayout j(Context context, ViewGroup.LayoutParams layoutParams, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static Integer k(float f, float f2) {
        return Integer.valueOf(gm0.K(f * f2));
    }

    public static String l(long j, String str, String str2, boolean z) {
        return str + j + str2 + z;
    }

    public static String m(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void o(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                ore.a();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void p(String str, i64 i64Var) {
        i64Var.j0(new CameraControl$OperationCanceledException(str));
    }

    public static void q(String str, ic6 ic6Var) {
        a8j.x(ic6Var, new i65(str));
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "PENDING";
        }
        if (i == 2) {
            return "CREATING";
        }
        if (i == 3) {
            return "CREATED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "GOOD";
        }
        if (i != 2) {
            return i != 3 ? "null" : "BAD";
        }
        return "MEDIUM";
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "VIDEO";
        }
        return "AUDIO";
    }

    public static /* synthetic */ String v(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "MIDDLE";
        }
        return "END";
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "OFF";
        }
        if (i == 2) {
            return "ON";
        }
        if (i != 3) {
            return i != 4 ? "null" : "TORCH";
        }
        return "AUTO";
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "FRONT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "UNKNOWN";
        }
        return "BACK";
    }
}

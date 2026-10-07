package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x05 {
    public static final d25 a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ALREADY_DOWNLOADING";
                break;
            case 2:
                str = "FILE_IS_NULL";
                break;
            case 3:
                str = "INTERRUPTED";
                break;
            case 4:
                str = "FAIL";
                break;
            case 5:
                str = "CANCELLED";
                break;
            case 6:
                str = "MAX_FAIL_COUNT";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            default:
                throw null;
        }
        ylc[] ylcVarArr = {new ylc("state", str)};
        w4 w4Var = new w4(6, false);
        ylc ylcVar = ylcVarArr[0];
        w4Var.n(ylcVar.b, (String) ylcVar.a);
        return w4Var.e();
    }

    public static int b(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static vwd c(z05 z05Var, int i) {
        return dp5.a(new y05(z05Var, i));
    }

    public static qbh d(sbh sbhVar, rbh rbhVar, qbh qbhVar, ArrayList arrayList, qbh qbhVar2) {
        qbhVar.a(yr8.m(sbhVar, rbhVar));
        arrayList.add(qbhVar2);
        return new qbh();
    }

    public static qbh e(ArrayList arrayList, qbh qbhVar) {
        arrayList.add(qbhVar);
        return new qbh();
    }

    public static /* synthetic */ String f(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (str.length() > 33554431) {
            throw new OutOfMemoryError("Repeating " + str.length() + " bytes String 64 times will produce a String exceeding maximum size.");
        }
        StringBuilder sb = new StringBuilder(length * 64);
        for (int i = 0; i < 64; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String g(String str, tnh tnhVar, String str2) {
        return str + tnhVar + str2;
    }

    public static String h(String str, String str2, Throwable th) {
        return str + th + str2;
    }

    public static String i(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static void j(float f, float f2, ImageView imageView) {
        int iK = gm0.K(f * f2);
        imageView.setPadding(iK, iK, iK, iK);
    }

    public static void k(sbh sbhVar, rbh rbhVar, qbh qbhVar, sbh sbhVar2, rbh rbhVar2) {
        qbhVar.a(yr8.m(sbhVar, rbhVar));
        qbhVar.a(yr8.m(sbhVar2, rbhVar2));
    }

    public static /* synthetic */ void l(Object obj) throws Exception {
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

    public static void m(String str, String str2, ArrayList arrayList) {
        arrayList.add(new ylc(str, str2));
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "LINE";
        }
        if (i == 2) {
            return "CUBIC_BEZIER";
        }
        if (i == 3) {
            return "ARROW";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "MIGRATION";
        }
        if (i != 2) {
            return i != 3 ? "null" : "SYSTEM_CORRUPTION";
        }
        return "VERSION_MISMATCH";
    }

    public static /* synthetic */ String p(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "ACTIVITY";
        }
        return "DEFAULT";
    }

    public static /* synthetic */ String q(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "VIDEO";
        }
        return "AUDIO";
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("LINE")) {
            return 1;
        }
        if (str.equals("CUBIC_BEZIER")) {
            return 2;
        }
        if (str.equals("ARROW")) {
            return 3;
        }
        ore.p("No enum constant one.me.photoeditor.state.DrawingPrimitive.Type.".concat(str));
        return 0;
    }
}

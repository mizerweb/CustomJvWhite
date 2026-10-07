package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class tk9 implements Printer {
    public long a;
    public long b;
    public long c;
    public final LinkedList d = new LinkedList();

    public static String a(String str) {
        int iV0;
        String strF1 = r5h.f1(r5h.f1(str, ">>>>> Dispatching to "), "<<<<< Finished to ");
        int iZ0 = r5h.Z0(": ", strF1, 6);
        int iV1 = r5h.V0(strF1, "} ", 0, false, 6);
        String strSubstring = strF1.substring(0, iV1 + 1);
        if (iZ0 <= 0 && iV1 <= 0) {
            return strF1;
        }
        int iV2 = r5h.V0(strF1, "DispatchedContinuation[Dispatchers.Main", 0, false, 6);
        if (iV2 >= 0) {
            int i = iV2 + 39;
            int iV3 = r5h.V0(strF1, ".immediate", i, false, 4);
            iV0 = iV3 >= 0 ? r5h.V0(strF1, ", Continuation at ", iV3 + 10, false, 4) : r5h.V0(strF1, ", Continuation at ", i, false, 4);
            if (iV0 >= 0) {
                iV0 += 18;
            }
        } else {
            iV0 = iV1 + 2;
        }
        int iY0 = r5h.Y0(strF1, ']', 0, 6);
        Integer numValueOf = Integer.valueOf(iY0);
        if (iY0 <= iV0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : strF1.length();
        int iY1 = r5h.Y0(strF1, '@', 0, 6);
        Integer numValueOf2 = iY1 > iV0 ? Integer.valueOf(iY1) : null;
        String strSubstring2 = strF1.substring(iV0, Math.min(numValueOf2 != null ? numValueOf2.intValue() : strF1.length(), iIntValue));
        return !strSubstring2.equals("null") ? strSubstring2 : zo5.p(strSubstring, " ", strF1.substring(iZ0 + 2));
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str != null) {
            if (z5h.K0(str, ">>>>> Dispatching to ", false)) {
                String strA = a(str);
                if (cqk.y()) {
                    cqk.f(strA);
                }
                this.a = SystemClock.uptimeMillis();
                this.c++;
                return;
            }
            if (z5h.K0(str, "<<<<< Finished to ", false)) {
                if (cqk.y()) {
                    Trace.endSection();
                }
                this.c--;
                this.b = System.currentTimeMillis();
                this.d.add(new sk9(this.a, this.b, this.c, a(str)));
                this.a = 0L;
                this.b = 0L;
            }
        }
    }
}

package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class xp3 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public xp3(ap9 ap9Var, gve gveVar) {
        this.a = 3;
        this.c = new AtomicInteger(0);
        int iIntValue = ((Number) ap9Var.invoke()).intValue() + 1;
        ((s7f) gveVar.a).d(iIntValue, "request_id");
        this.b = ((long) iIntValue) << 32;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        xp3 xp3Var = (xp3) this.c;
        if (xp3Var != null) {
            xp3Var.a(i - 64);
        }
    }

    public int b(int i) {
        xp3 xp3Var = (xp3) this.c;
        if (xp3Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + xp3Var.b(i - 64);
    }

    public void c() {
        if (((xp3) this.c) == null) {
            this.c = new xp3();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((xp3) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((xp3) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            a(i);
        }
        if (z2 || ((xp3) this.c) != null) {
            c();
            ((xp3) this.c).e(0, z2);
        }
    }

    public hu7 f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strJ = ((y41) this.c).j(this.b);
            this.b -= (long) strJ.length();
            if (strJ.length() == 0) {
                return new hu7((String[]) arrayList.toArray(new String[0]));
            }
            int iU0 = r5h.U0(strJ, ':', 1, 4);
            if (iU0 != -1) {
                String strSubstring = strJ.substring(0, iU0);
                String strSubstring2 = strJ.substring(iU0 + 1);
                arrayList.add(strSubstring);
                arrayList.add(r5h.y1(strSubstring2).toString());
            } else if (strJ.charAt(0) == ':') {
                String strSubstring3 = strJ.substring(1);
                arrayList.add("");
                arrayList.add(r5h.y1(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(r5h.y1(strJ).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((xp3) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        xp3 xp3Var = (xp3) this.c;
        if (xp3Var != null) {
            if (xp3Var.d(0)) {
                i(63);
            }
            ((xp3) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        xp3 xp3Var = (xp3) this.c;
        if (xp3Var != null) {
            xp3Var.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((xp3) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((xp3) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((xp3) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public xp3(InetAddress[] inetAddressArr, long j) {
        this.a = 1;
        this.c = inetAddressArr;
        this.b = j;
        if (inetAddressArr.length == 0) {
            ore.k("Addresses MUST NOT be empty");
            throw null;
        }
    }

    public xp3(y41 y41Var) {
        this.a = 2;
        this.c = y41Var;
        this.b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public xp3() {
        this.a = 0;
        this.b = 0L;
    }
}

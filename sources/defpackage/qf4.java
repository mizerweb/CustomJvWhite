package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.media3.session.MediaSessionService;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qf4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public qf4(uj7 uj7Var) {
        this.a = 6;
        oc9.i(true);
        this.b = 16384;
        this.c = uj7Var;
    }

    public bsb a(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 4, i, 4);
        return new bsb(4, eg4Var, i2);
    }

    public bsb b(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 4, i, 3);
        return new bsb(4, eg4Var, i2);
    }

    public void c(int i) {
        zf4 zf4Var;
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        HashMap map = eg4Var.c;
        if (!map.containsKey(Integer.valueOf(i2)) || (zf4Var = (zf4) map.get(Integer.valueOf(i2))) == null) {
            return;
        }
        ag4 ag4Var = zf4Var.d;
        switch (i) {
            case 1:
                ag4Var.i = -1;
                ag4Var.h = -1;
                ag4Var.F = -1;
                ag4Var.M = Integer.MIN_VALUE;
                break;
            case 2:
                ag4Var.k = -1;
                ag4Var.j = -1;
                ag4Var.G = -1;
                ag4Var.O = Integer.MIN_VALUE;
                break;
            case 3:
                ag4Var.m = -1;
                ag4Var.l = -1;
                ag4Var.H = 0;
                ag4Var.N = Integer.MIN_VALUE;
                break;
            case 4:
                ag4Var.n = -1;
                ag4Var.o = -1;
                ag4Var.I = 0;
                ag4Var.P = Integer.MIN_VALUE;
                break;
            case 5:
                ag4Var.p = -1;
                ag4Var.q = -1;
                ag4Var.r = -1;
                ag4Var.L = 0;
                ag4Var.S = Integer.MIN_VALUE;
                break;
            case 6:
                ag4Var.s = -1;
                ag4Var.t = -1;
                ag4Var.K = 0;
                ag4Var.R = Integer.MIN_VALUE;
                break;
            case 7:
                ag4Var.u = -1;
                ag4Var.v = -1;
                ag4Var.J = 0;
                ag4Var.Q = Integer.MIN_VALUE;
                break;
            case 8:
                ag4Var.B = -1.0f;
                ag4Var.A = -1;
                ag4Var.z = -1;
                break;
            default:
                ore.p("unknown constraint");
                break;
        }
    }

    public void d() {
        ((eg4) this.c).g(this.b).d.l0 = true;
    }

    public void e(InputStream inputStream, OutputStream outputStream) {
        uj7 uj7Var = (uj7) this.c;
        int i = this.b;
        byte[] bArr = (byte[]) uj7Var.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    uj7Var.d(bArr);
                    return;
                }
                outputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                uj7Var.d(bArr);
                throw th;
            }
        }
    }

    public bsb f(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 7, i, 7);
        return new bsb(7, eg4Var, i2);
    }

    public bsb g(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 7, i, 6);
        return new bsb(7, eg4Var, i2);
    }

    public void h(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public vac i() {
        return (vac) this.c;
    }

    public int j() {
        return this.b;
    }

    public Intent k(k2a k2aVar, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(k2aVar.a.b);
        MediaSessionService mediaSessionService = (MediaSessionService) this.c;
        intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public boolean l() {
        return this.b < ((ArrayList) this.c).size();
    }

    public void m() {
        ws2 ws2Var = ws2.c;
        char[] cArr = (char[]) this.c;
        synchronized (ws2Var) {
            int i = ws2Var.b;
            if (cArr.length + i < nw.a) {
                ws2Var.b = i + cArr.length;
                ws2Var.a.addLast(cArr);
            }
        }
    }

    public bsb n(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 6, i, 7);
        return new bsb(6, eg4Var, i2);
    }

    public bsb o(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 6, i, 6);
        return new bsb(6, eg4Var, i2);
    }

    public bsb p(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 3, i, 4);
        return new bsb(3, eg4Var, i2);
    }

    public bsb q(int i) {
        eg4 eg4Var = (eg4) this.c;
        int i2 = this.b;
        eg4Var.d(i2, 3, i, 3);
        return new bsb(3, eg4Var, i2);
    }

    public void r() {
        ((eg4) this.c).g(this.b).d.W = 2;
    }

    public void s(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    public qf4() {
        this.a = 5;
        this.b = 50;
    }

    public qf4(eg4 eg4Var, int i) {
        this.a = 0;
        this.c = eg4Var;
        this.b = i;
    }

    public /* synthetic */ qf4(int i) {
        this.a = i;
    }

    public qf4(MediaSessionService mediaSessionService) {
        this.a = 1;
        this.b = 0;
        this.c = mediaSessionService;
    }

    public qf4(ArrayList arrayList) {
        this.a = 8;
        this.c = arrayList;
    }

    public qf4(boolean z, boolean z2, boolean z3) {
        this.a = 3;
        this.b = (z || z2 || z3) ? 1 : 0;
    }

    public qf4(int i, vac vacVar) {
        this.a = 4;
        this.b = i;
        this.c = vacVar;
    }
}

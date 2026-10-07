package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public class s74 {
    public boolean a;
    public final Object b;

    public s74(int i) {
        switch (i) {
            case 2:
                this.a = false;
                this.b = new Object();
                break;
            default:
                this.b = new SparseBooleanArray();
                break;
        }
    }

    public void a(int i) {
        lvb.b0(!this.a);
        ((SparseBooleanArray) this.b).append(i, true);
    }

    public void b(cx6 cx6Var) {
        for (int i = 0; i < cx6Var.a.size(); i++) {
            a(cx6Var.b(i));
        }
    }

    public void c(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public cx6 d() {
        lvb.b0(!this.a);
        this.a = true;
        return new cx6((SparseBooleanArray) this.b);
    }

    public void e() {
        this.a = false;
    }

    public void f(byte b) {
        ((qf4) this.b).s(String.valueOf(b));
    }

    public void g(char c) {
        qf4 qf4Var = (qf4) this.b;
        qf4Var.h(qf4Var.b, 1);
        char[] cArr = (char[]) qf4Var.c;
        int i = qf4Var.b;
        qf4Var.b = i + 1;
        cArr[i] = c;
    }

    public void h(int i) {
        ((qf4) this.b).s(String.valueOf(i));
    }

    public void i(long j) {
        ((qf4) this.b).s(String.valueOf(j));
    }

    public void j(String str) {
        ((qf4) this.b).s(str);
    }

    public void k(short s) {
        ((qf4) this.b).s(String.valueOf(s));
    }

    public void l(String str) {
        byte b;
        qf4 qf4Var = (qf4) this.b;
        qf4Var.h(qf4Var.b, str.length() + 2);
        char[] cArr = (char[]) qf4Var.c;
        int i = qf4Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = m5h.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    qf4Var.h(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = m5h.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) qf4Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = m5h.a[cCharAt];
                        qf4Var.h(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) qf4Var.c, i4);
                        int length3 = str2.length() + i4;
                        qf4Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) qf4Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        qf4Var.b = i4;
                    }
                }
                qf4Var.h(i4, 1);
                ((char[]) qf4Var.c)[i4] = '\"';
                qf4Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        qf4Var.b = i3 + 1;
    }

    public void m() {
        synchronized (this.b) {
            this.a = true;
            this.b.notify();
        }
    }

    public void n() {
    }

    public void o() {
    }

    public void p(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = j + jCurrentTimeMillis;
        Object obj = this.b;
        if (j2 < jCurrentTimeMillis) {
            synchronized (obj) {
                while (!this.a) {
                    try {
                        this.b.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.a = false;
            }
            return;
        }
        synchronized (obj) {
            while (!this.a && jCurrentTimeMillis < j2) {
                try {
                    this.b.wait(j2 - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.a = false;
        }
    }

    public s74(qf4 qf4Var) {
        this.b = qf4Var;
        this.a = true;
    }
}

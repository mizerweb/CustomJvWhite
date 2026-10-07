package okhttp3.internal.publicsuffix;

import defpackage.cqk;
import defpackage.i2d;
import defpackage.nv8;
import defpackage.ore;
import defpackage.r30;
import defpackage.r5h;
import defpackage.r66;
import defpackage.rr7;
import defpackage.rx8;
import defpackage.sw;
import defpackage.u8e;
import defpackage.ww3;
import defpackage.xsb;
import defpackage.xsh;
import defpackage.yhf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "nv8", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = Collections.singletonList("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listL1 = r5h.l1(str, new char[]{'.'});
        return cqk.d(ww3.B1(listL1), "") ? ww3.m1(1, listL1) : listL1;
    }

    public final String a(String str) {
        String strC;
        String strC2;
        String strC3;
        List listL1;
        int size;
        int size2;
        List listC = c(IDN.toUnicode(str));
        List listL2 = r66.a;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        i2d i2dVar = i2d.a;
                        i2d.a.getClass();
                        i2d.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            ore.k("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i = 0; i < size3; i++) {
            bArr[i] = ((String) listC.get(i)).getBytes(StandardCharsets.UTF_8);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strC = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                bArr2 = null;
            }
            strC = nv8.c(bArr2, bArr, i2);
            if (strC != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strC2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strC2 = null;
                break;
            }
            bArr3[i3] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                bArr4 = null;
            }
            strC2 = nv8.c(bArr4, bArr3, i3);
            if (strC2 != null) {
                break;
            }
            i3++;
        }
        if (strC2 == null) {
            strC3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strC3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                bArr5 = null;
            }
            strC3 = nv8.c(bArr5, bArr, i5);
            if (strC3 != null) {
                break;
            }
            i5++;
        }
        if (strC3 != null) {
            listL1 = r5h.l1("!".concat(strC3), new char[]{'.'});
        } else if (strC == null && strC2 == null) {
            listL1 = f;
        } else {
            List listL3 = strC != null ? r5h.l1(strC, new char[]{'.'}) : listL2;
            if (strC2 != null) {
                listL2 = r5h.l1(strC2, new char[]{'.'});
            }
            listL1 = listL3.size() > listL2.size() ? listL3 : listL2;
        }
        if (listC.size() == listL1.size() && ((String) listL1.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listL1.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listL1.size();
        } else {
            size = listC.size();
            size2 = listL1.size() + 1;
        }
        return yhf.r0(yhf.l0(new sw(1, c(str)), size - size2), ".");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = xsb.a;
                u8e u8eVar = new u8e(new rr7(new r30(resourceAsStream, 1, new xsh())));
                try {
                    long j = u8eVar.readInt();
                    u8eVar.c0(j);
                    byte[] bArrI = u8eVar.b.I(j);
                    long j2 = u8eVar.readInt();
                    u8eVar.c0(j2);
                    byte[] bArrI2 = u8eVar.b.I(j2);
                    u8eVar.close();
                    synchronized (this) {
                        this.c = bArrI;
                        this.d = bArrI2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(u8eVar, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}

package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public final class v18 extends x1 {
    public static final byte[] i = {110, 117, 108, 108};
    public final OutputStream a;
    public final ArrayList b;
    public final String c;
    public final wj d = new wj(1);
    public final MessageDigest e;
    public final ckc f;
    public int g;
    public boolean h;

    public v18(OutputStream outputStream, ArrayList arrayList, String str) {
        OutputStream yfaVar;
        this.a = outputStream;
        this.b = arrayList;
        this.c = str;
        wki wkiVar = new wki(0, outputStream);
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                this.e = messageDigest;
                yfaVar = new yfa(wkiVar, messageDigest);
            } catch (NoSuchAlgorithmException e) {
                c.e(e);
                throw null;
            }
        } else {
            this.e = gib.a;
            yfaVar = wkiVar;
        }
        this.f = new ckc(yfaVar);
    }

    public final void A() throws IOException {
        wj wjVar = this.d;
        int iA = wjVar.a();
        if (iA == 1) {
            wjVar.c(2);
            this.a.write(61);
            this.e.update((byte) 61);
            return;
        }
        ckc ckcVar = this.f;
        if (iA == 4) {
            wjVar.c(5);
            ckcVar.write(58);
        } else if (iA == 6) {
            wjVar.c(7);
        } else {
            if (iA != 7) {
                throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
            }
            ckcVar.write(44);
        }
    }

    public final void E() {
        wj wjVar = this.d;
        if (wjVar.b != 0) {
            throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
        }
        boolean z = this.c != null;
        this.h = z;
        this.g = z ? 0 : -1;
        this.e.reset();
        wjVar.d(0);
        if (this.h) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((k5h) it.next()).b(this);
        }
    }

    public final void I() throws IOException {
        wj wjVar = this.d;
        if (wjVar.b != 1) {
            throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
        }
        int i2 = this.g;
        if (i2 >= 0) {
            this.g = -1;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((k5h) arrayList.get(i2)).b(this);
                i2++;
            }
        }
        if (this.h) {
            byte[] bytes = this.c.getBytes(pt2.a);
            MessageDigest messageDigest = this.e;
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            K("sig");
            A();
            for (byte b : bArrDigest) {
                int iA = k1m.a((b >> 4) & 15);
                OutputStream outputStream = this.a;
                outputStream.write(iA);
                outputStream.write(k1m.a(b & 15));
            }
            this.h = false;
        }
        wjVar.b();
    }

    @Override // defpackage.x1, defpackage.mv8
    public final void J0() throws IOException {
        A();
        if (this.d.a() == 2) {
            this.e.update(i);
            return;
        }
        ckc ckcVar = this.f;
        ckcVar.getClass();
        ckcVar.write("null", 0, 4);
    }

    public final void K(String str) throws IOException {
        wj wjVar = this.d;
        int iA = wjVar.a();
        ckc ckcVar = this.f;
        if (iA == 0) {
            wjVar.c(1);
            ckcVar.write(str);
            return;
        }
        if (iA == 5) {
            ckcVar.write(44);
            wjVar.c(4);
            zl2.c(ckcVar, str);
        } else if (iA == 2) {
            this.a.write(38);
            wjVar.c(1);
            ckcVar.write(str);
        } else {
            if (iA != 3) {
                throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
            }
            wjVar.c(4);
            zl2.c(ckcVar, str);
        }
    }

    @Override // defpackage.mv8
    public final void T(Reader reader) throws IOException {
        A();
        wj wjVar = this.d;
        int iA = wjVar.a();
        ckc ckcVar = this.f;
        if (iA == 2 || iA == 5) {
            ut8 ut8Var = new ut8(reader);
            b05.c(ut8Var, ckcVar);
            if (ut8Var.k0() == 0) {
                return;
            }
            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), ut8Var.k0());
        }
        if (iA != 6 && iA != 7) {
            throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
        }
        ut8 ut8Var2 = new ut8(reader);
        b05.c(ut8Var2, ckcVar);
        while (ut8Var2.k0() != 0) {
            ut8Var2.A(44);
            ut8Var2.l(ckcVar);
            b05.c(ut8Var2, ckcVar);
        }
    }

    @Override // defpackage.mv8
    public final mv8 a0(String str) throws IOException {
        int i2;
        int iA = this.d.a();
        if ((iA == 0 || iA == 2) && (i2 = this.g) >= 0) {
            this.g = -1;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                k5h k5hVar = (k5h) arrayList.get(i2);
                int iCompareTo = str.compareTo(k5hVar.a);
                if (iCompareTo < 0) {
                    break;
                }
                if (iCompareTo > 0) {
                    k5hVar.b(this);
                }
                i2++;
            }
            this.g = i2;
        }
        K(str);
        return this;
    }

    @Override // defpackage.x1
    public final void b(String str) throws IOException {
        A();
        ckc ckcVar = this.f;
        ckcVar.getClass();
        ckcVar.write(str, 0, str.length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
        int iA = this.d.a();
        if (iA != 0 && iA != 2) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f.flush();
    }

    @Override // defpackage.mv8
    public final void p() throws IOException {
        A();
        this.d.d(3);
        this.f.write(123);
    }

    @Override // defpackage.mv8
    public final void p0(String str) throws IOException {
        A();
        int iA = this.d.a();
        ckc ckcVar = this.f;
        if (iA != 2) {
            zl2.c(ckcVar, str);
            return;
        }
        if (str.length() == 0) {
            this.e.update(i);
        }
        ckcVar.getClass();
        ckcVar.write(str, 0, str.length());
    }

    @Override // defpackage.mv8
    public final void q() {
        wj wjVar = this.d;
        int iA = wjVar.a();
        if (iA != 6 && iA != 7) {
            throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
        }
        wjVar.b();
        this.f.write(93);
    }

    @Override // defpackage.mv8
    public final void r() throws IOException {
        A();
        this.d.d(6);
        this.f.write(91);
    }

    @Override // defpackage.mv8
    public final void t() {
        wj wjVar = this.d;
        int iA = wjVar.a();
        if (iA != 3 && iA != 5) {
            throw new JsonStateException("Nesting problem: ".concat(ou7.b(wjVar)));
        }
        wjVar.b();
        this.f.write(125);
    }
}

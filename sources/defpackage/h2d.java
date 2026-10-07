package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public final class h2d extends x1 {
    public final Writer a;
    public final wj b;

    public h2d(Writer writer) {
        wj wjVar = new wj(1);
        this.b = wjVar;
        this.a = writer;
        wjVar.d(0);
    }

    public static String E(wj wjVar) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = wjVar.b;
        if (i < 0) {
            ore.p(zo5.h(i, "Illegal Capacity: "));
            return null;
        }
        int[] iArr2 = new int[Math.max(i, 8)];
        int i2 = 0;
        while (wjVar.b != 0) {
            int iB = wjVar.b();
            int length = iArr2.length;
            if (i2 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i2] = iB;
            i2++;
            iArr2 = iArr;
        }
        while (i2 != 0) {
            if (i2 == 0) {
                qr7.d();
                return null;
            }
            i2--;
            int i3 = iArr2[i2];
            String str = "";
            switch (i3) {
                case 0:
                case 1:
                    break;
                case 2:
                case 3:
                    str = "[";
                    break;
                case 4:
                case 6:
                    str = "{";
                    break;
                case 5:
                    str = "{:";
                    break;
                default:
                    ore.p(zo5.h(i3, ""));
                    return null;
            }
            sb.append(str);
            wjVar.d(i3);
        }
        return sb.toString();
    }

    public final void A() throws IOException {
        wj wjVar = this.b;
        int iA = wjVar.a();
        if (iA == 0) {
            wjVar.c(1);
            return;
        }
        Writer writer = this.a;
        if (iA == 5) {
            writer.write(":");
            wjVar.c(6);
        } else if (iA == 2) {
            wjVar.c(3);
        } else {
            if (iA != 3) {
                throw new JsonStateException("Nesting problem: ".concat(E(wjVar)));
            }
            writer.write(44);
        }
    }

    @Override // defpackage.mv8
    public final void T(Reader reader) throws IOException {
        A();
        wj wjVar = this.b;
        int iA = wjVar.a();
        Writer writer = this.a;
        if (iA == 2 || iA == 3) {
            ut8 ut8Var = new ut8(reader);
            b05.c(ut8Var, writer);
            while (ut8Var.k0() != 0) {
                ut8Var.A(44);
                ut8Var.l(writer);
                b05.c(ut8Var, writer);
            }
            return;
        }
        if (iA != 6) {
            throw new JsonStateException("Nesting problem: ".concat(E(wjVar)));
        }
        ut8 ut8Var2 = new ut8(reader);
        b05.c(ut8Var2, writer);
        if (ut8Var2.k0() == 0) {
            return;
        }
        throw JsonSyntaxException.b(ut8Var2.d, ut8Var2.I(), ut8Var2.k0());
    }

    @Override // defpackage.mv8
    public final mv8 a0(String str) throws IOException {
        wj wjVar = this.b;
        int iA = wjVar.a();
        Writer writer = this.a;
        if (iA == 6) {
            writer.write(44);
        } else if (iA != 4) {
            throw new JsonStateException("Nesting problem: ".concat(E(wjVar)));
        }
        wjVar.c(5);
        zl2.c(writer, str);
        return this;
    }

    @Override // defpackage.x1
    public final void b(String str) throws IOException {
        A();
        this.a.write(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        if (this.b.a() != 1) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.mv8
    public final void p() throws IOException {
        A();
        this.b.d(4);
        this.a.write(123);
    }

    @Override // defpackage.mv8
    public final void p0(String str) throws IOException {
        A();
        zl2.c(this.a, str);
    }

    @Override // defpackage.mv8
    public final void q() throws IOException {
        wj wjVar = this.b;
        int iA = wjVar.a();
        if (iA != 3 && iA != 2) {
            throw new JsonStateException("Nesting problem: ".concat(E(wjVar)));
        }
        wjVar.b();
        this.a.write(93);
    }

    @Override // defpackage.mv8
    public final void r() throws IOException {
        A();
        this.b.d(2);
        this.a.write(91);
    }

    @Override // defpackage.mv8
    public final void t() throws IOException {
        wj wjVar = this.b;
        int iA = wjVar.a();
        if (iA != 6 && iA != 4) {
            throw new JsonStateException("Nesting problem: ".concat(E(wjVar)));
        }
        wjVar.b();
        this.a.write(125);
    }
}

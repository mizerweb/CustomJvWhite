package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class p76 implements Closeable {
    public final au3 a;
    public i68 b = i68.c;
    public int c = -1;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 1;
    public int h = -1;
    public ColorSpace i;
    public String j;

    public p76(au3 au3Var) {
        oc9.i(Boolean.valueOf(au3.W(au3Var)));
        this.a = au3Var.clone();
    }

    public static boolean I(p76 p76Var) {
        return p76Var.c >= 0 && p76Var.e >= 0 && p76Var.f >= 0;
    }

    public static boolean P(p76 p76Var) {
        return p76Var != null && p76Var.K();
    }

    public static p76 b(p76 p76Var) {
        p76 p76Var2 = null;
        if (p76Var == null) {
            return null;
        }
        au3 au3VarA = au3.A(p76Var.a);
        if (au3VarA != null) {
            try {
                p76Var2 = new p76(au3VarA);
            } catch (Throwable th) {
                au3VarA.close();
                throw th;
            }
        }
        au3.E(au3VarA);
        if (p76Var2 != null) {
            p76Var2.l(p76Var);
        }
        return p76Var2;
    }

    public static void g(p76 p76Var) {
        if (p76Var != null) {
            p76Var.close();
        }
    }

    public final InputStream A() {
        au3 au3VarA = au3.A(this.a);
        if (au3VarA == null) {
            return null;
        }
        try {
            return new fbd((cba) au3VarA.K());
        } finally {
            au3VarA.close();
        }
    }

    public final int E() {
        au3 au3Var = this.a;
        if (au3Var == null) {
            return this.h;
        }
        au3Var.K();
        return ((cba) au3Var.K()).I();
    }

    public final synchronized boolean K() {
        return au3.W(this.a);
    }

    public final void W() throws Throwable {
        InputStream inputStreamA = A();
        ny8 ny8Var = k68.d;
        ylc ylcVarZ = null;
        InputStream inputStreamA2 = null;
        ylcVarZ = null;
        ylcVarZ = null;
        ylcVarZ = null;
        ylcVarZ = null;
        ylcVarZ = null;
        ylcVarZ = null;
        ylcVarZ = null;
        try {
            i68 i68VarZ = vd7.z(inputStreamA);
            this.b = i68VarZ;
            if (i68VarZ == kb5.f || i68VarZ == kb5.g || i68VarZ == kb5.h || i68VarZ == kb5.i || i68VarZ == kb5.j) {
                InputStream inputStreamA3 = A();
                if (inputStreamA3 != null) {
                    byte[] bArr = new byte[4];
                    try {
                        try {
                            ((fbd) inputStreamA3).read(bArr, 0, 4);
                            if (p90.g(bArr, "RIFF")) {
                                p90.s(inputStreamA3);
                                ((fbd) inputStreamA3).read(bArr, 0, 4);
                                if (p90.g(bArr, "WEBP")) {
                                    ((fbd) inputStreamA3).read(bArr, 0, 4);
                                    StringBuilder sb = new StringBuilder();
                                    for (int i = 0; i < 4; i++) {
                                        sb.append((char) (bArr[i] & 65535));
                                    }
                                    String string = sb.toString();
                                    int iHashCode = string.hashCode();
                                    if (iHashCode != 2640674) {
                                        if (iHashCode != 2640718) {
                                            if (iHashCode == 2640730 && string.equals("VP8X")) {
                                                inputStreamA3.skip(8L);
                                                ylc ylcVar = new ylc(Integer.valueOf(((inputStreamA3.read() & 255) | ((inputStreamA3.read() & 255) << 8) | ((inputStreamA3.read() & 255) << 16)) + 1), Integer.valueOf(((inputStreamA3.read() & 255) | ((inputStreamA3.read() & 255) << 8) | ((inputStreamA3.read() & 255) << 16)) + 1));
                                                try {
                                                    inputStreamA3.close();
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                                ylcVarZ = ylcVar;
                                            }
                                        } else if (string.equals("VP8L")) {
                                            ylcVarZ = p90.A(inputStreamA3);
                                        }
                                    } else if (string.equals("VP8 ")) {
                                        ylcVarZ = p90.z(inputStreamA3);
                                    }
                                }
                                inputStreamA3.close();
                            } else {
                                try {
                                    inputStreamA3.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        if (ylcVarZ != null) {
                            this.e = ((Integer) ylcVarZ.a).intValue();
                            this.f = ((Integer) ylcVarZ.b).intValue();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamA3.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                }
            } else {
                try {
                    inputStreamA2 = A();
                    qg7 qg7VarA = oy0.a(inputStreamA2);
                    this.i = (ColorSpace) qg7VarA.b;
                    ylc ylcVar2 = (ylc) qg7VarA.c;
                    if (ylcVar2 != null) {
                        this.e = ((Integer) ylcVar2.a).intValue();
                        this.f = ((Integer) ylcVar2.b).intValue();
                    }
                    try {
                        inputStreamA2.close();
                    } catch (IOException unused) {
                    }
                    ylcVarZ = (ylc) qg7VarA.c;
                } catch (Throwable th2) {
                    if (inputStreamA2 != null) {
                        try {
                            inputStreamA2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            }
            if (i68VarZ == kb5.a && this.c == -1) {
                if (ylcVarZ != null) {
                    int iD = h21.d(A());
                    this.d = iD;
                    this.c = h21.c(iD);
                    return;
                }
                return;
            }
            if (i68VarZ == kb5.k && this.c == -1) {
                int iA = x0m.a(A());
                this.d = iA;
                this.c = h21.c(iA);
            } else if (this.c == -1) {
                this.c = 0;
            }
        } catch (IOException e5) {
            ayl.b(e5);
            throw null;
        }
    }

    public final void Y() {
        if (this.e < 0 || this.f < 0) {
            W();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        au3.E(this.a);
    }

    public final void l(p76 p76Var) {
        p76Var.Y();
        this.b = p76Var.b;
        p76Var.Y();
        this.e = p76Var.e;
        p76Var.Y();
        this.f = p76Var.f;
        p76Var.Y();
        this.c = p76Var.c;
        p76Var.Y();
        this.d = p76Var.d;
        this.g = p76Var.g;
        this.h = p76Var.E();
        p76Var.Y();
        this.i = p76Var.i;
    }

    public final String y() {
        au3 au3VarA = au3.A(this.a);
        if (au3VarA == null) {
            return "";
        }
        int iMin = Math.min(E(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((cba) au3VarA.K()).E(0, 0, iMin, bArr);
            au3VarA.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            au3VarA.close();
            throw th;
        }
    }
}

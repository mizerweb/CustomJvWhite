package defpackage;

import androidx.media3.common.ParserException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class zr8 implements jj6 {
    public lj6 b;
    public int c;
    public int d;
    public int e;
    public n1b g;
    public kj6 h;
    public gj2 i;
    public q2b j;
    public final nmc a = new nmc(2);
    public long f = -1;

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.b = lj6Var;
    }

    public final void a() {
        lj6 lj6Var = this.b;
        lj6Var.getClass();
        lj6Var.D();
        this.b.r(new vk0(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        String strV;
        nmc nmcVar = this.a;
        nmcVar.K(2);
        kj6Var.u(0, nmcVar.a, 2);
        if (nmcVar.H() == 65496) {
            while (true) {
                nmcVar.K(2);
                kj6Var.u(0, nmcVar.a, 2);
                int iH = nmcVar.H();
                this.d = iH;
                if (iH == 65498) {
                    break;
                }
                nmcVar.K(2);
                kj6Var.u(0, nmcVar.a, 2);
                int iH2 = nmcVar.H() - 2;
                if (iH2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    kj6Var.z(iH2);
                } else {
                    nmcVar.K(iH2);
                    kj6Var.u(0, nmcVar.a, iH2);
                    if (Objects.equals(nmcVar.v(), "http://ns.adobe.com/xap/1.0/") && (strV = nmcVar.v()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strV.contains(wn9.c[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            q2b q2bVar = this.j;
            q2bVar.getClass();
            q2bVar.g(j, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        String strV;
        gj2 gj2VarA;
        ghe gheVar;
        int i;
        n1b n1bVar;
        long j;
        int i2 = this.c;
        long j2 = -1;
        nmc nmcVar = this.a;
        if (i2 == 0) {
            nmcVar.K(2);
            kj6Var.readFully(nmcVar.a, 0, 2);
            int iH = nmcVar.H();
            this.d = iH;
            if (iH == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iH < 65488 || iH > 65497) && iH != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            nmcVar.K(2);
            kj6Var.u(0, nmcVar.a, 2);
            this.e = nmcVar.H() - 2;
            kj6Var.E(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    c.t();
                    return 0;
                }
                if (this.i == null || kj6Var != this.h) {
                    this.h = kj6Var;
                    this.i = new gj2(kj6Var, this.f);
                }
                q2b q2bVar = this.j;
                q2bVar.getClass();
                int iL = q2bVar.l(this.i, s8Var);
                if (iL == 1) {
                    s8Var.a += this.f;
                }
                return iL;
            }
            long position = kj6Var.getPosition();
            long j3 = this.f;
            if (position != j3) {
                s8Var.a = j3;
                return 1;
            }
            if (!kj6Var.m(nmcVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            kj6Var.q();
            if (this.j == null) {
                this.j = new q2b(b8h.P0, 8);
            }
            gj2 gj2Var = new gj2(kj6Var, this.f);
            this.i = gj2Var;
            if (!this.j.b(gj2Var)) {
                a();
                return 0;
            }
            q2b q2bVar2 = this.j;
            long j4 = this.f;
            lj6 lj6Var = this.b;
            lj6Var.getClass();
            q2bVar2.A(new gj2(j4, lj6Var, 11));
            n1b n1bVar2 = this.g;
            n1bVar2.getClass();
            lj6 lj6Var2 = this.b;
            lj6Var2.getClass();
            kyh kyhVarG = lj6Var2.G(1024, 4);
            a87 a87Var = new a87();
            a87Var.l = uya.n("image/jpeg");
            a87Var.k = new lwa(n1bVar2);
            ewi.n(a87Var, kyhVarG);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            nmc nmcVar2 = new nmc(this.e);
            kj6Var.readFully(nmcVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(nmcVar2.v()) && (strV = nmcVar2.v()) != null) {
                long length = kj6Var.getLength();
                if (length == -1) {
                    n1bVar = null;
                } else {
                    try {
                        gj2VarA = wn9.a(strV);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        lvb.G0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        gj2VarA = null;
                    }
                    if (gj2VarA != null && (i = (gheVar = (ghe) gj2VarA.c).d) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            m1b m1bVar = (m1b) gheVar.get(i3);
                            String str = m1bVar.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                length -= m1bVar.c;
                                j = 0;
                            } else {
                                j = length - m1bVar.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            n1bVar = null;
                        } else {
                            n1bVar = new n1b(j5, j6, gj2VarA.b, j7, j8);
                        }
                    } else {
                        n1bVar = null;
                    }
                }
                this.g = n1bVar;
                if (n1bVar != null) {
                    this.f = n1bVar.d;
                }
            }
        } else {
            kj6Var.E(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
        q2b q2bVar = this.j;
        if (q2bVar != null) {
            q2bVar.getClass();
        }
    }
}

package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d79 implements uk0 {
    public final c98 a;
    public final int b;

    public d79(int i, ghe gheVar) {
        this.b = i;
        this.a = gheVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d79 b(int i, nmc nmcVar) {
        String str;
        uk0 e4hVar;
        String str2;
        int i2 = 4;
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = nmcVar.c;
        int iA = -2;
        int i4 = 0;
        while (nmcVar.a() > 8) {
            int iO = nmcVar.o();
            int iO2 = nmcVar.b + nmcVar.o();
            nmcVar.M(iO2);
            if (iO != 1414744396) {
                yk0 yk0Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iT = nmcVar.t();
                                if (iT == 1) {
                                    str = "audio/raw";
                                } else if (iT == 85) {
                                    str = "audio/mpeg";
                                } else if (iT == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iT != 8192) {
                                    str = iT != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iT2 = nmcVar.t();
                                    int iO3 = nmcVar.o();
                                    nmcVar.O(6);
                                    int iT3 = nmcVar.t();
                                    String str3 = vqi.a;
                                    int iH = vqi.H(iT3, ByteOrder.LITTLE_ENDIAN);
                                    int iT4 = nmcVar.a() > 0 ? nmcVar.t() : 0;
                                    a87 a87Var = new a87();
                                    a87Var.m = uya.n(str);
                                    a87Var.E = iT2;
                                    a87Var.F = iO3;
                                    if (str.equals("audio/raw") && iH != 0) {
                                        a87Var.G = iH;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iT4 > 0) {
                                        byte[] bArr = new byte[iT4];
                                        nmcVar.k(0, bArr, iT4);
                                        a87Var.p = c98.r(bArr);
                                    }
                                    e4hVar = new e4h(new b87(a87Var));
                                } else {
                                    qt4.y(iT, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                lvb.G0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(vqi.K(iA)));
                            }
                            e4hVar = yk0Var;
                            break;
                        } else {
                            nmcVar.O(i2);
                            int iO4 = nmcVar.o();
                            int iO5 = nmcVar.o();
                            nmcVar.O(i2);
                            int iO6 = nmcVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                a87 a87Var2 = new a87();
                                a87Var2.t = iO4;
                                a87Var2.u = iO5;
                                a87Var2.r(str2);
                                e4hVar = new e4h(new b87(a87Var2));
                            } else {
                                qt4.y(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                e4hVar = yk0Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = nmcVar.o();
                        nmcVar.O(8);
                        int iO8 = nmcVar.o();
                        int iO9 = nmcVar.o();
                        nmcVar.O(i2);
                        nmcVar.o();
                        nmcVar.O(12);
                        e4hVar = new xk0(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = nmcVar.o();
                        nmcVar.O(12);
                        nmcVar.o();
                        int iO11 = nmcVar.o();
                        int iO12 = nmcVar.o();
                        nmcVar.O(i2);
                        int iO13 = nmcVar.o();
                        int iO14 = nmcVar.o();
                        nmcVar.O(i2);
                        yk0Var = new yk0(iO10, iO11, iO12, iO13, iO14, nmcVar.o());
                        e4hVar = yk0Var;
                        break;
                    case 1852994675:
                        e4hVar = new l4h(nmcVar.y(nmcVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        e4hVar = yk0Var;
                        break;
                }
            } else {
                e4hVar = b(nmcVar.o(), nmcVar);
            }
            if (e4hVar != null) {
                if (e4hVar.getType() == 1752331379) {
                    iA = ((yk0) e4hVar).a();
                }
                int i5 = i4 + 1;
                int iB = r88.b(objArrCopyOf.length, i5);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i4] = e4hVar;
                i4 = i5;
            }
            nmcVar.N(iO2);
            nmcVar.M(i3);
            i2 = 4;
        }
        return new d79(i, c98.j(objArrCopyOf, i4));
    }

    public final uk0 a(Class cls) {
        a98 a98VarListIterator = this.a.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            uk0 uk0Var = (uk0) a98VarListIterator.next();
            if (uk0Var.getClass() == cls) {
                return uk0Var;
            }
        }
        return null;
    }

    @Override // defpackage.uk0
    public final int getType() {
        return this.b;
    }
}

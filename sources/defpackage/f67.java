package defpackage;

import com.google.protobuf.nano.CodedOutputByteBufferNano$OutOfSpaceException;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* JADX INFO: loaded from: classes.dex */
public final class f67 extends sia {
    public final /* synthetic */ int a;
    public Object b;

    public f67(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = sb8.e;
                this.cachedSize = -1;
                return;
            case 2:
                if (g67.i == null) {
                    synchronized (ck8.b) {
                        try {
                            if (g67.i == null) {
                                g67.i = new g67[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                this.b = g67.i;
                this.cachedSize = -1;
                return;
            default:
                this.b = sb8.f;
                this.cachedSize = -1;
                return;
        }
    }

    @Override // defpackage.sia
    public final int computeSerializedSize() {
        int i = 0;
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = (long[]) this.b;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += uu3.k(jArr2[i]);
                    i++;
                }
                break;
            case 1:
                if (((int[]) this.b).length <= 0) {
                    return 0;
                }
                int iG = 0;
                while (true) {
                    int[] iArr = (int[]) this.b;
                    if (i >= iArr.length) {
                        return iG + iArr.length;
                    }
                    iG += uu3.g(iArr[i]);
                    i++;
                }
                break;
            default:
                g67[] g67VarArr = (g67[]) this.b;
                if (g67VarArr == null || g67VarArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    g67[] g67VarArr2 = (g67[]) this.b;
                    if (i >= g67VarArr2.length) {
                        return i2;
                    }
                    g67 g67Var = g67VarArr2[i];
                    if (g67Var != null) {
                        i2 = uu3.i(1, g67Var) + i2;
                    }
                    i++;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.sia
    public final sia mergeFrom(su3 su3Var) throws InvalidProtocolBufferNanoException {
        switch (this.a) {
            case 0:
                while (true) {
                    int iS = su3Var.s();
                    if (iS == 0) {
                        break;
                    } else if (iS == 8) {
                        int I = sb8.I(su3Var, 8);
                        long[] jArr = (long[]) this.b;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = I + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = su3Var.q();
                            su3Var.s();
                            length++;
                        }
                        jArr2[length] = su3Var.q();
                        this.b = jArr2;
                    } else if (iS == 10) {
                        int iE = su3Var.e(su3Var.p());
                        int iC = su3Var.c();
                        int i2 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.q();
                            i2++;
                        }
                        su3Var.t(iC);
                        long[] jArr3 = (long[]) this.b;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = su3Var.q();
                            length2++;
                        }
                        this.b = jArr4;
                        su3Var.d(iE);
                    } else if (!su3Var.u(iS)) {
                        break;
                    }
                }
                break;
            case 1:
                while (true) {
                    int iS2 = su3Var.s();
                    if (iS2 == 0) {
                        break;
                    } else if (iS2 == 8) {
                        int I2 = sb8.I(su3Var, 8);
                        int[] iArr = (int[]) this.b;
                        int length3 = iArr.length;
                        int i4 = I2 + length3;
                        int[] iArr2 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            iArr2[length3] = su3Var.p();
                            su3Var.s();
                            length3++;
                        }
                        iArr2[length3] = su3Var.p();
                        this.b = iArr2;
                    } else if (iS2 == 10) {
                        int iE2 = su3Var.e(su3Var.p());
                        int iC2 = su3Var.c();
                        int i5 = 0;
                        while (su3Var.b() > 0) {
                            su3Var.p();
                            i5++;
                        }
                        su3Var.t(iC2);
                        int[] iArr3 = (int[]) this.b;
                        int length4 = iArr3.length;
                        int i6 = i5 + length4;
                        int[] iArr4 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length4);
                        }
                        while (length4 < i6) {
                            iArr4[length4] = su3Var.p();
                            length4++;
                        }
                        this.b = iArr4;
                        su3Var.d(iE2);
                    } else if (!su3Var.u(iS2)) {
                        break;
                    }
                }
                break;
            default:
                while (true) {
                    int iS3 = su3Var.s();
                    if (iS3 == 0) {
                        break;
                    } else if (iS3 == 10) {
                        int I3 = sb8.I(su3Var, 10);
                        g67[] g67VarArr = (g67[]) this.b;
                        int length5 = g67VarArr == null ? 0 : g67VarArr.length;
                        int i7 = I3 + length5;
                        g67[] g67VarArr2 = new g67[i7];
                        if (length5 != 0) {
                            System.arraycopy(g67VarArr, 0, g67VarArr2, 0, length5);
                        }
                        while (length5 < i7 - 1) {
                            g67 g67Var = new g67();
                            g67VarArr2[length5] = g67Var;
                            su3Var.j(g67Var);
                            su3Var.s();
                            length5++;
                        }
                        g67 g67Var2 = new g67();
                        g67VarArr2[length5] = g67Var2;
                        su3Var.j(g67Var2);
                        this.b = g67VarArr2;
                    } else if (!su3Var.u(iS3)) {
                        break;
                    }
                }
                break;
        }
        return this;
    }

    @Override // defpackage.sia
    public final void writeTo(uu3 uu3Var) throws CodedOutputByteBufferNano$OutOfSpaceException {
        int i = 0;
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                if (jArr != null && jArr.length > 0) {
                    while (true) {
                        long[] jArr2 = (long[]) this.b;
                        if (i < jArr2.length) {
                            uu3Var.x(1, jArr2[i]);
                            i++;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (((int[]) this.b).length > 0) {
                    while (true) {
                        int[] iArr = (int[]) this.b;
                        if (i < iArr.length) {
                            uu3Var.w(1, iArr[i]);
                            i++;
                        }
                    }
                }
                break;
            default:
                g67[] g67VarArr = (g67[]) this.b;
                if (g67VarArr != null && g67VarArr.length > 0) {
                    while (true) {
                        g67[] g67VarArr2 = (g67[]) this.b;
                        if (i < g67VarArr2.length) {
                            g67 g67Var = g67VarArr2[i];
                            if (g67Var != null) {
                                uu3Var.y(1, g67Var);
                            }
                            i++;
                        }
                        break;
                    }
                }
                break;
        }
    }
}

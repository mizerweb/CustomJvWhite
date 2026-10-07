package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o6e implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8b b;
    public final /* synthetic */ long c;

    public /* synthetic */ o6e(int i, l8b l8bVar, long j) {
        this.a = i;
        this.b = l8bVar;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        String str;
        char c;
        char c2;
        l8b l8bVar = this.b;
        long j = this.c;
        qxe qxeVar = (qxe) obj;
        int i = this.a;
        char c3 = 2;
        int i2 = 1;
        if (i == 1) {
            str = "messages";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "comments";
        }
        vxe vxeVarO0 = qxeVar.O0("UPDATE OR IGNORE `" + str + "` SET reactions = ?, reactions_update_time = ? WHERE server_id = ?");
        try {
            long[] jArr = l8bVar.b;
            Object[] objArr = l8bVar.c;
            long[] jArr2 = l8bVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j2 = jArr2[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                int i7 = (i3 << 3) + i6;
                                long j3 = jArr[i7];
                                byte[] bArrX = pm9.x((kja) objArr[i7]);
                                if (bArrX == null) {
                                    vxeVarO0.e(i2);
                                } else {
                                    vxeVarO0.d(i2, bArrX);
                                }
                                c2 = 2;
                                vxeVarO0.c(2, j);
                                vxeVarO0.c(3, j3);
                                vxeVarO0.M0();
                                vxeVarO0.reset();
                            } else {
                                c2 = c3;
                            }
                            j2 >>= i4;
                            i6++;
                            c3 = c2;
                            i4 = i4;
                            i2 = 1;
                        }
                        int i8 = i4;
                        c = c3;
                        if (i5 != i8) {
                            break;
                        }
                    } else {
                        c = c3;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                    c3 = c;
                    i2 = 1;
                }
            }
            p90.f(vxeVarO0, null);
            return sbi.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wkh implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ wkh(byte[] bArr, xkh xkhVar, long j) {
        this.a = 1;
        this.b = bArr;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        long j = this.c;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE tasks SET data = ? WHERE id = ?");
                try {
                    vxeVarO0.d(1, bArr);
                    vxeVarO0.c(2, j);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("UPDATE tasks SET data = ?, status = ? WHERE id = ?");
                try {
                    vxeVarO1.d(1, bArr);
                    vxeVarO1.c(2, 10L);
                    vxeVarO1.c(3, j);
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            default:
                vxe vxeVarO2 = ((qxe) obj).O0("UPDATE tasks SET data = ? WHERE id = ?");
                try {
                    vxeVarO2.d(1, bArr);
                    vxeVarO2.c(2, j);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
        }
    }

    public /* synthetic */ wkh(int i, long j, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = j;
    }
}

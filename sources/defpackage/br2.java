package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class br2 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ br2(int i, long j, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        long j = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                di4 di4Var = (di4) obj;
                di4Var.b = str2;
                di4Var.c = str;
                di4Var.e = j;
                return sbiVar;
            default:
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE messages SET error = ?, localized_error = ? WHERE id = ?");
                try {
                    vxeVarO0.B(1, str2);
                    vxeVarO0.B(2, str);
                    vxeVarO0.c(3, j);
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
        }
    }
}

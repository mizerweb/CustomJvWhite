package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k54 implements cf7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ k54(byte b) {
        this.a = b;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM complain_reasons WHERE type_id = ?");
        try {
            vxeVarO0.c(1, b);
            return vxeVarO0.M0() ? new m54(vxeVarO0.getLong(qyj.E(vxeVarO0, "id")), (byte) vxeVarO0.getLong(qyj.E(vxeVarO0, "type_id")), vnl.b(vxeVarO0.B0(qyj.E(vxeVarO0, "complain_reasons")))) : null;
        } finally {
            vxeVarO0.close();
        }
    }
}

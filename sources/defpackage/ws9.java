package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ws9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ ws9(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        int i2 = this.c;
        long j = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                vxe vxeVarO0 = qxeVar.O0("SELECT EXISTS(SELECT 1 FROM media_cache WHERE attach_id = ? AND type = ?)");
                try {
                    vxeVarO0.c(1, j);
                    vxeVarO0.c(2, i2);
                    boolean z = false;
                    if (vxeVarO0.M0()) {
                        z = ((int) vxeVarO0.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = qxeVar.O0("SELECT * FROM phones WHERE id > ? ORDER BY id LIMIT ?");
                try {
                    vxeVarO1.c(1, j);
                    vxeVarO1.c(2, i2);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "phonebook_id");
                    int iE3 = qyj.E(vxeVarO1, "contact_id");
                    int iE4 = qyj.E(vxeVarO1, "phone");
                    int iE5 = qyj.E(vxeVarO1, "phone_key");
                    int iE6 = qyj.E(vxeVarO1, "server_phone");
                    int iE7 = qyj.E(vxeVarO1, "email");
                    int iE8 = qyj.E(vxeVarO1, "first_name");
                    int iE9 = qyj.E(vxeVarO1, "last_name");
                    int iE10 = qyj.E(vxeVarO1, "avatar_path");
                    int iE11 = qyj.E(vxeVarO1, "type");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        int i3 = iE2;
                        int i4 = iE3;
                        arrayList.add(new stc(vxeVarO1.getLong(iE), vxeVarO1.getLong(iE2), (int) vxeVarO1.getLong(iE3), vxeVarO1.B0(iE4), vxeVarO1.B0(iE5), vxeVarO1.getLong(iE6), vxeVarO1.isNull(iE7) ? null : vxeVarO1.B0(iE7), vxeVarO1.B0(iE8), vxeVarO1.isNull(iE9) ? null : vxeVarO1.B0(iE9), vxeVarO1.isNull(iE10) ? null : vxeVarO1.B0(iE10), iic.h((int) vxeVarO1.getLong(iE11))));
                        iE2 = i3;
                        iE3 = i4;
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO1.close();
                }
        }
    }
}

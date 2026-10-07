package defpackage;

import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u14 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ u14(String str, yzg yzgVar, long j) {
        this.a = 6;
        this.b = str;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        long j = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE comments SET error = ? WHERE id = ?");
                try {
                    if (str == null) {
                        vxeVarO0.e(1);
                    } else {
                        vxeVarO0.B(1, str);
                    }
                    vxeVarO0.c(2, j);
                    vxeVarO0.M0();
                    vxeVarO0.close();
                    return sbiVar;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("UPDATE comments SET localized_error = ? WHERE id = ?");
                try {
                    vxeVarO1.B(1, str);
                    vxeVarO1.c(2, j);
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                return MLDownloadStat.readyToUse$lambda$0(j, str, (fi1) obj);
            case 3:
                vxe vxeVarO2 = ((qxe) obj).O0("UPDATE metrics SET attempt = ? WHERE traceId = ?");
                try {
                    vxeVarO2.c(1, j);
                    vxeVarO2.B(2, str);
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 4:
                vxe vxeVarO3 = ((qxe) obj).O0("UPDATE phones SET server_phone = ?, type = ? WHERE phone = ?");
                try {
                    vxeVarO3.c(1, j);
                    vxeVarO3.c(2, qt4.D(2));
                    vxeVarO3.B(3, str);
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 5:
                vxe vxeVarO4 = ((qxe) obj).O0("UPDATE story_drafts SET preview_path = ? WHERE draft_id = ?");
                try {
                    vxeVarO4.B(1, str);
                    vxeVarO4.c(2, j);
                    vxeVarO4.M0();
                    return sbiVar;
                } finally {
                    vxeVarO4.close();
                }
            default:
                vxe vxeVarO5 = ((qxe) obj).O0("UPDATE story_publish SET upload_token = ?, status = ? WHERE publish_id = ?");
                try {
                    vxeVarO5.B(1, str);
                    vxeVarO5.c(2, 3L);
                    vxeVarO5.c(3, j);
                    vxeVarO5.M0();
                    return sbiVar;
                } finally {
                    vxeVarO5.close();
                }
        }
    }

    public /* synthetic */ u14(String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public /* synthetic */ u14(long j, String str, int i) {
        this.a = i;
        this.c = j;
        this.b = str;
    }
}

package defpackage;

import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z92 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ z92(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                qxe qxeVar = (qxe) obj;
                vxe vxeVarO0 = qxeVar.O0("UPDATE call_notifications_analytics SET drop_reason=? WHERE call_id=?");
                try {
                    vxeVarO0.B(1, str2);
                    vxeVarO0.B(2, str);
                    vxeVarO0.M0();
                    return Integer.valueOf(e9i.e0(qxeVar));
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? || '*' ORDER BY sortTime DESC ");
                try {
                    vxeVarO1.B(1, str2);
                    vxeVarO1.B(2, str);
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO1.getLong(0)));
                    }
                    vxeVarO1.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? ORDER BY sortTime DESC ");
                try {
                    vxeVarO2.B(1, str2);
                    vxeVarO2.B(2, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO2.getLong(0)));
                    }
                    vxeVarO2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    vxeVarO2.close();
                    throw th2;
                }
            case 3:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ?)");
                try {
                    vxeVarO3.B(1, str2);
                    vxeVarO3.B(2, str);
                    vxeVarO3.B(3, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO3.getLong(0)));
                    }
                    vxeVarO3.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    vxeVarO3.close();
                    throw th3;
                }
            case 4:
                vxe vxeVarO4 = ((qxe) obj).O0("SELECT docid FROM contact_title WHERE allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ?");
                try {
                    vxeVarO4.B(1, str2);
                    vxeVarO4.B(2, str);
                    vxeVarO4.B(3, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO4.M0()) {
                        arrayList4.add(Long.valueOf(vxeVarO4.getLong(0)));
                    }
                    vxeVarO4.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    vxeVarO4.close();
                    throw th4;
                }
            case 5:
                rm4.b((di4) obj, str2, str);
                return sbiVar;
            case 6:
                return MLDownloadStat.error$lambda$0(str2, str, (fi1) obj);
            default:
                rm4.b((di4) obj, str2, str);
                return sbiVar;
        }
    }
}

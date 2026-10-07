package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class us5 implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ us5(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        long jO;
        long jO2;
        int i = this.a;
        lw5 lw5Var = lw5.MILLISECONDS;
        long j = 0;
        boolean z = true;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                b87 b87Var = (b87) obj;
                String str = b87Var.a;
                if (str == null) {
                    str = "";
                }
                return new ooh(str, srk.d(b87Var));
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ghb ghbVar = ew5.b;
                    jO = qe7.O(0, lw5Var);
                } else {
                    jO = iz5.C;
                }
                return new ew5(jO);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ghb ghbVar2 = ew5.b;
                    jO2 = qe7.O(0, lw5Var);
                } else {
                    jO2 = iz5.C;
                }
                return new ew5(jO2);
            case 3:
                ((w78) obj).d = new bne(2560, 2560, 0.0f, 12);
                return sbiVar;
            case 4:
                return Boolean.valueOf(((cga) obj).c == bga.f);
            case 5:
                Map map = ((cga) obj).f;
                Object obj2 = map != null ? map.get(MLFeatureConfigProviderBase.URL_KEY) : null;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                return null;
            case 6:
                zka zkaVar = (zka) obj;
                return Boolean.valueOf(zkaVar != null && zkaVar.a == yka.b);
            case 7:
                return r5h.y1((String) obj).toString();
            case 8:
                String str2 = (String) obj;
                return Boolean.valueOf(z5h.K0(str2, "#", false) && r5h.L0(str2, " pc ", false));
            case 9:
                return r5h.y1((String) obj).toString();
            case 10:
                String str3 = (String) obj;
                if (!z5h.K0(str3, "at ", false) && (!z5h.K0(str3, "#", false) || !r5h.L0(str3, " pc ", false))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return r5h.y1((String) obj).toString();
            case 12:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 13:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT MAX(`index`) FROM favorite_sticker_sets");
                try {
                    return Integer.valueOf(vxeVarO0.M0() ? (int) vxeVarO0.getLong(0) : 0);
                } finally {
                    vxeVarO0.close();
                }
            case 14:
                vxe vxeVarO1 = ((qxe) obj).O0("DELETE FROM favorite_sticker_sets");
                try {
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 15:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT COUNT(*) FROM favorite_sticker_sets");
                try {
                    if (vxeVarO2.M0()) {
                        j = vxeVarO2.getLong(0);
                        break;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO2.close();
                }
            case 16:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO3.getLong(0)));
                    }
                    vxeVarO3.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO3.close();
                    throw th;
                }
            case 17:
                vxe vxeVarO4 = ((qxe) obj).O0("SELECT MAX(`index`) FROM favorite_stickers");
                try {
                    return Integer.valueOf(vxeVarO4.M0() ? (int) vxeVarO4.getLong(0) : 0);
                } finally {
                    vxeVarO4.close();
                }
            case 18:
                vxe vxeVarO5 = ((qxe) obj).O0("SELECT id FROM favorite_stickers ORDER BY `index` ASC");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO5.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO5.getLong(0)));
                    }
                    vxeVarO5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    vxeVarO5.close();
                    throw th2;
                }
            case 19:
                vxe vxeVarO6 = ((qxe) obj).O0("SELECT COUNT(*) FROM favorite_stickers");
                try {
                    if (vxeVarO6.M0()) {
                        j = vxeVarO6.getLong(0);
                        break;
                    }
                    return Long.valueOf(j);
                } finally {
                    vxeVarO6.close();
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vxe vxeVarO7 = ((qxe) obj).O0("DELETE FROM favorite_stickers");
                try {
                    vxeVarO7.M0();
                    return sbiVar;
                } finally {
                    vxeVarO7.close();
                }
            case 21:
                vxe vxeVarO8 = ((qxe) obj).O0("DELETE FROM fcm_notifications_analytics");
                try {
                    vxeVarO8.M0();
                    return sbiVar;
                } finally {
                    vxeVarO8.close();
                }
            case 22:
                return Boolean.valueOf(((xn6) obj).j() != 0);
            case 23:
                return Long.valueOf(((xn6) obj).j());
            case 24:
                vxe vxeVarO9 = ((qxe) obj).O0("DELETE FROM fcm_notifications_history");
                try {
                    vxeVarO9.M0();
                    return sbiVar;
                } finally {
                    vxeVarO9.close();
                }
            case 25:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 26:
                return sbiVar;
            case 27:
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: torch control completed");
                }
                return sbiVar;
            case 28:
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
                }
                return sbiVar;
            default:
                return Boolean.valueOf(i37.e.contains((i37) obj));
        }
    }
}

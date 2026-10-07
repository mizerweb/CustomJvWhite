package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import one.me.android.OneMeApplication;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class chf implements cf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ chf(int i) {
        this.a = i;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        f0h f0hVar = f0h.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ehf ehfVar = new ehf((Context) obj);
                ehfVar.setId(R.id.messages_list_item_alias);
                ehfVar.setWillNotDraw(false);
                return ehfVar;
            case 1:
                wtf.b.b().f();
                return sbiVar;
            case 2:
                zv8[] zv8VarArr = SettingsAutoSaveScreen.g;
                wtf.b.b().f();
                return sbiVar;
            case 3:
                zv8[] zv8VarArr2 = SettingsBatteryScreen.g;
                tqf.b.b().f();
                return sbiVar;
            case 4:
                hrf.b.b().f();
                return sbiVar;
            case 5:
                zv8[] zv8VarArr3 = SettingsMediaScreen.h;
                wtf.b.b().f();
                return sbiVar;
            case 6:
                return Integer.valueOf(((kbc) obj).h().d);
            case 7:
                return Integer.valueOf(((kbc) obj).h().d);
            case 8:
                return c0a.n(((sn9) ((tn9) obj).a()).get(1), "float");
            case 9:
                kp4 kp4Var = (kp4) obj;
                return Boolean.valueOf(kp4Var.a() || kp4Var.b());
            case 10:
                return new nxf((Context) obj);
            case 11:
                ((ys8) obj).b = true;
                return sbiVar;
            case 12:
                u7g u7gVar = (u7g) obj;
                u7gVar.getClass();
                return u7gVar.a;
            case 13:
                u7g u7gVar2 = (u7g) obj;
                u7gVar2.getClass();
                return u7gVar2.a;
            case 14:
                return Boolean.valueOf(((vg4) obj).I());
            case 15:
                vxe vxeVarO0 = ((qxe) obj).O0("DELETE FROM stat_events");
                try {
                    vxeVarO0.M0();
                    return sbiVar;
                } finally {
                    vxeVarO0.close();
                }
            case 16:
                vxe vxeVarO1 = ((qxe) obj).O0("\n            SELECT * FROM stat_events\n            ORDER BY id ASC\n            LIMIT ?\n        ");
                try {
                    vxeVarO1.c(1, 50L);
                    int iE = qyj.E(vxeVarO1, "id");
                    int iE2 = qyj.E(vxeVarO1, "timestamp");
                    int iE3 = qyj.E(vxeVarO1, "entry");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList.add(new sig(vxeVarO1.getLong(iE), vxeVarO1.getLong(iE2), vkg.a(vxeVarO1.getBlob(iE3))));
                    }
                    vxeVarO1.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO1.close();
                    throw th;
                }
            case 17:
                vxe vxeVarO2 = ((qxe) obj).O0("DELETE FROM sticker_sets");
                try {
                    vxeVarO2.M0();
                    return sbiVar;
                } finally {
                    vxeVarO2.close();
                }
            case 18:
                vxe vxeVarO3 = ((qxe) obj).O0("DELETE FROM stickers");
                try {
                    vxeVarO3.M0();
                    return sbiVar;
                } finally {
                    vxeVarO3.close();
                }
            case 19:
                zv8[] zv8VarArr4 = StickersSettingsScreen.g;
                return Boolean.valueOf(((lfe) obj).f == R.id.oneme_stickers_settings_set_view_type);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zv8[] zv8VarArr5 = StickersShowcaseScreen.m;
                o65.c(tog.b.b(), ":stickers/settings", null, null, 6);
                return sbiVar;
            case 21:
                zv8[] zv8VarArr6 = tpg.u;
                return Boolean.TRUE;
            case 22:
                ylc ylcVar = (ylc) obj;
                zv8[] zv8VarArr7 = StoriesViewerScreen.t;
                Class cls = (Class) ylcVar.a;
                String str = (String) ylcVar.b;
                ClassLoader classLoader = cls.getClassLoader();
                return str + "=" + (classLoader != null ? classLoader.getClass() : null) + "@" + System.identityHashCode(classLoader);
            case 23:
                ((Boolean) obj).getClass();
                zv8[] zv8VarArr8 = vvg.q;
                return sbiVar;
            case 24:
                return p90.a(f0hVar);
            case 25:
                return p90.a(f0hVar);
            case 26:
                nag nagVar = (nag) obj;
                nagVar.b(zfe.a(ry8.class).d().getCanonicalName());
                nagVar.b("leakcanary.internal.LeakCanaryFileProvider");
                nagVar.a(zfe.a(oc9.class), zfe.a(np4.class));
                nagVar.a(zfe.a(OneMeApplication.class), zfe.a(Typeface.class));
                nagVar.b(zfe.a(PackageManager.class).d().getCanonicalName());
                return sbiVar;
            case 27:
                ((vg4) obj).E();
                return true;
            case 28:
                return ((f9f) obj).e;
            default:
                ((vg4) obj).E();
                return true;
        }
    }

    public /* synthetic */ chf(xde xdeVar, int i) {
        this.a = i;
    }
}

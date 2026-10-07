package defpackage;

import java.util.Iterator;
import one.me.settings.media.video.SettingMediaVideoScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class epf implements rtf {
    public final /* synthetic */ SettingMediaVideoScreen a;

    public epf(SettingMediaVideoScreen settingMediaVideoScreen) {
        this.a = settingMediaVideoScreen;
    }

    @Override // defpackage.rtf
    public final void a(float f, long j) {
        lq4 lq4Var;
        Object next;
        ipf ipfVar = (ipf) this.a.d.getValue();
        int i = (int) j;
        ipfVar.getClass();
        if (i == R.id.oneme_settings_media_item_video_autoload_slider) {
            Iterator it = gpf.e.iterator();
            do {
                lq4Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((gpf) next).a != f);
            gpf gpfVar = (gpf) next;
            if (gpfVar != null) {
                ipfVar.h.B(ipfVar, ipf.i[1], a8j.t(ipfVar, null, new gce(ipfVar, gpfVar, lq4Var, 20), 1));
                return;
            }
            String name = ipf.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Can't apply this step: " + f, null);
            }
        }
    }

    @Override // defpackage.rtf
    public final void c(long j) {
        ipf ipfVar = (ipf) this.a.d.getValue();
        int i = (int) j;
        if (i == R.id.oneme_settings_media_item_video_autoload_always) {
            ipfVar.D(0);
            return;
        }
        if (i == R.id.oneme_settings_media_item_video_autoload_wifi) {
            ipfVar.D(1);
        } else if (i == R.id.oneme_settings_media_item_video_autoload_never) {
            ipfVar.D(-1);
        } else {
            ipfVar.getClass();
        }
    }
}

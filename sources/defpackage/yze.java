package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yze implements a0f {
    public final ynh a;
    public final vnh b;

    public yze(long j, t50 t50Var, ArrayList arrayList) {
        ynh tnhVar;
        int iD = qt4.D(lu8.d(t50Var, Long.valueOf(j)));
        int i = 3;
        if (iD == 0) {
            tnhVar = new tnh(R.string.oneme_media_download_viewer_save_single_photo);
        } else if (iD == 1) {
            tnhVar = new tnh(R.string.oneme_media_download_viewer_save_single_video);
        } else {
            if (iD != 2 && iD != 3) {
                ore.o();
                throw null;
            }
            tnhVar = ynh.b;
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            yu3 yu3Var = (yu3) it.next();
            if (yu3Var instanceof g58) {
                i2++;
            } else {
                if (!(yu3Var instanceof fti)) {
                    ore.o();
                    throw null;
                }
                i3++;
            }
        }
        if (i2 == arrayList.size()) {
            i = 1;
        } else if (i3 == arrayList.size()) {
            i = 2;
        }
        int iD2 = qt4.D(i);
        vnh vnhVar = new vnh(iD2 != 0 ? iD2 != 1 ? R.string.oneme_media_download_viewer_save_all_medias : R.string.oneme_media_download_viewer_save_all_videos : R.string.oneme_media_download_viewer_save_all_photos, a.n1(new Object[]{Integer.valueOf(arrayList.size())}));
        this.a = tnhVar;
        this.b = vnhVar;
    }
}

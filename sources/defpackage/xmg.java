package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xmg implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ xmg(String str, ArrayList arrayList) {
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        ArrayList arrayList = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0(str);
                try {
                    Iterator it = arrayList.iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        vxeVarO0.c(i2, ((Number) it.next()).longValue());
                        i2++;
                    }
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "sticker_id");
                    int iE3 = qyj.E(vxeVarO0, "width");
                    int iE4 = qyj.E(vxeVarO0, "height");
                    int iE5 = qyj.E(vxeVarO0, MLFeatureConfigProviderBase.URL_KEY);
                    int iE6 = qyj.E(vxeVarO0, "update_time");
                    int iE7 = qyj.E(vxeVarO0, "mp4_url");
                    int iE8 = qyj.E(vxeVarO0, "first_url");
                    int iE9 = qyj.E(vxeVarO0, "preview_url");
                    int iE10 = qyj.E(vxeVarO0, "tags");
                    int iE11 = qyj.E(vxeVarO0, "sticker_type");
                    int iE12 = qyj.E(vxeVarO0, "set_id");
                    int iE13 = qyj.E(vxeVarO0, "lottie_url");
                    int iE14 = qyj.E(vxeVarO0, MediaStreamTrack.AUDIO_TRACK_KIND);
                    int iE15 = qyj.E(vxeVarO0, "author_type");
                    int iE16 = qyj.E(vxeVarO0, "video_url");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO0.M0()) {
                        long j = vxeVarO0.getLong(iE);
                        ArrayList arrayList3 = arrayList2;
                        int i3 = iE2;
                        int i4 = iE;
                        int i5 = iE15;
                        int i6 = iE16;
                        iE15 = i5;
                        arrayList3.add(new olg(j, vxeVarO0.getLong(iE2), (int) vxeVarO0.getLong(iE3), (int) vxeVarO0.getLong(iE4), vxeVarO0.isNull(iE5) ? null : vxeVarO0.B0(iE5), vxeVarO0.getLong(iE6), vxeVarO0.isNull(iE7) ? null : vxeVarO0.B0(iE7), vxeVarO0.isNull(iE8) ? null : vxeVarO0.B0(iE8), vxeVarO0.isNull(iE9) ? null : vxeVarO0.B0(iE9), r5h.m1(vxeVarO0.B0(iE10), new String[]{","}, 6), cqk.L((int) vxeVarO0.getLong(iE11)), vxeVarO0.getLong(iE12), vxeVarO0.isNull(iE13) ? null : vxeVarO0.B0(iE13), ((int) vxeVarO0.getLong(iE14)) != 0, cqk.K((int) vxeVarO0.getLong(i5)), vxeVarO0.isNull(i6) ? null : vxeVarO0.B0(i6)));
                        iE16 = i6;
                        iE2 = i3;
                        arrayList2 = arrayList3;
                        iE = i4;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO0.close();
                }
            default:
                vxe vxeVarO1 = ((qxe) obj).O0(str);
                try {
                    Iterator it2 = arrayList.iterator();
                    int i7 = 1;
                    while (it2.hasNext()) {
                        vxeVarO1.c(i7, ((Number) it2.next()).longValue());
                        i7++;
                    }
                    vxeVarO1.M0();
                    return sbi.a;
                } finally {
                    vxeVarO1.close();
                }
        }
    }

    public /* synthetic */ xmg(String str, ArrayList arrayList, ymg ymgVar) {
        this.b = str;
        this.c = arrayList;
    }
}

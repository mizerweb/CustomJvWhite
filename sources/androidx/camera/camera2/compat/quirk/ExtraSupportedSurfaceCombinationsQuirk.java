package androidx.camera.camera2.compat.quirk;

import defpackage.o2e;
import defpackage.qbh;
import defpackage.rbh;
import defpackage.sbh;
import defpackage.t4h;
import defpackage.tbh;
import defpackage.x05;
import defpackage.yr8;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Lo2e;", "exl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements o2e {
    public static final qbh a;
    public static final qbh b;
    public static final Set c;
    public static final Set d;

    static {
        qbh qbhVar = new qbh();
        t4h t4hVar = tbh.e;
        rbh rbhVar = rbh.VGA;
        sbh sbhVar = sbh.b;
        qbhVar.a(yr8.m(sbhVar, rbhVar));
        rbh rbhVar2 = rbh.PREVIEW;
        sbh sbhVar2 = sbh.a;
        qbhVar.a(yr8.m(sbhVar2, rbhVar2));
        rbh rbhVar3 = rbh.MAXIMUM;
        qbhVar.a(yr8.m(sbhVar, rbhVar3));
        a = qbhVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(yr8.m(sbhVar, rbhVar));
        arrayList.add(yr8.m(sbhVar, rbhVar2));
        arrayList.add(yr8.m(sbhVar, rbhVar3));
        qbh qbhVar2 = new qbh();
        x05.k(sbhVar2, rbhVar2, qbhVar2, sbhVar2, rbhVar);
        qbhVar2.a(yr8.m(sbhVar, rbhVar3));
        b = qbhVar2;
        c = a.p1(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = a.p1(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}

package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xc2(a5f a5fVar, long j, Map map) {
        this.a = 5;
        this.c = a5fVar;
        this.b = j;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((hi2) this.c).a.onCaptureSequenceCompleted((CameraCaptureSession) this.d, -1, this.b);
                return;
            case 1:
                ((cle) this.c).I((jme) this.d, this.b);
                return;
            case 2:
                ((i55) this.c).g.a(VideoFrameProcessingException.a(this.b, (Exception) this.d));
                return;
            case 3:
                ((uu6) this.c).j.a(VideoFrameProcessingException.a(this.b, (Exception) this.d));
                return;
            case 4:
                a5f a5fVar = (a5f) this.c;
                List list = (List) this.d;
                long j = this.b;
                synchronized (a5fVar) {
                    LinkedHashMap linkedHashMap = a5fVar.c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        x52 x52Var = ((mg1) it.next()).a;
                        yt1 yt1Var = x52Var.b;
                        boolean z = x52Var.a == v4j.b;
                        boolean zContainsKey = linkedHashMap.containsKey(yt1Var);
                        if (z && !zContainsKey) {
                            linkedHashMap.put(yt1Var, Long.valueOf(j));
                        }
                    }
                    a5fVar.a(list);
                }
                return;
            case 5:
                ((gi1) ((a5f) this.c).a).d("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map<String, ? extends EventItemValue>) this.d));
                return;
            case 6:
                zzf zzfVar = (zzf) this.c;
                vxa vxaVar = (vxa) this.d;
                long j2 = this.b;
                b1k b1kVar = zzfVar.i;
                if (b1kVar != null) {
                    ((CopyOnWriteArraySet) b1kVar.b).add(new n3k(j2, vxaVar));
                    return;
                }
                return;
            default:
                fbc fbcVar = (fbc) this.c;
                Object obj = this.d;
                long j3 = this.b;
                y3j y3jVar = (y3j) fbcVar.c;
                String str = vqi.a;
                y3jVar.s(j3, obj);
                return;
        }
    }

    public /* synthetic */ xc2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}

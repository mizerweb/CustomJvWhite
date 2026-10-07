package defpackage;

import android.content.ComponentName;
import android.opengl.EGLSurface;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ysj extends fg7 implements cf7 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysj(i12 i12Var, int i) {
        super(1, 0, i12.class, i12Var, "onAllRoomsLoaded", "onAllRoomsLoaded(Lru/ok/android/webrtc/signaling/sessionroom/event/SignalingSessionRooms;)V");
        this.a = i;
        switch (i) {
            case 10:
                super(1, 0, i12.class, i12Var, "onAllRoomsLoadError", "onAllRoomsLoadError(Ljava/lang/Throwable;)V");
                break;
            default:
                break;
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((vsj) this.receiver).b((usj) obj);
                return sbiVar;
            case 1:
                g9 g9Var = (g9) obj;
                g9Var.getClass();
                h9 h9Var = (h9) this.receiver;
                h9Var.getClass();
                EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(g9Var.b);
                String str = (String) g9Var.a.d;
                if (str == null) {
                    str = "NULL";
                }
                h9Var.a.d("codec_usage", EventItemValueKt.toEventItemValue(0L), new EventItemsMap((Map<String, ? extends EventItemValue>) wm9.Q0(new ylc("codec_implementation", eventItemValue), new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValueKt.toEventItemValue(str)))));
                return sbiVar;
            case 2:
                yt1 yt1Var = (yt1) obj;
                yt1Var.getClass();
                o91 o91Var = ((nl) this.receiver).a;
                return Boolean.valueOf((o91Var.n.r.g && o91Var.n0.w() == zvh.c) ? yt1Var.equals(o91Var.j0.a.a) : true);
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                au6.a((au6) this.receiver, str2);
                return sbiVar;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                ((p3j) this.receiver).a.log("VideoRecord_BufferTransform", str3);
                return sbiVar;
            case 5:
                String str4 = (String) obj;
                r7k r7kVar = (r7k) this.receiver;
                ComponentName componentNameFindServiceByAction = PackageExtenstionsKt.findServiceByAction(r7kVar.getContext(), str4, ComponentActions.PUSH_SERVICE_ACTION);
                if (componentNameFindServiceByAction != null) {
                    return componentNameFindServiceByAction;
                }
                Logger.DefaultImpls.warn$default(r7kVar.getLogger(), c0a.o("Unable to resolve service in ", str4, " by action com.vk.push.PUSH_SERVICE, try connect to com.vk.push.pushsdk.ipc.PushService"), null, 2, null);
                return new ComponentName(str4, "com.vk.push.pushsdk.ipc.PushService");
            case 6:
                ms1 ms1Var = (ms1) obj;
                ms1Var.getClass();
                qs1 qs1Var = (qs1) this.receiver;
                pi piVar = qs1Var.c;
                piVar.getClass();
                ms1Var.k.removeCallbacks(piVar);
                CidLogger cidLogger = qs1Var.a;
                String str5 = qs1Var.d;
                cidLogger.log(str5, "Statistics report task cancelled");
                ArrayList arrayList = qs1Var.i;
                cidLogger.log(str5, "Will now release " + arrayList.size() + " registered drawers");
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ns1 ns1Var = (ns1) obj2;
                    EGLSurface eGLSurface = ns1Var.a;
                    ns1Var.a = null;
                    ms1Var.d(eGLSurface);
                    ns1Var.c(ms1Var);
                }
                cidLogger.log(str5, arrayList.size() + " drawers were released");
                arrayList.clear();
                qs1Var.h.release();
                cidLogger.log(str5, "Shared holder released");
                qs1Var.g.release();
                cidLogger.log(str5, "Frame drawer released");
                return sbiVar;
            case 7:
                String str6 = (String) obj;
                str6.getClass();
                au6.a((au6) this.receiver, str6);
                return sbiVar;
            case 8:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((i12) this.receiver).a.logException("CallSessionRoomsManager", "All participants load error", th);
                return sbiVar;
            case 9:
                o5g o5gVar = (o5g) obj;
                o5gVar.getClass();
                ((i12) this.receiver).f(o5gVar);
                return sbiVar;
            case 10:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((i12) this.receiver).a.logException("CallSessionRoomsManager", "All rooms load error", th2);
                return sbiVar;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ms1 ms1Var2 = (ms1) this.receiver;
                ms1Var2.a.reportException(ms1Var2.j, "Unexpected error during media processing", th3);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ysj(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}

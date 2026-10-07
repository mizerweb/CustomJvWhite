package defpackage;

import java.util.UUID;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osl {
    public static long a() {
        return UUID.randomUUID().getLeastSignificantBits() & BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static xc3 b(xyj xyjVar, ha9 ha9Var, long j, long[] jArr, ns5 ns5Var, String str) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "worker:multi-attaches-downloader", ewi.d(j, "start for ", "/", a.f1(62, jArr)), null);
            }
        }
        String strA = ha9Var.a(ewi.d(j, "worker:multi-attaches-downloader:c=", ";m=", a.f1(62, jArr)), null);
        cdc cdcVar = (cdc) ((androidx.work.a) ((androidx.work.a) ((androidx.work.a) new androidx.work.a(DownloadAttachesWorker.class).setExpedited(yic.a)).addTag("worker:multi-attaches-downloader")).setInputData(f55.t(ha9Var, new ylc(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j)), new ylc("messageIds", jArr), new ylc("attachLocalId", str), new ylc("place", Integer.valueOf(ns5Var.a))))).build();
        ve6 ve6Var = ve6.b;
        a8g a8gVar = xyj.l;
        n19 n19VarB = xyjVar.b(strA, ve6Var, cdcVar);
        n19VarB.N();
        return new xc3(iyl.a(n19VarB.o.O()), 5);
    }
}

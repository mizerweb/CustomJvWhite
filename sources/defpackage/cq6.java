package defpackage;

import androidx.work.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class cq6 {
    public static final /* synthetic */ int f = 0;
    public final xyj a;
    public final ha9 b;
    public final ny8 c;
    public final String d = cq6.class.getName();
    public final ny8 e;

    public cq6(xyj xyjVar, ha9 ha9Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = xyjVar;
        this.b = ha9Var;
        this.c = ny8Var;
        this.e = ny8Var2;
    }

    public final void a(long j, boolean z) {
        try {
            List<gka> listA = ((nka) this.c.getValue()).a(j);
            if (z) {
                List list = listA;
                ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((gka) it.next()).a.c;
                    qrc.m((mii) this.e.getValue(), lii.USER_CANCELLED, str, null, 28);
                    arrayList.add(str);
                }
                cx3.Z0(arrayList, dhi.a);
            }
            for (gka gkaVar : listA) {
                ha9 ha9Var = this.b;
                pia piaVar = gkaVar.a;
                this.a.d(ha9Var.a("UploadFileAttachWorker:" + piaVar.b + ":" + piaVar.a + ":" + piaVar.c, null));
            }
            gm0.m("cq6", "success! cancel attach %d uploads", Integer.valueOf(listA.size()));
        } catch (Throwable th) {
            gm0.V("cq6", "failure to cancel attach uploads", th);
        }
    }

    public final void c(t2 t2Var, long j, long j2, String str) {
        oji ojiVar;
        long jLastModified;
        int i = t2Var.a;
        oji ojiVar2 = oji.UNKNOWN;
        if (i == 1) {
            ojiVar = oji.PHOTO;
        } else if (i == 2) {
            ojiVar = oji.AUDIO;
        } else if (i == 3) {
            ojiVar = oji.VIDEO;
        } else if (i == 7) {
            ojiVar = oji.FILE;
        } else if (i != 10) {
            ojiVar = i != 11 ? ojiVar2 : oji.VIDEO_MESSAGE;
        } else {
            ojiVar = oji.STICKER;
        }
        String str2 = this.d;
        if (ojiVar == ojiVar2) {
            gm0.W(str2, "upload: failed, unknown media type = %s", Integer.valueOf(i));
            return;
        }
        String strA = t2Var.a();
        if (strA == null) {
            gm0.W(str2, "upload: failed, media uri is null, type = %s", Integer.valueOf(i));
            return;
        }
        pia piaVar = new pia(j, j2, str);
        uj6 uj6Var = new uj6();
        uj6Var.c = piaVar;
        uj6Var.d = ojiVar;
        uj6Var.a = strA;
        int i2 = rx8.p;
        if (ch3.r(strA)) {
            jLastModified = 0;
        } else {
            try {
                jLastModified = new File(strA).lastModified();
            } catch (Exception unused) {
                jLastModified = 0;
            }
        }
        uj6Var.b = jLastModified;
        uj6Var.e = qrk.a(t2Var);
        d(new gka(uj6Var));
    }

    public final void d(gka gkaVar) {
        String[] strArr;
        gm0.m("UploadFileAttachWorker", "start %s", gkaVar);
        pia piaVar = gkaVar.a;
        long j = piaVar.b;
        long j2 = piaVar.a;
        String str = piaVar.c;
        StringBuilder sbS = qt4.s(j, "UploadFileAttachWorker:", ":");
        sbS.append(j2);
        sbS.append(":");
        sbS.append(str);
        String string = sbS.toString();
        ha9 ha9Var = this.b;
        String strA = ha9Var.a(string, null);
        a aVar = (a) ((a) ((a) new a(UploadFileAttachWorker.class).setExpedited(yic.a)).setBackoffCriteria(rn0.b, 10000L, TimeUnit.MILLISECONDS)).addTag("UploadFileAttachWorker");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("workName", strA);
        linkedHashMap.put("key.messageId", Long.valueOf(piaVar.a));
        linkedHashMap.put("key.chatId", Long.valueOf(piaVar.b));
        linkedHashMap.put("key.attachLocalId", piaVar.c);
        linkedHashMap.put(ClientCookie.PATH_ATTR, gkaVar.b);
        linkedHashMap.put("lastModified", Long.valueOf(gkaVar.c));
        linkedHashMap.put("uploadType", gkaVar.d.name());
        linkedHashMap.put("local_account_id", Integer.valueOf(ha9Var.a));
        fvi fviVar = gkaVar.e;
        if (fviVar != null) {
            linkedHashMap.put("messageUpload.videoConvertOptions", Boolean.TRUE);
            linkedHashMap.put("messageUpload.videoConvertOptions.quality", fviVar.a.name());
            linkedHashMap.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(fviVar.b));
            linkedHashMap.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(fviVar.c));
            List list = fviVar.d;
            if (list != null && (strArr = (String[]) list.toArray(new String[0])) != null) {
                linkedHashMap.put("messageUpload.videoConvertOptions.fragmentsPaths", strArr);
            }
            linkedHashMap.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(fviVar.e));
        }
        d25 d25Var = new d25(linkedHashMap);
        f55.y(d25Var);
        cdc cdcVar = (cdc) ((a) aVar.setInputData(d25Var)).build();
        a8g a8gVar = xyj.l;
        this.a.b(strA, ve6.b, cdcVar).N();
    }
}

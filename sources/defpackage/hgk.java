package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.IPCInteractor;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.push.SendPushesResult;
import com.vk.push.core.utils.StringExtensionsKt;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hgk implements IPCInteractor {
    public final l4k a;
    public final euc b;
    public final js8 c;
    public final g7k d;
    public final AnalyticsSender e;
    public final CrashReporterRepository f;
    public final dq4 g;
    public final l9b h;
    public final ifh i;
    public final ArrayDeque j;

    public hgk(l4k l4kVar, euc eucVar, js8 js8Var, g7k g7kVar, AnalyticsSender analyticsSender, CrashReporterRepository crashReporterRepository, Logger logger) {
        this.a = l4kVar;
        this.b = eucVar;
        this.c = js8Var;
        this.d = g7kVar;
        this.e = analyticsSender;
        this.f = crashReporterRepository;
        ao5 ao5Var = ao5.a;
        this.g = cqk.a(lb5.c);
        this.h = new l9b();
        this.i = new ifh(new qv(14, logger));
        this.j = new ArrayDeque(10);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #3 {all -> 0x00ed, blocks: (B:31:0x00b8, B:32:0x00c3, B:34:0x00c9, B:36:0x00dc, B:38:0x00e8, B:42:0x00f2, B:44:0x00fc, B:46:0x0102, B:48:0x010e, B:52:0x0117, B:55:0x011d, B:58:0x0135), top: B:79:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8 A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:31:0x00b8, B:32:0x00c3, B:34:0x00c9, B:36:0x00dc, B:38:0x00e8, B:42:0x00f2, B:44:0x00fc, B:46:0x0102, B:48:0x010e, B:52:0x0117, B:55:0x011d, B:58:0x0135), top: B:79:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:31:0x00b8, B:32:0x00c3, B:34:0x00c9, B:36:0x00dc, B:38:0x00e8, B:42:0x00f2, B:44:0x00fc, B:46:0x0102, B:48:0x010e, B:52:0x0117, B:55:0x011d, B:58:0x0135), top: B:79:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0117 A[Catch: all -> 0x00ed, TryCatch #3 {all -> 0x00ed, blocks: (B:31:0x00b8, B:32:0x00c3, B:34:0x00c9, B:36:0x00dc, B:38:0x00e8, B:42:0x00f2, B:44:0x00fc, B:46:0x0102, B:48:0x010e, B:52:0x0117, B:55:0x011d, B:58:0x0135), top: B:79:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[Catch: all -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x011b, blocks: (B:14:0x003e, B:60:0x013e, B:62:0x0144, B:65:0x015c, B:35:0x00d4, B:57:0x012b), top: B:77:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0144 A[Catch: all -> 0x011b, TryCatch #2 {all -> 0x011b, blocks: (B:14:0x003e, B:60:0x013e, B:62:0x0144, B:65:0x015c, B:35:0x00d4, B:57:0x012b), top: B:77:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:0: B:60:0x013e->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [j9b] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [j9b, java.lang.Object] */
    public static final Enum a(hgk hgkVar, List list, nq4 nq4Var) throws Throwable {
        rgk rgkVar;
        ?? r4;
        j9b j9bVar;
        List list2;
        hgk hgkVar2;
        List list3;
        j9b j9bVar2;
        String str;
        ArrayList arrayList;
        List listF1;
        Iterator it;
        List list4;
        String token;
        String strHideSensitive;
        String strHideSensitive2;
        RemoteMessage remoteMessage;
        hgk hgkVar3 = hgkVar;
        if (nq4Var instanceof rgk) {
            rgkVar = (rgk) nq4Var;
            int i = rgkVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rgkVar.j = i - Integer.MIN_VALUE;
            } else {
                rgkVar = new rgk(hgkVar3, nq4Var);
            }
        } else {
            rgkVar = new rgk(hgkVar3, nq4Var);
        }
        Object obj = rgkVar.h;
        ?? r5 = rgkVar.j;
        hu4 hu4Var = hu4.a;
        try {
            try {
                if (r5 == 0) {
                    ch3.d0(obj);
                    j9bVar = hgkVar3.h;
                    rgkVar.d = hgkVar3;
                    list2 = list;
                    rgkVar.e = list2;
                    rgkVar.f = j9bVar;
                    rgkVar.j = 1;
                    if (j9bVar.b(rgkVar) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (r5 != 1) {
                    if (r5 == 2) {
                        j9b j9bVar3 = (j9b) rgkVar.f;
                        list3 = (List) rgkVar.e;
                        hgk hgkVar4 = rgkVar.d;
                        try {
                            ch3.d0(obj);
                            hgkVar2 = hgkVar4;
                            j9bVar2 = j9bVar3;
                            try {
                                str = (String) obj;
                                arrayList = new ArrayList();
                                for (Object obj2 : list3) {
                                    token = ((RemoteMessage) obj2).getToken();
                                    Logger logger = (Logger) hgkVar2.i.getValue();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Received for token ");
                                    if (token != null) {
                                        strHideSensitive = StringExtensionsKt.hideSensitive(token);
                                    } else {
                                        strHideSensitive = null;
                                    }
                                    sb.append(strHideSensitive);
                                    sb.append(", current token = ");
                                    if (str != null) {
                                        strHideSensitive2 = StringExtensionsKt.hideSensitive(str);
                                    } else {
                                        strHideSensitive2 = null;
                                    }
                                    sb.append(strHideSensitive2);
                                    Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
                                    if (token != null || token.equals(str)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                listF1 = ww3.F1(list3, ww3.X1(arrayList));
                                if (!listF1.isEmpty()) {
                                    hgkVar2.e.send(new gdk(str, listF1));
                                }
                                it = arrayList.iterator();
                                list4 = arrayList;
                                r5 = j9bVar2;
                            } catch (Throwable th) {
                                th = th;
                                j9bVar3 = j9bVar2;
                                r4 = j9bVar3;
                                r4.g(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = j9bVar3;
                            r4.g(null);
                            throw th;
                        }
                    } else {
                        if (r5 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list4 = rgkVar.g;
                        it = (Iterator) rgkVar.f;
                        j9b j9bVar4 = (j9b) rgkVar.e;
                        hgkVar2 = rgkVar.d;
                        ch3.d0(obj);
                        r5 = j9bVar4;
                    }
                    while (it.hasNext()) {
                        remoteMessage = (RemoteMessage) it.next();
                        rgkVar.d = hgkVar2;
                        rgkVar.e = r5;
                        rgkVar.f = it;
                        rgkVar.g = list4;
                        rgkVar.j = 3;
                        if (hgkVar2.b(remoteMessage, rgkVar) == hu4Var) {
                            return hu4Var;
                        }
                    }
                    Logger.DefaultImpls.info$default((Logger) hgkVar2.i.getValue(), "Handled " + list4.size() + " messages", null, 2, null);
                    r5.g(null);
                    return SendPushesResult.OK;
                }
                j9b j9bVar5 = (j9b) rgkVar.f;
                list2 = (List) rgkVar.e;
                hgk hgkVar5 = rgkVar.d;
                ch3.d0(obj);
                j9bVar = j9bVar5;
                hgkVar3 = hgkVar5;
                Logger.DefaultImpls.info$default((Logger) hgkVar3.i.getValue(), "Receive " + list2.size() + " messages", null, 2, null);
                g7k g7kVar = hgkVar3.d;
                rgkVar.d = hgkVar3;
                rgkVar.e = list2;
                rgkVar.f = j9bVar;
                rgkVar.j = 2;
                Object objA = g7kVar.a(rgkVar);
                if (objA != hu4Var) {
                    hgkVar2 = hgkVar3;
                    list3 = list2;
                    j9bVar2 = j9bVar;
                    obj = objA;
                    str = (String) obj;
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        token = ((RemoteMessage) obj2).getToken();
                        Logger logger2 = (Logger) hgkVar2.i.getValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Received for token ");
                        if (token != null) {
                            strHideSensitive = StringExtensionsKt.hideSensitive(token);
                        } else {
                            strHideSensitive = null;
                        }
                        sb2.append(strHideSensitive);
                        sb2.append(", current token = ");
                        if (str != null) {
                            strHideSensitive2 = StringExtensionsKt.hideSensitive(str);
                        } else {
                            strHideSensitive2 = null;
                        }
                        sb2.append(strHideSensitive2);
                        Logger.DefaultImpls.info$default(logger2, sb2.toString(), null, 2, null);
                        if (token != null) {
                            arrayList.add(obj2);
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                    listF1 = ww3.F1(list3, ww3.X1(arrayList));
                    if (!listF1.isEmpty()) {
                        hgkVar2.e.send(new gdk(str, listF1));
                    }
                    it = arrayList.iterator();
                    list4 = arrayList;
                    r5 = j9bVar2;
                    while (it.hasNext()) {
                        remoteMessage = (RemoteMessage) it.next();
                        rgkVar.d = hgkVar2;
                        rgkVar.e = r5;
                        rgkVar.f = it;
                        rgkVar.g = list4;
                        rgkVar.j = 3;
                        if (hgkVar2.b(remoteMessage, rgkVar) == hu4Var) {
                        }
                    }
                    Logger.DefaultImpls.info$default((Logger) hgkVar2.i.getValue(), "Handled " + list4.size() + " messages", null, 2, null);
                    r5.g(null);
                    return SendPushesResult.OK;
                }
                return hu4Var;
            } catch (Throwable th3) {
                th = th3;
                r4 = j9bVar;
                r4.g(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r4 = r5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab A[PHI: r0 r1
  0x01ab: PHI (r0v3 hgk) = (r0v0 hgk), (r0v0 hgk), (r0v0 hgk), (r0v6 hgk) binds: [B:41:0x00d3, B:59:0x016d, B:66:0x0182, B:71:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r1v3 com.vk.push.common.messaging.RemoteMessage) = 
  (r1v0 com.vk.push.common.messaging.RemoteMessage)
  (r1v0 com.vk.push.common.messaging.RemoteMessage)
  (r1v0 com.vk.push.common.messaging.RemoteMessage)
  (r1v4 com.vk.push.common.messaging.RemoteMessage)
 binds: [B:41:0x00d3, B:59:0x016d, B:66:0x0182, B:71:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019e, code lost:
    
        if (r2.a(r5, r6, r7, r8, r9) == r13) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.vk.push.common.messaging.RemoteMessage r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgk.b(com.vk.push.common.messaging.RemoteMessage, nq4):java.lang.Object");
    }

    @Override // com.vk.push.core.IPCInteractor
    public final void onDestroy() {
        Logger.DefaultImpls.info$default((Logger) this.i.getValue(), "onDestroy", null, 2, null);
        cqk.g(this.g);
    }
}

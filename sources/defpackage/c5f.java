package defpackage;

import android.util.Base64;
import android.view.Surface;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.userlifecycle.o.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c5f implements StatsObserver, rg4, i8c, ygh, s72, r89, tg4, hfh, u00, u8g, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c5f(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 5:
                ((AtomicReference) obj).set(r72Var);
                return "SurfaceRequest-surface-recreation(" + ((ich) obj2).hashCode() + ")";
            default:
                bph bphVar = (bph) obj2;
                Surface surface = (Surface) obj;
                tvj.a("TextureViewImpl", "Surface set on Preview.");
                bphVar.h.b(surface, zjl.a(), new mx1(5, r72Var));
                return "provideSurface[request=" + bphVar.h + " surface=" + surface + "]";
        }
    }

    @Override // defpackage.hfh
    public Object a() {
        int i = this.a;
        Object obj = this.c;
        z18 z18Var = (z18) this.b;
        switch (i) {
            case 11:
                Iterable iterable = (Iterable) obj;
                uxe uxeVar = (uxe) z18Var.c;
                uxeVar.getClass();
                if (iterable.iterator().hasNext()) {
                    uxeVar.l().compileStatement("DELETE FROM events WHERE _id in ".concat(uxe.P(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((uxe) z18Var.i).I(((Integer) entry.getValue()).intValue(), he9.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        Object poeVar;
        Object poeVar2;
        Object poeVar3;
        Object poeVar4;
        Object poeVar5;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 2:
                zzf zzfVar = (zzf) obj3;
                String str = (String) obj2;
                JavaAudioDeviceModule javaAudioDeviceModule = zzfVar.j;
                if (javaAudioDeviceModule != null) {
                    zzfVar.b.log("SharedPeerConnectionFac", "Restart audio recording after error: " + str);
                    javaAudioDeviceModule.restartAudioRecording(true);
                    break;
                }
                break;
            default:
                kka kkaVar = (kka) obj3;
                UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) obj2;
                c60 c60Var = (c60) obj;
                c60Var.k = 100.0f;
                c60Var.i = u60.c;
                y60 y60Var = c60Var.a;
                int i2 = y60Var == null ? -1 : fhi.$EnumSwitchMapping$0[y60Var.ordinal()];
                if (i2 == 1) {
                    vfi vfiVar = kkaVar.a;
                    zii ziiVar = vfiVar.h;
                    String str2 = vfiVar.b;
                    String str3 = ziiVar.a;
                    o60 o60Var = c60Var.b;
                    if (o60Var == null) {
                        o60Var = o60.l;
                    }
                    n60 n60VarC = o60Var.c();
                    n60VarC.h = str3;
                    c60Var.b = new o60(n60VarC);
                    boolean zK0 = z5h.K0(str2, ju6.j(((ju6) ((rs6) uploadFileAttachWorker.B.getValue())).n().getPath(), "sharedQr").getPath(), false);
                    if (zK0) {
                        try {
                            File file = new File(str2);
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (IOException e) {
                            gm0.l(str2.getClass().getName(), "Не удалось удалить файл ".concat(str2), e);
                        } catch (SecurityException e2) {
                            gm0.l(str2.getClass().getName(), "Не удалось удалить файл ".concat(str2), e2);
                        }
                    }
                    c60Var.m = zK0 ? null : str2;
                    try {
                        poeVar = Long.valueOf(new File(str2).lastModified());
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    c60Var.u = ((Number) (poeVar instanceof poe ? 0L : poeVar)).longValue();
                    break;
                } else if (i2 == 2) {
                    zii ziiVar2 = kkaVar.a.h;
                    long j = ziiVar2.b;
                    String str4 = ziiVar2.a;
                    b60 b60Var = c60Var.e;
                    if (b60Var == null) {
                        b60Var = b60.j;
                    }
                    a60 a60VarA = b60Var.a();
                    a60VarA.e = str4;
                    a60VarA.a = j;
                    c60Var.e = new b60(a60VarA);
                    String str5 = kkaVar.a.b;
                    c60Var.m = str5;
                    try {
                        poeVar2 = Long.valueOf(new File(str5).lastModified());
                    } catch (Throwable th2) {
                        poeVar2 = new poe(th2);
                    }
                    c60Var.u = ((Number) (poeVar2 instanceof poe ? 0L : poeVar2)).longValue();
                    break;
                } else if (i2 == 3) {
                    zii ziiVar3 = kkaVar.a.h;
                    long j2 = ziiVar3.b;
                    String str6 = ziiVar3.a;
                    String str7 = ziiVar3.c;
                    byte[] bArrDecode = str7 != null ? Base64.decode(str7, 2) : null;
                    z60 z60VarA = c60Var.c().a();
                    z60VarA.a = j2;
                    z60VarA.n = str6;
                    z60VarA.k = bArrDecode;
                    c60Var.d = new d70(z60VarA);
                    String str8 = kkaVar.a.b;
                    c60Var.m = str8;
                    try {
                        poeVar3 = Long.valueOf(new File(str8).lastModified());
                    } catch (Throwable th3) {
                        poeVar3 = new poe(th3);
                    }
                    c60Var.u = ((Number) (poeVar3 instanceof poe ? 0L : poeVar3)).longValue();
                    break;
                } else if (i2 == 4) {
                    zii ziiVar4 = kkaVar.a.h;
                    long j3 = ziiVar4.b;
                    String str9 = ziiVar4.a;
                    i60 i60VarA = c60Var.b().a();
                    i60VarA.a = j3;
                    i60VarA.e = str9;
                    c60Var.r = new j60(i60VarA);
                    String str10 = kkaVar.a.b;
                    c60Var.m = str10;
                    try {
                        poeVar4 = Long.valueOf(new File(str10).lastModified());
                    } catch (Throwable th4) {
                        poeVar4 = new poe(th4);
                    }
                    c60Var.u = ((Number) (poeVar4 instanceof poe ? 0L : poeVar4)).longValue();
                    break;
                } else if (i2 == 5) {
                    c60Var.f = pm9.p(kkaVar.b);
                    String str11 = kkaVar.a.b;
                    c60Var.m = str11;
                    try {
                        poeVar5 = Long.valueOf(new File(str11).lastModified());
                    } catch (Throwable th5) {
                        poeVar5 = new poe(th5);
                    }
                    c60Var.u = ((Number) (poeVar5 instanceof poe ? 0L : poeVar5)).longValue();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.u00
    public e89 apply(Object obj) {
        ia iaVar = (ia) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        vuf vufVar = (vuf) iaVar.d;
        Integer num = (Integer) ((hl2) arrayList.get(0)).b.b(hl2.g, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((hl2) arrayList.get(0)).b.b(hl2.f, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        xde xdeVar = ((q4h) vufVar.b).z;
        return xdeVar != null ? ((dch) xdeVar.b).c(iIntValue, iIntValue2) : new g88(1, new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // defpackage.ygh
    public void b(ugh ughVar, int i) {
        aac aacVar = (aac) this.b;
        StoryViewsBottomSheet storyViewsBottomSheet = (StoryViewsBottomSheet) this.c;
        zv8[] zv8VarArr = StoryViewsBottomSheet.H;
        z9c z9cVar = new z9c(aacVar.getContext());
        z9cVar.setCustomTheme(storyViewsBottomSheet.t1());
        ughVar.b(z9cVar);
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) {
        WaitingRoomParticipants.resolveInternalIdSingle$lambda$0((WaitingRoomParticipants) this.b, (ConversationWaitingParticipantId) this.c, b8gVar);
    }

    public void d() {
        ((v56) this.b).K(new bpg(20, (vuf) this.c));
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 15:
                return ((a) obj2).a((Map) obj, insertEventTools);
            default:
                return ((d) obj2).a((String) obj, insertEventTools);
        }
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        wif wifVar = (wif) this.b;
        wig wigVar = (wig) this.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                boolean z = false;
                boolean z2 = false;
                for (StatsReport.Value value : statsReport.values) {
                    if ("googTrackId".equals(value.name)) {
                        String str = value.value;
                        if (str != null && str.endsWith("audio-mix")) {
                            arrayList2.add(new w3k(null, true, false, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        yt1 yt1VarN = kql.N(value.value);
                        szf szfVar = wifVar.g;
                        sb9 sb9Var = szfVar != null ? szfVar.o : null;
                        if (yt1VarN != null) {
                            arrayList2.add(new w3k(yt1VarN, false, false, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        String str2 = value.value;
                        if (str2 != null && sb9Var != null && str2.startsWith(sb9Var.m)) {
                            arrayList2.add(new w3k(null, false, false, true));
                            arrayList.add(statsReport);
                            break;
                        }
                    } else if ("mediaType".equals(value.name) && MediaStreamTrack.AUDIO_TRACK_KIND.equals(value.value)) {
                        z = true;
                    } else if ("packetsReceived".equals(value.name)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        arrayList2.add(new w3k(null, true, false, false));
                        arrayList.add(statsReport);
                        break;
                    }
                }
            }
        }
        wifVar.a.post(new h82(wifVar, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), arrayList2, wigVar, 6));
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        s3g s3gVar = (s3g) this.b;
        wre wreVar = (wre) this.c;
        s3gVar.invoke();
        int i = ccg.$EnumSwitchMapping$0[j8cVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            wreVar.invoke();
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        g2i g2iVar = (g2i) this.b;
        nh6 nh6Var = (nh6) this.c;
        g2iVar.u.getClass();
        ((e2i) obj).a(nh6Var);
    }
}

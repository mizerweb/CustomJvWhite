package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import androidx.work.impl.WorkDatabase;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.video.transcoder.exception.TranscoderException;
import one.video.transloader.TranscodingUploader;
import one.video.transloader.task.TranscodeTask;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i8f implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i8f(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01a2  */
    @Override // defpackage.af7
    public final Object invoke() {
        int i;
        y9f y9fVar = null;
        switch (this.a) {
            case 0:
                l8f l8fVar = (l8f) this.b;
                ny8 ny8Var = (ny8) this.c;
                Context context = (Context) this.d;
                qw2 qw2Var = (qw2) l8fVar.c.getValue();
                no4 no4Var = (no4) l8fVar.a.getValue();
                e8f e8fVar = (e8f) ny8Var.getValue();
                mm4 mm4Var = (mm4) l8fVar.b.getValue();
                daf dafVar = (daf) l8fVar.d.getValue();
                String[] stringArray = context.getResources().getStringArray(R.array.oneme_prefs_saved_messages_aliases);
                x9f x9fVar = new x9f(qw2Var, no4Var, mm4Var, dafVar);
                if (stringArray != null) {
                    if (stringArray.length == 0) {
                        stringArray = null;
                    }
                    if (stringArray != null) {
                        y9fVar = new y9f(stringArray, qw2Var, dafVar);
                    }
                }
                return new u9f(qw2Var, e8fVar, dafVar, x9fVar, y9fVar);
            case 1:
                return SessionRoomParticipantsDataProviderImpl.getAllInRoomParticipants$lambda$0((Set) this.b, (SessionRoomParticipantsDataProviderImpl) this.c, (cf7) this.d);
            case 2:
                ((ew3) this.b).n1.invoke(new dna((h8g) this.c, ((MessageModel) this.d).a, null));
                return sbi.a;
            case 3:
                ((ew3) this.b).n1.invoke(new dna((h8g) this.c, ((MessageModel) this.d).a, null));
                return sbi.a;
            case 4:
                return StereoRoomHandsQueueImpl.loadHandsQueue$lambda$0$1((List) this.b, (af7) this.c, (StereoRoomHandsQueueImpl) this.d);
            case 5:
                ((SuggestionsWidget) this.b).J1().G(new r9h(((izb) this.c).getAnchorButton(), (u9h) this.d));
                return sbi.a;
            case 6:
                ((rj5) this.b).O(new TranscoderException((String) this.c, (ExportException) this.d));
                return sbi.a;
            case 7:
                ((TranscodingUploader) this.b).a((RandomAccessFile) this.c, (AtomicBoolean) this.d);
                return sbi.a;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                TranscodingUploader transcodingUploader = (TranscodingUploader) this.c;
                l3i l3iVar = (l3i) this.d;
                sbi sbiVar = sbi.a;
                if (!atomicBoolean.get()) {
                    transcodingUploader.verifyThread("one.video.transloader.TranscodingUploader.<get-transLoadQueue>");
                    transcodingUploader.f.remove(l3iVar);
                    TranscodeTask transcodeTask = l3iVar.b;
                    transcodeTask.verifyThread("one.video.transloader.task.TranscodeTask.cancel");
                    if (!transcodeTask.b()) {
                        transcodeTask.c(zzh.a);
                        c5f c5fVar = transcodeTask.i;
                        if (c5fVar != null) {
                            c5fVar.d();
                            transcodeTask.i = null;
                        }
                    }
                    l3iVar.c.a();
                }
                return sbiVar;
            case 9:
                zgi zgiVar = (zgi) this.b;
                vfi vfiVar = (vfi) this.c;
                kp4 kp4Var = (kp4) this.d;
                u1i u1iVar = zgiVar.a;
                String str = vfiVar.a.a;
                String str2 = kp4Var.b;
                h4c h4cVar = (h4c) ((c2a) u1iVar.e.getValue());
                return l21.c(h4cVar.a, h4cVar.b, str, str2);
            case 10:
                nmf nmfVar = (nmf) this.b;
                we2 we2Var = (we2) this.c;
                iq7 iq7Var = (iq7) this.d;
                lmf lmfVar = ((kmf) nmfVar.e.getValue()).c() ? (lmf) nmfVar.f.getValue() : null;
                if (lmfVar != null) {
                    int i2 = lmfVar.h;
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 0) {
                        i = 0;
                    } else {
                        if (i2 == 0 || i2 == 1) {
                            Log.e("CXCP", "Custom operating mode " + i2 + " conflicts with standard modes");
                            ore.p("kotlin.Unit");
                            return null;
                        }
                        i = i2;
                    }
                } else {
                    i = 0;
                }
                return we2Var.a(i, lmfVar, false, iq7Var, null, (Map) nmfVar.c.getValue(), (Map) nmfVar.d.getValue());
            case 11:
                ich ichVar = (ich) this.b;
                t0j t0jVar = (t0j) this.c;
                fx5 fx5Var = (fx5) this.d;
                Size size = ichVar.b;
                boolean zK = ichVar.e.k();
                String str3 = t0jVar.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str3, "onInputSurface, surface_request_resolution=" + size + ", dr=" + fx5Var + ", isFrontCamera=" + zK, null);
                    }
                }
                h1j h1jVar = t0jVar.j;
                if (h1jVar == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                xg7.d((AtomicBoolean) h1jVar.b, true);
                xg7.c((Thread) h1jVar.d);
                SurfaceTexture surfaceTexture = new SurfaceTexture(h1jVar.a);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                t0jVar.l++;
                ichVar.c(t0jVar.e, new h6f(t0jVar, fx5Var));
                ichVar.b(surface, t0jVar.e, new s0j(t0jVar, ichVar, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(new p0j(t0jVar, zK), t0jVar.d);
                return sbi.a;
            case 12:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                yab.i0(videoMessageWidget.getViewLifecycleScope(), null, 0, new p7g(videoMessageWidget, (ufe) this.c, (cyi) this.d, null, 25), 3);
                return sbi.a;
            case 13:
                stj stjVar = (stj) this.b;
                return new ltj(stjVar.a, stjVar.b, stjVar.c, (gjf) this.c, (iv4) this.d);
            default:
                gzj gzjVar = (gzj) this.b;
                UUID uuid = (UUID) this.c;
                d25 d25Var = (d25) this.d;
                gzjVar.getClass();
                String string = uuid.toString();
                n1g n1gVarX = n1g.x();
                String str4 = gzj.c;
                n1gVarX.p(str4, "Updating progress for " + uuid + " (" + d25Var + ")");
                WorkDatabase workDatabase = gzjVar.a;
                workDatabase.b();
                try {
                    mzj mzjVarD = workDatabase.x().d(string);
                    if (mzjVarD == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (mzjVarD.b == kyj.b) {
                        dzj dzjVar = new dzj(string, d25Var);
                        fzj fzjVarW = workDatabase.w();
                        ch3.G(fzjVarW.a, false, true, new aoj(fzjVarW, 1, dzjVar));
                    } else {
                        n1g.x().j0(str4, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    workDatabase.f();
                    return null;
                } catch (Throwable th) {
                    try {
                        n1g.x().t(str4, "Error updating Worker progress", th);
                        throw th;
                    } catch (Throwable th2) {
                        workDatabase.f();
                        throw th2;
                    }
                }
        }
    }
}

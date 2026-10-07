package defpackage;

import android.graphics.Bitmap;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.gson.Gson;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.b;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.AudioTrack;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.onelog.OneLogImpl;
import ru.ok.android.onelog.OneLogTrigger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i7b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i7b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        List listA;
        yjh yjhVar;
        String str = null;
        switch (this.a) {
            case 0:
                ((n7b) this.b).e.a((VideoFrameProcessingException) this.c);
                return;
            case 1:
                b bVar = (b) this.b;
                DataQuery dataQuery = (DataQuery) this.c;
                g85 g85Var = bVar.g;
                SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = (SharedPreferencesUpdateTimetable) g85Var.c;
                NetworkDataRetriever networkDataRetriever = (NetworkDataRetriever) g85Var.b;
                DataId dataId = bVar.d;
                OmicronConfig omicronConfig = bVar.c;
                if (sharedPreferencesUpdateTimetable.shouldUpdate(dataId, omicronConfig.g, TimeUnit.MINUTES)) {
                    int i = zsb.b[networkDataRetriever.retrieve(dataId, dataQuery).ordinal()];
                    if (i == 1) {
                        ((SerializationDataStorage) g85Var.a).putData(dataId, networkDataRetriever.getData());
                        bVar.a.set(networkDataRetriever.getData());
                        omicronConfig.f.onCacheUpdated(dataId);
                    } else if (i != 2) {
                        return;
                    }
                    sharedPreferencesUpdateTimetable.setUpdateDate(dataId, ((TimeProvider) g85Var.d).getCurrentDate());
                    return;
                }
                return;
            case 2:
                OneLogImpl.lambda$startUpload$1((String) this.b, (OneLogTrigger) this.c);
                return;
            case 3:
                ll5 ll5Var = (ll5) this.b;
                wfe wfeVar = (wfe) this.c;
                ViewGroup viewGroup = (ViewGroup) ((WeakReference) ll5Var.c).get();
                if (viewGroup != null) {
                    viewGroup.removeView((reh) ll5Var.e);
                }
                ll5Var.e = null;
                ll5Var.f = null;
                bdc bdcVar = (bdc) wfeVar.a;
                if (bdcVar != null) {
                    bdcVar.b();
                    return;
                }
                return;
            case 4:
                qpc qpcVar = (qpc) this.b;
                CandidatePairChangeEvent candidatePairChangeEvent = (CandidatePairChangeEvent) this.c;
                n91 n91VarB = qpcVar.B();
                if (n91VarB != null) {
                    n91VarB.onSelectedCandidatePairChanged(candidatePairChangeEvent);
                    return;
                }
                return;
            case 5:
                qpc qpcVar2 = (qpc) this.b;
                PeerConnection.IceGatheringState iceGatheringState = (PeerConnection.IceGatheringState) this.c;
                n91 n91VarB2 = qpcVar2.B();
                if (n91VarB2 != null) {
                    n91VarB2.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
                    return;
                }
                return;
            case 6:
                qpc qpcVar3 = (qpc) this.b;
                PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) this.c;
                n91 n91VarB3 = qpcVar3.B();
                if (n91VarB3 != null) {
                    n91VarB3.onPeerConnectionSignalingStateChanged(signalingState);
                }
                qpcVar3.X = signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || signalingState == PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER || signalingState == PeerConnection.SignalingState.STABLE;
                boolean z = signalingState == PeerConnection.SignalingState.STABLE;
                qpcVar3.Y = z;
                if (z) {
                    qpcVar3.j(new njk(qpcVar3, 1));
                }
                ppc ppcVar = qpcVar3.J;
                if (ppcVar != null) {
                    ppcVar.d(qpcVar3, signalingState);
                    return;
                }
                return;
            case 7:
                qpc qpcVar4 = (qpc) this.b;
                IceCandidateErrorEvent iceCandidateErrorEvent = (IceCandidateErrorEvent) this.c;
                n91 n91VarB4 = qpcVar4.B();
                if (n91VarB4 != null) {
                    c7k c7kVar = qpcVar4.p;
                    c7kVar.getClass();
                    String str2 = iceCandidateErrorEvent.address;
                    str2.getClass();
                    String str3 = iceCandidateErrorEvent.url;
                    str3.getClass();
                    String str4 = iceCandidateErrorEvent.errorText;
                    if (str4 == null) {
                        str4 = "empty description";
                    }
                    String str5 = str4;
                    int i2 = iceCandidateErrorEvent.errorCode;
                    String str6 = iceCandidateErrorEvent.url;
                    if (str6 != null) {
                        yki ykiVar = (yki) c7kVar.b;
                        ykiVar.getClass();
                        tn9 tn9VarA = lge.a((lge) ykiVar.a, str6);
                        if (tn9VarA != null && (listA = tn9VarA.a()) != null) {
                            str = (String) ((sn9) listA).get(1);
                        }
                    }
                    n91VarB4.onIceCandidateGatheringFailed(new o38(i2, str2, str3, str5, str));
                    return;
                }
                return;
            case 8:
                qpc qpcVar5 = (qpc) this.b;
                PeerConnection.IceConnectionState iceConnectionState = (PeerConnection.IceConnectionState) this.c;
                if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
                    qpcVar5.j(new njk(qpcVar5, 0));
                }
                ppc ppcVar2 = qpcVar5.J;
                if (ppcVar2 != null) {
                    ppcVar2.o(qpcVar5, iceConnectionState);
                    return;
                }
                return;
            case 9:
                qpc qpcVar6 = (qpc) this.b;
                PeerConnection.PeerConnectionState peerConnectionState = (PeerConnection.PeerConnectionState) this.c;
                n91 n91VarB5 = qpcVar6.B();
                if (n91VarB5 != null) {
                    n91VarB5.onPeerConnectionStateChanged(peerConnectionState, null);
                    return;
                }
                return;
            case 10:
                qpc qpcVar7 = (qpc) this.b;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.c;
                if (qpcVar7.J != null) {
                    Iterator<AudioTrack> it = mediaStreamArr[0].audioTracks.iterator();
                    while (it.hasNext()) {
                        qpcVar7.J.b(it.next().id());
                    }
                    return;
                }
                return;
            case 11:
                qpc qpcVar8 = (qpc) this.b;
                String str7 = (String) this.c;
                ppc ppcVar3 = qpcVar8.J;
                if (ppcVar3 != null) {
                    ppcVar3.c(qpcVar8, str7);
                    return;
                }
                return;
            case 12:
                qpc qpcVar9 = (qpc) this.b;
                IceCandidate iceCandidate = (IceCandidate) this.c;
                n91 n91VarB6 = qpcVar9.B();
                if (n91VarB6 != null) {
                    n91VarB6.onLocalCandidateCreated(iceCandidate.sdp);
                }
                ppc ppcVar4 = qpcVar9.J;
                if (ppcVar4 != null) {
                    ppcVar4.m(qpcVar9, iceCandidate);
                    return;
                }
                return;
            case 13:
                qpc qpcVar10 = (qpc) this.b;
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                ppc ppcVar5 = qpcVar10.J;
                if (ppcVar5 != null) {
                    ppcVar5.k(qpcVar10, iceCandidateArr);
                    return;
                }
                return;
            case 14:
                PhotoEditScreen photoEditScreen = (PhotoEditScreen) this.b;
                View view = (View) this.c;
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                if (photoEditScreen.isAttached()) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 15:
                ((h4j) this.b).c((k4j) this.c);
                return;
            case 16:
                wm5 wm5Var = (wm5) this.b;
                jf jfVar = ((dfd) this.c).c;
                try {
                    if (!wm5Var.g) {
                        Log.d("PreloadDiskCacheManager", "Task " + wm5Var.f() + " started. task type: " + wm5Var.getClass().getName());
                        wm5Var.run();
                        wm5Var.get();
                        Log.d("PreloadDiskCacheManager", "Task " + wm5Var.f() + " finished. task type: " + wm5Var.getClass().getName());
                    }
                    yjhVar = new yjh(wm5Var.f(), wm5Var.getClass());
                    break;
                } catch (Exception e) {
                    Log.d("PreloadDiskCacheManager", "Task failed: " + e.getMessage() + ". task type: " + wm5Var.getClass().getName());
                    yjhVar = new yjh(wm5Var.f(), wm5Var.getClass());
                } finally {
                    jfVar.obtainMessage(9, new yjh(wm5Var.f(), wm5Var.getClass())).sendToTarget();
                }
                Message messageObtainMessage = jfVar.obtainMessage(9, yjhVar);
                return;
            case 17:
                igd igdVar = (igd) this.b;
                pf2 pf2Var = (pf2) this.c;
                zbh zbhVar = igdVar.y;
                wxl.a();
                if (pf2Var == igdVar.e()) {
                    zbhVar.e();
                    return;
                }
                return;
            case 18:
                ((hgd) this.b).b((ich) this.c);
                return;
            case 19:
                ((ghd) ((c7k) this.b).b).o.b((ich) this.c);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                hjd hjdVar = (hjd) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                tvj.e("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + hjdVar.a);
                qme qmeVar = hjdVar.g;
                wxl.a();
                if (qmeVar.g) {
                    return;
                }
                gj0 gj0Var = qmeVar.a;
                gj0Var.c.execute(new ff(gj0Var, 13, bitmap));
                return;
            case 21:
                hjd hjdVar2 = (hjd) this.b;
                l78 l78Var = (l78) this.c;
                tvj.e("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + hjdVar2.a);
                qme qmeVar2 = hjdVar2.g;
                wxl.a();
                if (qmeVar2.g) {
                    l78Var.close();
                    return;
                }
                qyj.l("onImageCaptured() must be called before onFinalResult()", qmeVar2.c.b.isDone());
                qmeVar2.a();
                gj0 gj0Var2 = qmeVar2.a;
                gj0Var2.c.execute(new ewg(gj0Var2, 6, l78Var));
                return;
            case 22:
                hjd hjdVar3 = (hjd) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                tvj.i("ProcessingRequest", "onProcessFailure: request ID = " + hjdVar3.a, imageCaptureException);
                qme qmeVar3 = hjdVar3.g;
                wxl.a();
                if (qmeVar3.g) {
                    return;
                }
                qyj.l("onImageCaptured() must be called before onFinalResult()", qmeVar3.c.b.isDone());
                qmeVar3.a();
                wxl.a();
                gj0 gj0Var3 = qmeVar3.a;
                gj0Var3.c.execute(new ewg(gj0Var3, 5, imageCaptureException));
                return;
            case 23:
                ijd ijdVar = (ijd) this.b;
                iyj iyjVar = (iyj) this.c;
                synchronized (ijdVar.k) {
                    try {
                        Iterator it2 = ijdVar.j.iterator();
                        while (it2.hasNext()) {
                            ((md6) it2.next()).a(iyjVar, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 24:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) this.b;
                List list = (List) this.c;
                if (profileEditScreen.getView() != null) {
                    ProfileEditScreen.o1(profileEditScreen).X();
                    List<vnd> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        return;
                    }
                    for (vnd vndVar : list2) {
                        f8 f8Var = vndVar instanceof f8 ? (f8) vndVar : null;
                        if (f8Var != null && f8Var.a == R.id.profile_edit_comments_toggle) {
                            xb9 xb9Var = (xb9) ((et3) profileEditScreen.c.getValue());
                            xb9Var.Y0.B(xb9Var, xb9.g1[42], Boolean.TRUE);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 25:
                ((vvd) this.b).E((xbf) this.c);
                return;
            case 26:
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.b;
                Throwable th2 = (Throwable) this.c;
                Gson gson = RLottieDrawable.gson;
                Iterator it3 = new ArrayList(rLottieDrawable.S1).iterator();
                while (it3.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it3.next()).onError(th2);
                }
                return;
            case 27:
                v6e v6eVar = (v6e) this.b;
                af7 af7Var = (af7) this.c;
                v6eVar.e.X();
                if (af7Var != null) {
                    af7Var.invoke();
                    return;
                }
                return;
            case 28:
                ((RecordManagerImpl) this.b).applyRecordStarted((hw1) this.c);
                return;
            default:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
        }
    }
}
